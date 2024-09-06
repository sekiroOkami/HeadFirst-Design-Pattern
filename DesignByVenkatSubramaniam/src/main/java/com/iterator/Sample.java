package com.iterator;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    private static List<String> names = List.of("Marika","Messmers","Godfrey","Radahn","Rennala","Melina");

    public static void main(String[] args) {
        // external iterators - we control the iteration
//        go();
//        run(names);
        example();
    }
    private static void example() {
        var result = new ArrayList<String>();
        for (var name: names) {
            if (name.length() == 6) {
                result.add(name.toUpperCase());
            }
        }
        System.out.println(result);
        System.out.println("+++++++++++++++");
        var result1 =
        names.stream()
                .filter(name->name.length()==6)
                //.map(name -> performImpureOperation(name)) // avoid
                .map(String::toUpperCase).toList(); // good idea
        System.out.println(result1);
    }

    private static void exposeMutable() {
        System.out.println("+++++++++++++++");
        // result: is shared between all iterations of the stream, so parallel can modify it at the same time.
        var result = new ArrayList<String>();
        names.stream()
                .filter(name->name.length()==6)
                .map(String::toUpperCase)
                .forEach(value-> result.add(value));
        //The pipeline is NOT pure
        //we are doing shared mutability
        //the result may be unpredictable if we change this code to run in parallel
        System.out.println(result);
    }


    public static void go() {
        int count = 0;
        for (String name: names) {
            if (name.length() == 6) {
                System.out.println(name.toUpperCase());
                count++;
                //break is a statement
                //continue
                //we are in the business of controlling the flow of iteration
                if (count==2) {
                    break;
                }
            }
        }
    }

    private static void run(List<String> names) {
        System.out.println("-------------------");
        //internal iterator because we are not in the business of controlling the flow of iteration
        names.stream().filter(name->name.length() == 6)
                .map(String::toString)
                //limit(2), takeWhile(predicate)
                .limit(2)
                .forEach(System.out::println);

        // limit and take while are the functional equivalent of break from the imperative style
    }
}
