package com.optional;

import java.util.List;
import java.util.Optional;

public class Sample {
//    //legacy don't do this
//    public static void setName(String name) {
//        if (name==null) {
//            //smell
//            // use default value of Joe
//        }
//        // use the given name
//    }

    //tempting, but don't
    public static void setNames(Optional<String> names) {
        if (names.isPresent()) {
            // use the given name
        } else {
            // use the default value Joe
        }
    }

// do this instead
//    public static void setName() {
//        // use the default value Joe
//    }
//
//    public static void setName(String name) {
//        // use the given name
//    }
    public static List<String> getNames() {
        return List.of();
    }

    public static /*String*/ Optional<String> getString() {
        // return null; // Bad idea
        if (Math.random() > 0.5) {
            return Optional.of("Joe");
        }
        return Optional.empty();
    }
    public static void main(String[] args) {
        var result = getString();
        System.out.println(result);
//        if (result != null) {
//            // smell you don't want to be performing that kind of null check
//        }
        System.out.println(result.orElse("not found"));

        //please don't do this:
//        System.out.println(result.get()); // get() will blow up if the object doesn't exist
        // get does not reveal its intention

        // if you need to use get. the use orThrowElse instead
        System.out.println(result.orElseThrow());
    }
}
