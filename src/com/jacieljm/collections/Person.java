package com.jacieljm.collections;

import java.util.*;

public class Person {
    private String name;
    private String birthDate;
    private int age;

    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public  Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate);
    }

    @Override
    public String toString() {
        return "Person(" + name + ", " + Objects.requireNonNullElseGet(birthDate, () -> age) + ")";
    }

    public static Set<Person> removeDuplicates(List<Person> persons) {
        return new HashSet<>(persons);
    }

    public static Map<Integer, Set<String>> groupByAge(List<Person> persons) {
        Map<Integer, Set<String>> groupedByAge = new HashMap<>();

        for (Person person : persons) {
            groupedByAge
                    .computeIfAbsent(person.getAge(), k -> new TreeSet<>())
                    .add(person.getName());
        }

        return groupedByAge;
    }
}
