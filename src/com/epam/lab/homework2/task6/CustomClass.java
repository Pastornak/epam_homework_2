package com.epam.lab.homework2.task6;

public class CustomClass {
	
	public String myMethod(String string, int... args){
		int sum = 0;
		for (int i = 0; i < args.length; i++){
			sum += args[i];
		}
		return string + " " + sum;
	}
	
	public String myMethod(String... args){
		String result = "";
		for(int i = 0; i < args.length; i++){
			result += args[i] + " ";
		}
		return result;
	}

}
