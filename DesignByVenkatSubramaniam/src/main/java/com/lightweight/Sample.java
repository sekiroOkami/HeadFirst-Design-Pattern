package com.lightweight;

import java.util.List;
import java.util.function.Predicate;

/**
 * suppose we have a collection of numbers, may be price of stock, produce...etc.
 * We are asked to write a method to total all values
 */
public class Sample {

    public static void main(String[] args) {
        var numbers = List.of(1,2,3,4,5,6,7,8,9,10);
//        System.out.println("lambda version: " + totalValue(numbers));
//        System.out.println("legacy version: " + totalValueLegacy(numbers));
        System.out.println("totalValue(numbers) = " + totalEvenValue(numbers));
        System.out.println("totalValue(numbers, Predicate) = " + totalValueByPredicate(numbers, ignore->true));
        System.out.println("totalValueByEvenNumber = " + totalValueByPredicate(numbers, Sample::isEven));
        Predicate<Integer> evenPredicate = Sample::isEven;
        Predicate<Integer> negate = evenPredicate.negate();
        System.out.println("totalValueByOddNumber = " + totalValueByPredicate(numbers, negate));
    }

    private static boolean isEven(Integer integer) {
        if (integer % 2==0) return true;
        else return false;
    }

    private static int totalValueLegacy(List<Integer> numbers) {
        int total = 0;
        for (Integer element: numbers) {
            total = total + element;
        }
        return total;
    }

    private static int totalValue(List<Integer> numbers) {
        return  numbers.stream().reduce(0, Integer::sum);
    }

    private static int totalValueByPredicate(List<Integer> numbers, Predicate<Integer> predicate) {
        return  numbers.stream()
                .filter(predicate)
                .reduce(0, Integer::sum);
    }

    private static int totalEvenValue(List<Integer> numbers) {
        return  numbers.stream()
                .filter(n-> (n % 2)==0)
                .mapToInt(e->e)
                .sum();
    }
}
