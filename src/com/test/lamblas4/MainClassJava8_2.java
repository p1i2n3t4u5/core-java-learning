package com.test.lamblas4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainClassJava8_2 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person(44, "Niranjan", "Panigrahi"), new Person(55, "Amit", "Saha"),
				new Person(66, "Supriya", "Dash"), new Person(41, "Satya", "Mishra"),
				new Person(22, "Pradeep", "Majhi"), new Person(34, "Kadambini", "Sarangi"));

		// sort list by last name
		// Collections.sort(persons,(Person o1, Person o2) ->
		// o1.getLastName().compareTo(o2.getLastName()));

		Collections.sort(persons, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));


		System.out.println("printing all persion  last name starting with S");
		// print all person last name starting with S
		printConditionally(persons, (p) -> p.getLastName().startsWith("S"),(p)->System.out.println(p.getLastName()));

		System.out.println("printing all persion  first name starting with S");
		// print all person last name starting with S
		printConditionally(persons, (p) -> p.getFirstName().startsWith("S"),(p)->System.out.println(p));

		System.out.println("printing all persion");
		// print all in java 8 way
		printConditionally(persons, (p) -> true,(p)->System.err.println(p.getFirstName()));

		// instead of using own interface we can use of of the box interface presents

	}

	private static void printConditionally(List<Person> persons, Predicate<Person> predicate,Consumer<Person> consumer) {

		for (Person person : persons) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}

	}

}
