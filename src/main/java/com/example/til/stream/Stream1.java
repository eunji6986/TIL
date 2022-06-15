package com.example.til.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c","a", "b","c"));

        String[] array = new String[]{"a", "b", "c","a", "b","c"};
        Stream<String> stream1 = Arrays.stream(array);
        Stream<String> stream2 = Arrays.stream(array, 2, 5);


     /*   stream2.forEach(System.out::print);*/

         stream1.distinct().forEach(System.out::println);

    }
}
