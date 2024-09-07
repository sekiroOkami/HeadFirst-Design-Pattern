package demo.demoSingleton.doublelocking;

public class Bird {
    private static Bird bird;
    private Bird() {

    }
    public static Bird getInstance() {
        // 1.t1, t1 come in
        if (bird==null){
            // 2.ti1 come first.
            synchronized (Bird.class){
                //4.t2 come second
                if (bird==null){ //5. t2 not pass the if condition!
                    //3.t1 initialize obj
                    bird=new Bird();
                }
            }
        }
        //6.return 1 obj
        return bird;
    }
}
