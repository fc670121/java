package fc.demo;

import fc.demo.enmu.Action2;

public class Game4 {

	public static void main(String[] args) {
		Game4.play(Action2.RIGHT);
		Game4.play(Action2.DOWN);
	}

	static void play(Action2 action) {
		action.execute();
	}
}
