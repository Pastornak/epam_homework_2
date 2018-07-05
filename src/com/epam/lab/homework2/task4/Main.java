package com.epam.lab.homework2.task4;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		CustomClass cc = new CustomClass();
		@SuppressWarnings("rawtypes")
		Class ccClass = cc.getClass();
		try{
			System.out.println(ccClass.getDeclaredMethod("methodWithString", String.class).invoke(cc, "Hello guys"));
			System.out.println(ccClass.getDeclaredMethod("methodWithInts", int.class, int.class).invoke(cc, 2, 2));
			ccClass.getDeclaredMethod("methodWithoutReturn", String.class).invoke(cc, "Goodbye guys");
		} catch (Exception e){
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
