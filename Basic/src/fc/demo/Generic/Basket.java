package fc.demo.Generic;

import java.util.Arrays;
import java.util.Comparator;

public class Basket<T> {
    public T[] things;

    
    @SuppressWarnings(value={"unchecked"})
	public Basket(T... things) {
        this.things = things;
    }

    public void sort(Comparator<? super T> comparator) {
        Arrays.sort(things, comparator);
    }
    
    @Deprecated
    public void test( ) {
    	//Just test Deprecated Annotation
    }
}