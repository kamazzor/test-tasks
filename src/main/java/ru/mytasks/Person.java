package ru.mytasks;

import java.time.LocalDate;

class Person {
    private String name;
    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    //Comparator for Person class
    public static int compareByBirthday(Person a, Person b){
        return a.birthday.compareTo(b.birthday);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
