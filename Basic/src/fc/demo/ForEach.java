package fc.demo;

import java.util.*;

public class ForEach {
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
        List names = Arrays.asList("Justin", "Monica", "Irene");
        forEach(names);
        forEach(new HashSet(names)); 
        forEach(new ArrayDeque(names)); 
    }

    @SuppressWarnings("rawtypes")
	public static void forEach(Iterable iterable) {
        for(Object o : iterable) {
            System.out.println(o);
        }
    }
}