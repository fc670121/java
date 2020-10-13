package fc.demo;

import static java.lang.System.out;

class HelloClass {
    Runnable r1 = () -> out.println(this);
    Runnable r2 = () -> out.println(toString());
 
    public String toString() { 
        return "Hello, world!"; 
    }
}

public class Hello {
    public static void main(String[] args) {
        new HelloClass().r1.run();
        new HelloClass().r2.run();
    }
}