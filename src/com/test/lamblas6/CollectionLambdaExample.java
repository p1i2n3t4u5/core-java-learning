package com.test.lamblas6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.test.lamblas4.Person;

public class CollectionLambdaExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person(44, "Niranjan", "Panigrahi"), new Person(55, "Amit", "Saha"),
				new Person(66, "Supriya", "Dash"), new Person(41, "Satya", "Mishra"),
				new Person(22, "Pradeep", "Majhi"), new Person(34, "Kadambini", "Sarangi"));

		for (Person person : persons) {
			System.out.println(person);
		}

		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(0));
		}

		//anonymous inner class way
		persons.forEach(new Consumer<Person>() {

			@Override
			public void accept(Person p) {
				System.out.println(p);

			}
		});
		
		//lambda way  internal interation
		persons.forEach((p)->System.out.println(p));

		System.out.println("method reference way");
		persons.forEach(System.out::println);
		
		
		
	}

}
