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
//		System.out.println(str1.isBlank()); //�u�n�OisEmpty�@�w�|�ŦXisBlank
//		
//		String color = null;
//		if(color == null || color.isBlank()) {
//			System.out.println("�O�Ŧr��");
//		}else {
//			System.out.println("���O�Ŧr��");
//		}// �@�w�o���P�_null�~�����᭱����k
		
//		if(StringUtils.hasText(color) == false) {
//			System.out.println("�O�Ŧr��");
//		}else {
//			System.out.println("���O�Ŧr��");
//		}//StringUtils.hasText(color)�e���[��ĸ��]��A�N��ۤϪ��N��
		
		
		//�j�M���ޭȽm��
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�п�J�j�M�r��:");
//		String search = scan.next();
//		int number =  0;
//		int index = 0;
//		String A1 = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
//		for(;;) {
//			if (A1.indexOf(search,index)>=0 ) {
//				number++;
//				System.out.println("���ޭȩҦb��m:"+A1.indexOf(search,index));
//				index = (A1.indexOf(search,index)+search.length());
//				
//			}//for��while�]�i�H
//			else {
//				break;
//			}
//		}
//		System.out.println("���ޭȥX�{����"+number);	
	}
	
//	@Test
//	public void replaceTest() {
//		String A1 = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
//		A1 = A1.replace("�p�s�k", "�pŢ���]");
//		System.out.println(A1);
//		A1 = A1.replaceAll("���L", "����");
//		System.out.println(A1);
//	}
	
//	@Test
//	public void splitTest() {
//		String A1 = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
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
//		//�p�G�Ů�ܦh�i�H��replace�Ӱ�
//	}
	
//	@Test
//	public void substringTest() {
//		String str = "����L�Q�O���L�P�p�s�k���G��";
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
//		System.out.println("�п�J����r��");
//		String reverseWord = scan.next();
//		StringBuffer newReverseWord = new StringBuffer(reverseWord);
//		System.out.println(newReverseWord.reverse().toString());
//		
//		Scanner scan  = new Scanner(System.in);
//		System.out.println("�п�J�r��");
//		String str = scan.next();
//		StringBuffer newReverseWord = new StringBuffer(str);
//		if(str.equals(newReverseWord.reverse().toString())) {
//			System.out.println(str + "�O�^��");
//		}else {
//			System.out.println(str + "���O�^��");
//		}
//	}	
	
//	@Test
//	public void listTest() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�п�J�@�ӼƦr");
//		int inputInt = scan.nextInt();
//		inputInt ++;
//		String str =String.valueOf(inputInt);
//		String[] strArray = str.split("");
//		System.out.println(new ArrayList<>(Arrays.asList(strArray)));
//	}	

	
	
}
