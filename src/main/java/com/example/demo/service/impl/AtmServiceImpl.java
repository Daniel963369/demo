package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.Repository.AtmDao;
import com.example.demo.constants.RtnCode;
import com.example.demo.entity.Atm;
import com.example.demo.service.ifs.AtmService;
import com.example.demo.vo.AtmResponse;

@Service
public class AtmServiceImpl implements AtmService {
	
	@Autowired
	private AtmDao atmDao;

	@Override
	public AtmResponse addInfo(String account, String pwd) {
		if(!StringUtils.hasText(account) || !StringUtils.hasText(pwd)) {
//			return new AtmResponse(RtnCode.PARAM_ERROR.getCode(),RtnCode.PARAM_ERROR.getMessage(),null);
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		
		if(atmDao.existsById(account)) {
			return new AtmResponse(null,RtnCode.ACCOUNT_EXISTED);
		}
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Atm res =atmDao.save(new Atm(account,encoder.encode(pwd)));
		res.setPwd("");
		return new AtmResponse(res,RtnCode.SUCCESSFUL);
	}

	@Override
	public AtmResponse getBalanceByAccount(String account,String pwd) {
		if(!StringUtils.hasText(account)) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		Optional<Atm> atmOp = atmDao.findById(account);
		if(atmOp.isEmpty()) {
			return new AtmResponse(null,RtnCode.Account_NOT_FOUND);
		}
		Atm res = atmOp.get();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(!encoder.matches(pwd, res.getPwd())) {
			return new AtmResponse(null,RtnCode.Account_NOT_FOUND);
		}
		res.setPwd("");
		return new AtmResponse(res,RtnCode.SUCCESSFUL);
	}

	@Override
	public AtmResponse updatePwd(String account, String oldPwd, String newPwd) {
		if(!StringUtils.hasText(account)|| !StringUtils.hasText(oldPwd) || !StringUtils.hasText(newPwd)){
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		Optional<Atm> atmOp = atmDao.findById(account);
		if(atmOp.isEmpty()) {
			return new AtmResponse(null,RtnCode.Account_NOT_FOUND);
		}
		Atm res = atmOp.get();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(!encoder.matches(oldPwd, res.getPwd())) {
			return new AtmResponse(null,RtnCode.Account_NOT_FOUND);
		}
		res.setPwd(encoder.encode(newPwd));
		res = atmDao.save(res);
		res.setPwd("");
		return new AtmResponse(res,RtnCode.SUCCESSFUL);
	}

	@Override
	public AtmResponse deposit(String account, String pwd, int amount) {
		if(!StringUtils.hasText(account) || !StringUtils.hasText(pwd)) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		Optional<Atm> atmOp = atmDao.findById(account);
		if(atmOp.isEmpty()) {
			return new AtmResponse(null,RtnCode.Account_NOT_FOUND);
		}
		Atm res = atmOp.get();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(!encoder.matches(pwd, res.getPwd())) {
			return new AtmResponse(null,RtnCode.Account_NOT_FOUND);
		}
		res.setBalance(res.getBalance()+ amount);
		atmDao.save(res);
		res.setPwd("");
		return new AtmResponse(res,RtnCode.SUCCESSFUL);

	}

	@Override
	public AtmResponse withdraw(String account, String pwd, int amount) {
		if(!StringUtils.hasText(account) || !StringUtils.hasText(pwd) || amount <=0) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		Optional<Atm> atmOp = atmDao.findById(account);
		if(atmOp.isEmpty()) {
			return new AtmResponse(null,RtnCode.Account_NOT_FOUND);
		}
		Atm res = atmOp.get();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(!encoder.matches(pwd, res.getPwd())) {
			return new AtmResponse(null,RtnCode.Account_NOT_FOUND);
		}
		
		if(res.getBalance() < amount) {
			res.setPwd("");
			return new AtmResponse(null,RtnCode.INSUFFICIENT_BALANCE);
		}
		res.setBalance(res.getBalance()- amount);
		atmDao.save(res);
		res.setPwd("");
		return new AtmResponse(res,RtnCode.SUCCESSFUL);
	}
	
	

}
