package com.pluralsight.collection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // this line should fail //Because List size maximum 3 we trying to put here 4 items
        System.out.println(numbers.getItems().size());
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
       // dates.add(15); // this line should fail //Because our list takes LocalDate type data 15 is int not a LocalDate
        //And max size is 2 but we trying add 3 elements
    }
}
