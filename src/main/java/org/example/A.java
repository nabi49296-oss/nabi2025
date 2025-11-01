package org.example;


import java.util.Arrays;
import java.util.List;

public class A {
    public static void main(String[] args) {
      List<String> name = Arrays.asList("asdf", "qer", "cvb");
      name.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}