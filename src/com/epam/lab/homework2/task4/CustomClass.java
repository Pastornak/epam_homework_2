package com.epam.lab.homework2.task4;

public class CustomClass {

	public String methodWithString(String string){
		return "[Method with string] " + string;
	}
	
	public int methodWithInts(int a, int b){
		System.out.print("[Method with ints] ");
		return a + b;
	}
	
	public void methodWithoutReturn(String string){
		System.out.print("[Method without return] ");
		System.out.println(string);
	}
}
