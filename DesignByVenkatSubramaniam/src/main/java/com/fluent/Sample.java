package com.fluent;
import java.util.function.Consumer;

public class Sample {
    public static void main(String[] args) {
//        go();
        run();
    }
    private static void run() {
        //Cascade method pattern
        Mailer.send(mailer ->
            mailer
                .from("builder@KBTG.com")
                .to("sekiro@mail.com")
                .subject("Your code sucks!")
                .body("..details....."));
    }

    private static void go() {
//        Mailer mailer = new Mailer();
//        mailer.from("builder@KBTG.com");
//        mailer.to("sekiro@mail.com");
//        mailer.subject("Your code sucks!");
//        mailer.body("..details.....");
//        mailer.send();
    }
}

class Mailer {
    private Mailer() {
    }

    public Mailer from(String  addr) {
        System.out.println("from.....");
        return this;
    }
    public Mailer to(String  addr) {
        System.out.println("to.....");
        return this;
    }
    public Mailer subject(String  line) {
        System.out.println("subject.....");
        return this;
    }
    public Mailer body(String  content) {
        System.out.println("body.....");
        return this;
    }
    public static void send(Consumer<Mailer> block) {
        var mailer = new Mailer();
        block.accept(mailer);
        System.out.println("sending.....");
    }

}
