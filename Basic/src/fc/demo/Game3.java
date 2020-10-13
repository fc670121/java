package fc.demo;

import static java.lang.System.out;
import fc.demo.enmu.*;

public class Game3 {

	public static void main(String[] args) {
		play(Action.RIGHT);
		play(Action.UP);
	}

	public static void play(Action action) {
		switch (action) {
		case STOP:
			out.println("播放停止動畫");
			break;
		case RIGHT:
			out.println("播放向右動畫");
			break;
		case LEFT:
			out.println("播放向左動畫");
			break;
		case UP:
			out.println("播放向上動畫");
			break;
		case DOWN:
			out.println("播放向下動畫");
			break;
		}
	}

}
