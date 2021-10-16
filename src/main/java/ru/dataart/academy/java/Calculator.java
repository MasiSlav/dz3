package ru.dataart.academy.java;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        int sum = 0;
        for (Integer i : firstNumber) {
            sum += i * Math.pow(10, firstNumber.indexOf(i));
        }
        for (Integer i : secondNumber) {
            sum += i * Math.pow(10, secondNumber.indexOf(i));
        }
        return sum;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        if (list.isEmpty()){
            return Collections.EMPTY_LIST;
        }
        List <T> vsp= new java.util.ArrayList<T>(Collections.EMPTY_LIST);
        Iterator <T> iterator= list.iterator();
        while (iterator.hasNext()){
            T element= iterator.next();
            if (list.indexOf(element)%2==0){
                vsp.add(element);
            }
        }
        return vsp;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        if (list.isEmpty()){
            return Collections.EMPTY_LIST;
        }
        List <T> vsp= new java.util.ArrayList<T>(Collections.EMPTY_LIST);
        Iterator <T> iterator= list.iterator();
        while (iterator.hasNext()){
            T element=iterator.next();
            if (list.indexOf(element)==0 || (list.indexOf(element)==list.size()-1)){
                vsp.add(element);
            }
        }

        return vsp;
    }
}
