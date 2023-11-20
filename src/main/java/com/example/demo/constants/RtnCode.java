package com.example.demo.constants;

public enum RtnCode {
	
	SUCCESSFUL(200,"successful"),//
	
	PARAM_ERROR(400,"param error!"),//
	
	ACCOUNT_EXISTED(400, "account existed!!!"),//
	
	Account_NOT_FOUND(404,"account not found!!"),
	INSUFFICIENT_BALANCE(400,"insufficient balance!!");
	
	
	private int code;
	
	private String message;
	
	
	
	private RtnCode(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}





	
}
