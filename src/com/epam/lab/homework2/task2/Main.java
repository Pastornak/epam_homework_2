package com.epam.lab.homework2.task2;

public class Main {

	public static void main(String[] args) {
		CustomClass object = new CustomClass("Some data");
		object.getFieldsWithAnnotation(CustomAnnotation.class).forEach(System.out::println);
	}

}
