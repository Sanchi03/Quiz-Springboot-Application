package com.Project.QuizApp.Practice;

class Animal{
	
	public void eat() {
		System.out.println("Animal eats");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("barking");
	}
}

class StringExample{
	String str="";
}

public class Inheritance {

	public static void main(String[] args) {
		
		char [] ch= {'w','e','l','l'};
		String s=new String(ch);
		System.out.println(ch);
		String str="Test";
		 str="test";
		 
		 float f=2.4f;
		 byte num=(byte)f;
		 System.out.println(num);
		 
		 System.out.println(str);

		Animal obj=new Dog();
		//obj.bark();
		obj.eat();
	}

}
