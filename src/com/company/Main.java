package com.company;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> strings = List.of("one","two","three");
        Stream<String> stringStream = strings.stream();
        Stream<Integer> integerStream = Stream.of(10,20,30,40);

        integerStream
                .distinct()
                .forEach(System.out::println);
        List<Integer> numbers = List.of(10,5,4,20,30);


        stringStream
                .filter(string -> string.length()>=3)
                .forEach(System.out::println);
        strings.stream()
                .map(String::length)
                .forEach(System.out::println);

    }
}
