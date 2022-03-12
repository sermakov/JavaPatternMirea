package ru.valkov.javaPattern.task1;

import java.util.Arrays;
import java.util.function.Function;

public class MyFunction {
    public static void main(String[] args) {
        Function<String[], String[]> arrMapper = strings -> Arrays
                .stream(strings)
                .map(str -> new StringBuilder(str).reverse().toString())
                .toArray(String[]::new);
        String[] arr = {"first", "second", "third"};
        System.out.println(Arrays.toString(arrMapper.apply(arr)));
    }
}
