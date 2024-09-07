package com.lazinessLambda;

public class Sample {
    public static int compute(int number) {
        // imagine takes sometime to compute
        System.out.println("compute called...");
        return number * 10;
    }

    public static void main(String[] args) {
        gone();
    }

    private static void go() {
        int value =4 ;
        // eager evaluation because compute was called
        int temp = compute(value);
        if (value > 4 && temp > 100) {
            System.out.println("path1 with: " + temp);
        } else {
            System.out.println("path2");
        }
    }

    private static void went() {
        int value =4 ;

        // short circuiting
        if (value > 4 && compute(4) > 100) {
            System.out.println("path1 with: " + compute(4));
        } else {
            System.out.println("path2");
        }
    }

    private static void gone() {
        int value =14 ;
        /*
        when you perform a compute(value) that is eager evaluation
        but
        ()-> compute(value) says : don't run it right now move it away for a later.
         */
        // lazy evaluation
        Lazy<Integer> temp = new Lazy<>(()-> compute(value));
        if (value > 4 && temp.get() > 100) {
            System.out.println("path1 with: " + temp.get());
        } else {
            System.out.println("path2");
        }
    }
}
