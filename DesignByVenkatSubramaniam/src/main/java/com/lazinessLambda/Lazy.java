package com.lazinessLambda;

import java.util.function.Supplier;

public class Lazy<T> {
    private T instance;
    private Supplier<T> supplier;

    // that is pretty eager because the minute you want to pass a value that got pre-evaluated
    // and so it's been evaluated already when you receive it

    /*
    When you pass the value instance to constructor, it assumes that the value(of type T)
    has already been evaluated or created 'before' it is passed into the Lazy object
    like this;
    Lazy<Integer> lazyInt = new Laza<>(expensiveComputation());
    the method expensiveComputation() is called immediately, and result is passed to the
    constructor of Lazy<T>. Therefore, the value is computed eagerly
     */
//    public Lazy(T instance) {
//        this.instance = instance;
//    }

    public Lazy(Supplier<T> supplier) {
        this.supplier = supplier;
    }

//    public T get() {
//        return instance;
//    }

    public T get() {
        if (instance == null) {
            instance = supplier.get();
        }
        return instance;
    }
}
