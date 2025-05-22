package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        people.add(new Person("Liam", "Stone", 23));
        people.add(new Person("Mila", "Waters", 31));
        people.add(new Person("Noah", "Blackwood", 28));
        people.add(new Person("Ava", "Hawkins", 35));
        people.add(new Person("Ethan", "Marsh", 26));
        people.add(new Person("Zoe", "Whitman", 30));
        people.add(new Person("Lucas", "Frost", 24));
        people.add(new Person("Isla", "Granger", 27));
        people.add(new Person("Mason", "Rowe", 32));
        people.add(new Person("Chloe", "Hunt", 29));
        System.out.println("Which type of search you want to use? 1.Name  2.Surname  3.Age");
        int nameSurnameAge = sc.nextInt();
        sc.nextLine();
        if (nameSurnameAge == 1){  //Read ArrayList Names and compare it with input name
            System.out.print("Enter first Name: ");
            String name = sc.nextLine();
            List<Person> matched = people.stream().filter(person -> person.getFirstName().equalsIgnoreCase(name)).toList();
            matched.forEach(p -> System.out.println(p));
        } else if (nameSurnameAge == 2) {   //Read ArrayList Surnames and compare it with input surname
            System.out.print("Enter Surname: ");
            String surname = sc.nextLine();
            List<Person> matched = people.stream().filter(person -> person.getLastName().equalsIgnoreCase(surname)).toList();
            matched.forEach(p -> System.out.println(p));
        } else if (nameSurnameAge == 3) {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            List<Person> matched = people.stream().filter(person -> person.getAge() == age).toList();
            matched.forEach(person -> System.out.println(person));
            Person youngAge = people.stream()
                    .min((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                    .orElse(null);
            System.out.println("Younger person is: " + youngAge);
            int oldestAge = people.stream().map(person -> person.getAge()).max((a,b) -> Integer.compare(a,b)).orElse(null);
            System.out.println("Oldest person is: " + oldestAge);
        } else System.out.println("Wrong option!");

        // people.forEach(System.out::println);

    }
}
/*
if people.getName() == name
Print it
if people.getSurname() == surname
print it
*/

