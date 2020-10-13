package fc.demo.util;

public abstract class GuessGame {
    public void go() {
        int number = (int) (Math.random() * 10); 
        int guess;
        do {
            print("��J�Ʀr�G");
            guess = nextInt();
        } while(guess != number);
        println("�q���F");
    }
    
    public void println(String text) {
        print(text + "\n");
    }

    public abstract void print(String text);
    public abstract int nextInt();
}
