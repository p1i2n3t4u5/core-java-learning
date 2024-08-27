package com.test.java8.stream;

import java.util.Arrays;
import java.util.List;

import com.test.lamblas4.Person;

public class StreamExample2 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person(44, "Niranjan", "Panigrahi"), new Person(55, "Amit", "Saha"),
				new Person(66, "Supriya", "Dash"), new Person(41, "Satya", "Mishra"),
				new Person(22, "Pradeep", "Majhi"), new Person(34, "Kadambini", "Sarangi"));

		System.out.println("--------------Printing all-------------------");
		persons.stream().forEach(p -> System.out.println(p.getFirstName()));

		System.out.println("---------------------Printing sleceted with some filter--------------");
		persons.stream().filter(p -> p.getLastName().startsWith("S"))
				.forEach(p -> System.out.println(p.getFirstName()));

		long count = persons.stream().count();
		System.out.println("count:  "+count);

	}

}
