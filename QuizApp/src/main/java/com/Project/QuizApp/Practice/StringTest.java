package com.Project.QuizApp.Practice;

public class StringTest {

	public static void main(java.lang.String[] args) {
		
		String test="TEST123";
		
		String str="TEST";
		
		String empty="";
		
		char [] ch=test.toCharArray();
		
		System.out.println(ch);
		
		for(int i=0; i<4;i++) {
			empty = empty + test.charAt(i);
		}
		System.out.println("Empty string now is: "+empty);
		
		if(empty.equals(str)) {
			System.out.println("TEST is found");
		}
		else {
			System.out.println("Not found");
		}
		
		
		

	}

}
