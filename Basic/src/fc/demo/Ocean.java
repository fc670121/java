package fc.demo;

import fc.demo.fly.*;
import fc.demo.swim.*;

public class Ocean {

	public static void main(String[] args) {
        doSwim(new Anemonefish("����"));
        doSwim(new Shark("����"));
		doSwim(new SwimPlayer("�봵��"));
		doSwim(new Submarine("����@��"));
        doSwim(new Seaplane("�ŭx�s��"));
        doSwim(new FlyingFish("�ƥ�"));
	}

	static void doSwim(Swimmer swimmer) {
		swimmer.swim();
	}

}
