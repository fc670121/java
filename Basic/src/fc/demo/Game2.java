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
			out.println("���񰱤�ʵe");
			break;
		case Action.RIGHT:
			out.println("����V�k�ʵe");
			break;
		case Action.LEFT:
			out.println("����V���ʵe");
			break;
		case Action.UP:
			out.println("����V�W�ʵe");
			break;
		case Action.DOWN:
			out.println("����V�U�ʵe");
			break;
		default:
			out.println("���䴩���ʧ@");

			// �`�N�I�_���O�P�w�{�������Y�Ӱ����I���M�O�Τ��O�Y�Ӫ��A�A�ҥH�����@��if�������P�_���ӨϥΡAassert�������{������y�{���@�����C
			assert false : "�D�w�q���`��";
		}
	}

}
