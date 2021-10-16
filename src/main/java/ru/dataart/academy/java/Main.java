package ru.dataart.academy.java;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.getSum(Arrays.asList(1, 5), Collections.singletonList(0)));

        System.out.println("Odd elements: " + calculator.getOddElements(Arrays.asList(1, 2, 3)));
        System.out.println("Bounds: " + calculator.getBounds(Arrays.asList(1, 2, 3)));
    }
}