package com.decorator;
import java.awt.Color;
import java.util.function.Function;
import java.util.stream.Stream;
public class Demo {
    public static void main(String[] args) {
        print(new Camera());
        print(new Camera(Color::brighter));
        print(new Camera(Color::darker));
        print(new Camera(Color::darker, Color::brighter));
    }
    public static void go() {
        System.out.println("OK");
    }

    public static void print(Camera camera) {
        System.out.println(camera.snap(new Color(125, 125, 125)));
    }
}

class Camera {
    private Function<Color, Color> filter;
    public Camera(Function<Color, Color>... filters) {
        filter = Stream.of(filters)
                .reduce(Function.identity(),Function::andThen);
    }
    public Color snap(Color input) {
        return filter.apply(input);
    }
}


