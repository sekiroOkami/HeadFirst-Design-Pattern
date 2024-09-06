package com.iterator.pipeline;

import java.util.ArrayList;
import java.util.List;

public class ImpurePipeline {
    private static List<String> names = List.of("Marika","Messmers","Godfrey","Radahn","Rennala","Melina");
    private static List<String> result = new ArrayList<>();
    public static void main(String[] args) {
        // Impure pipeline
        names.stream()
                .filter(name -> name.length() == 4)
                .map(String::toUpperCase)
                .forEach(result::add);   // Modifies external state

        System.out.println(result);
    }
}
