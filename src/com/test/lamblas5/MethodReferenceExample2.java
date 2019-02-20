package com.test.lamblas5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.test.lamblas4.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person(44, "Niranjan", "Panigrahi"), new Person(55, "Amit", "Saha"),
				new Person(66, "Supriya", "Dash"), new Person(41, "Satya", "Mishra"),
				new Person(22, "Pradeep", "Majhi"), new Person(34, "Kadambini", "Sarangi"));

		Collections.sort(persons, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

		printConditionally(persons, (p) -> true, (p) -> System.out.println(p));
		
		//calling in method reference way
		printConditionally(persons, (p) -> true, System.err::println);

	}

	private static void printConditionally(List<Person> persons, Predicate<Person> predicate,
			Consumer<Person> consumer) {

		for (Person person : persons) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}

	}
}
