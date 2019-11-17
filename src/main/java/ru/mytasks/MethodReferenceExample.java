package ru.mytasks;
//That code demonstrate ability of method references: refer to the existing method by name:
//More details:
import java.time.LocalDate;
import java.util.Arrays;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person[] persons = new Person[10];

        //use Person comparator
        Arrays.sort(persons, Person::compareByDateOfBirth);
    }
}
