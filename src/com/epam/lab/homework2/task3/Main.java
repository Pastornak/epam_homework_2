package com.epam.lab.homework2.task3;

public class Main {

	public static void main(String[] args) {
		CustomClass object = new CustomClass();
		object.getAnnotationWithValues(CustomAnnotation.class).forEach(System.out::println);
	}

}
