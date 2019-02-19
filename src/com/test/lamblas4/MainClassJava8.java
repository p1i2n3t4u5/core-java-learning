package com.test.lamblas4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class MainClassJava8 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person(44, "Niranjan", "Panigrahi"), new Person(55, "Amit", "Saha"),
				new Person(66, "Supriya", "Dash"), new Person(41, "Satya", "Mishra"),
				new Person(22, "Pradeep", "Majhi"), new Person(34, "Kadambini", "Sarangi"));

		// sort list by last name
		// Collections.sort(persons,(Person o1, Person o2) ->
		// o1.getLastName().compareTo(o2.getLastName()));

		Collections.sort(persons, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

		// print all person with sorted order of last name
		printPerson(persons);

		System.out.println("printing all persion  last name starting with S");
		// print all person last name starting with S
		printConditionally(persons, (p) -> p.getLastName().startsWith("S"));

		System.out.println("printing all persion  first name starting with S");
		// print all person last name starting with S
		printConditionally(persons, (p) -> p.getFirstName().startsWith("S"));

		System.out.println("printing all persion");
		// print all in java 8 way
		printConditionally(persons, (p) -> true);

		// instead of using own interface we can use of of the box interface presents

	}

//	private static void printConditionally(List<Person> persons, Condition condition) {
//
//		for (Person person : persons) {
//			if (condition.test(person)) {
//				System.out.println(person);
//			}
//		}
//
//	}

	private static void printConditionally(List<Person> persons, Predicate<Person> predicate) {

		for (Person person : persons) {
			if (predicate.test(person)) {
				System.out.println(person);
			}
		}

	}

	private static void printPerson(List<Person> persons) {

		for (Person person : persons) {
			System.out.println(person);
		}

	}

	public interface Condition {

		boolean test(Person p);

	}

}
