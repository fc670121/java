package fc.demo;

import fc.demo.Generic.*;

public class ContravarianceDemo {

	public static void main(String[] args) {
        Node<Apple> apple1 = new Node<>(new Apple(), null);
        Node<Apple> apple2 = new Node<>(new Apple(), apple1);
        Node<Apple> apple3 = new Node<>(new Apple(), apple2);
        
        Node<Banana> banana1 = new Node<>(new Banana(), null);
        Node<Banana> banana2 = new Node<>(new Banana(), banana1);

        printlnForEach(apple3);
        printlnForEach(banana2);
    }

    static void printlnForEach(Node<? extends Fruit> n) { 
        Node<? extends Fruit> node = n;
        do {
            System.out.println(node.value);
            node = node.next;
        } while(node != null);
    }
}
