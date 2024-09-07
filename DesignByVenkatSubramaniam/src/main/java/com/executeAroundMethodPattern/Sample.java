package com.executeAroundMethodPattern;
import java.util.function.Consumer;
public class Sample {
    public static void main(String[] args) {
//        go();
//        arm();
        run();
    }

    private static void run() {
        ResourceV.use(resourceV -> {
            resourceV.op1().op2();
        });
        // it forces you to go in certain path
        /*
        ex.
        Transaction.runInTracsaction(tx ->....);
         */
    }

    // AUTOMATIC RESOURCE MANAGEMENT
    private static void arm() {
//        try (var resource = new ResourceARM()) {
//            resource.op1();
//            resource.op2();
//        }
        // Compiler not warning!
        var resource = new ResourceARM();
        resource.op1();
        resource.op2();
        // easy to forget
    }

    private static void go() {
        Resource resource = new Resource();
        try {
            resource.op1();
            resource.op2();
        } finally {
            resource.close();
        }
        //finalize not called
        // what if it was an exception?

        //verbose
        //but need try catch easy to forget
    }
}

class Resource {
    public Resource() {
        System.out.println("Create....");
    }
    public Resource op1() {
        System.out.println("Op1");
        return this;
    }

    public Resource op2() {
        System.out.println("Op2");
        return this;
    }

    public void close() {
        System.out.println("release external resource");
    }

    public void finalize() { // has since been deprecated
        System.out.println("release external resource");
    }
}

class ResourceARM implements AutoCloseable {
    public ResourceARM() {
        System.out.println("Create....");
    }
    public ResourceARM op1() {
        System.out.println("Op1");
        return this;
    }

    public ResourceARM op2() {
        System.out.println("Op2");
        return this;
    }

    public void close() {
        System.out.println("release external resource");
    }

    public void finalize() { // has since been deprecated
        System.out.println("release external resource");
    }
}
class ResourceV {
    private ResourceV() {
        System.out.println("Create....");
    }
    public ResourceV op1() {
        System.out.println("Op1");
        return this;
    }

    public ResourceV op2() {
        System.out.println("Op2");
        return this;
    }

    private void close() {
        System.out.println("release external resource");
    }

    public static void use(Consumer<ResourceV> block) {
        ResourceV resourceV = new ResourceV();
        try{
            block.accept(resourceV);
        } finally {
            resourceV.close();
        }
    }

}
