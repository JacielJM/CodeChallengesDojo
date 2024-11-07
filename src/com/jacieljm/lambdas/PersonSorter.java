package com.jacieljm.lambdas;

import com.jacieljm.collections.Person;

import java.util.Comparator;
import java.util.List;

public class PersonSorter {
    public static List<Person> sortPeopleByName(List<Person> people) {
        return sortPeople(people, Comparator.comparing(Person::getName));
    }

    public static List<Person> sortPeopleByAge(List<Person> people) {
        return sortPeople(people, Comparator.comparingInt(Person::getAge));
    }

    private static List<Person> sortPeople(List<Person> people, Comparator<Person> comparator) {
        return people.stream()
                .sorted(comparator)
                .toList();
    }

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Juan", 30),
                new Person("Alicia", 22),
                new Person("John", 25),
                new Person("Bob", 15)
        );

        List<Person> sortedByName = PersonSorter.sortPeopleByName(people);
        System.out.println("Sorted by name: " + sortedByName);

        List<Person> sortedByAge = PersonSorter.sortPeopleByAge(people);
        System.out.println("Sorted by age: " + sortedByAge);

    }
}
