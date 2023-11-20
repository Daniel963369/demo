package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class StringTest {

	@Test
	public void stringTest() {
//		String str = "";
//		String str1 = "  ";
//		
//		System.out.println(str.isEmpty());
//		System.out.println(str1.isBlank()); //只要是isEmpty一定會符合isBlank
//		
//		String color = null;
//		if(color == null || color.isBlank()) {
//			System.out.println("是空字串");
//		}else {
//			System.out.println("不是空字串");
//		}// 一定得先判斷null才能執行後面的方法
		
//		if(StringUtils.hasText(color) == false) {
//			System.out.println("是空字串");
//		}else {
//			System.out.println("不是空字串");
//		}//StringUtils.hasText(color)前面加驚嘆號也行，代表相反的意思
		
		
		//搜尋索引值練習
//		Scanner scan = new Scanner(System.in);
//		System.out.println("請輸入搜尋字串:");
//		String search = scan.next();
//		int number =  0;
//		int index = 0;
//		String A1 = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
//		for(;;) {
//			if (A1.indexOf(search,index)>=0 ) {
//				number++;
//				System.out.println("索引值所在位置:"+A1.indexOf(search,index));
//				index = (A1.indexOf(search,index)+search.length());
//				
//			}//for改while也可以
//			else {
//				break;
//			}
//		}
//		System.out.println("索引值出現次數"+number);	
	}
	
//	@Test
//	public void replaceTest() {
//		String A1 = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
//		A1 = A1.replace("小龍女", "小籠湯包");
//		System.out.println(A1);
//		A1 = A1.replaceAll("楊過", "楊桃");
//		System.out.println(A1);
//	}
	
//	@Test
//	public void splitTest() {
//		String A1 = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
//		String[ ]  array = A1.split(",");
//		for(String item : array) {
//			System.out.println(item);
//		}
//		
//		String A2 ="ABCD";
//		String[] array1 = A2.split("");
//		for(String item : array1) {
//			System.out.println(item);
//		}
//	}
	
//	@Test
//	public void trimTest() {
//		String str = "ABC DEF ";
//		String str1 = " ABC DEF ";
//		System.out.println(str.equals(str1));
//		str = str.trim();
//		str1 =str1.trim();
//		System.out.println(str.equals(str1));
//		//如果空格很多可以用replace來做
//	}
	
//	@Test
//	public void substringTest() {
//		String str = "神鵰俠侶是楊過與小龍女的故事";
//		String subStr = str.substring(5);
//		System.out.println(subStr);
//		String subStr1 =str.substring(5, 14);
//		System.out.println(subStr1);
//	}	
	
//	@Test
//	public void stringBufferTest() {
//		StringBuffer sb = new StringBuffer("ABC");
//		sb.append("DEF").append("BBB");
//		System.out.println(sb);
//	}	
	
//	@Test
//	public void practiceTest() {
//		String str = "ABACADEF";
//		System.out.println(str.substring(0, 4));
//		String newStr = str.subSequence(0, 4)+"w"+ str.substring(5, 8);
//		System.out.println(newStr);
//		System.out.println(newString1);
		
//		Scanner scan  = new Scanner(System.in);
//		System.out.println("請輸入反轉字串");
//		String reverseWord = scan.next();
//		StringBuffer newReverseWord = new StringBuffer(reverseWord);
//		System.out.println(newReverseWord.reverse().toString());
//		
//		Scanner scan  = new Scanner(System.in);
//		System.out.println("請輸入字串");
//		String str = scan.next();
//		StringBuffer newReverseWord = new StringBuffer(str);
//		if(str.equals(newReverseWord.reverse().toString())) {
//			System.out.println(str + "是回文");
//		}else {
//			System.out.println(str + "不是回文");
//		}
//	}	
	
//	@Test
//	public void listTest() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("請輸入一個數字");
//		int inputInt = scan.nextInt();
//		inputInt ++;
//		String str =String.valueOf(inputInt);
//		String[] strArray = str.split("");
//		System.out.println(new ArrayList<>(Arrays.asList(strArray)));
//	}	

	
	
}
