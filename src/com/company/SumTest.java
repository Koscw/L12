package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SumTest {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,3,90,11);
        Integer sum = numbers.stream()
                //.reduce(0,(accumulator, nextInteger)-> accumulator + nextInteger);
            .reduce(0,Integer::sum);
        Optional<Integer> min = numbers.stream()
                .min(Comparator.comparingInt(Integer::intValue));
        System.out.println("min"+min);

        Optional<Integer> max = numbers.stream()
                .max(Comparator.comparingInt(Integer::intValue));
        System.out.println("max"+max);
    }
}
