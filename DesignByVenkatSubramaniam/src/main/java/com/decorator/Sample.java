package com.decorator;
import java.util.function.Function;
public class Sample {
    public static void print(int number, String message, Function<Integer, Integer> function) {
        System.out.println(number + ", " + message +": " + function.apply(number));
    }

    public static void main(String[] args) {
        Function<Integer, Integer> inc = value -> value + 1;
        Function<Integer, Integer> doubled = value -> value * 2;
        print(5, "increment", inc);
        print(5, "double", doubled);
        // how to print(5, "incremented and doubled",);
        print(5, "increment and double",combinedFunction());
        print(5, "inc and double", inc.andThen(doubled));
    }

    public static Function combinedFunction() {
        /*
        --->|inc|--->|double|---> // like a pipeline
         */
        Function<Integer, Integer> inc = value -> value + 1;
        Function<Integer, Integer> doubled = value -> value * 2;
        return inc.andThen(doubled);
    }

}
