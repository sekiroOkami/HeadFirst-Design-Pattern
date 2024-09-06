package com.iterator.pipeline;

import java.util.List;
import java.util.stream.Collectors;

public class PurePipelineEx {
    private static List<String> names = List.of("Marika","Messmers","Godfrey","Radahn","Rennala","Melina");
    public static void main(String[] args) {
        var filteredNames = names.stream()
                .filter(name -> name.length() == 6)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
    /*
    No side effects: the filter(), map(), sorted() operations don't modify the original list names or external variables
    Each operation produces new values or collections without affecting any shared state
    Deterministic: Given the same list names, the pipeline will always return the same result.
    it doesn't depend on any external, mutable state or functions that produce different outcomes on each call.
     */
}
