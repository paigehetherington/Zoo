/**
 * Created by vajrayogini on 2/22/16.
 */
public class AnonymousFunctionExample {
    public static void main(String[] args) {
       //run code from separate method (tradl way of running code)
        sayHello();

        //run code from an anonymous class
        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");

            }
        };
        r1.run();

        // Run code from an anonymous function (even shorter). can pass to library to run code for you
        Runnable r2 = () -> {
            System.out.printf("Hello from anonymous function!");  //will probably return an html page for lib that has event
        };
        r2.run();

    }
    static void sayHello() { //normal way to create a method
        System.out.println("Hello, world!");
    }
}
