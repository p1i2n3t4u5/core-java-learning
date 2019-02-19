package com.test.lamblas4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClassJava7 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person(44, "Niranjan", "Panigrahi"), new Person(55, "Amit", "Saha"),
				new Person(66, "Supriya", "Dash"), new Person(41, "Satya", "Mishra"),
				new Person(22, "Pradeep", "Majhi"), new Person(34, "Kadambini", "Sarangi"));

		// sort list by last name
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// print all person with sorted order of last name
		printPerson(persons);

		System.out.println("printing all persion  last name starting with S");
		// print all person last name starting with S
		printConditionally(persons, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("S");
			}

		});

		System.out.println("printing all persion  first name starting with S");
		// print all person last name starting with S
		printConditionally(persons, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("S");
			}

		});

	}

	private static void printConditionally(List<Person> persons, Condition condition) {

		for (Person person : persons) {
			if (condition.test(person)) {
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
