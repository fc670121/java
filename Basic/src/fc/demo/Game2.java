package fc.demo;

import static java.lang.System.out;
import fc.demo.RPG.*;

public class Game2 {

	public static void main(String[] args) {
		play(Action.RIGHT);
		play(Action.UP);
		play(199);
	}

	public static void play(int action) {
		switch (action) {
		case Action.STOP:
			out.println("播放停止動畫");
			break;
		case Action.RIGHT:
			out.println("播放向右動畫");
			break;
		case Action.LEFT:
			out.println("播放向左動畫");
			break;
		case Action.UP:
			out.println("播放向上動畫");
			break;
		case Action.DOWN:
			out.println("播放向下動畫");
			break;
		default:
			out.println("不支援此動作");

			// 注意！斷言是判定程式中的某個執行點必然是或不是某個狀態，所以不能當作像if之類的判斷式來使用，assert不應當做程式執行流程的一部份。
			assert false : "非定義的常數";
		}
	}

}
