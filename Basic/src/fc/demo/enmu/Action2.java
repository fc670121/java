package fc.demo.enmu;

import static java.lang.System.out;

public enum Action2 implements Command {
	STOP {
		public void execute() {
			out.println("���񰱤�ʵe");
		}
	},
	RIGHT {
		public void execute() {
			out.println("����k��ʵe");
		}
	},
	LEFT {
		public void execute() {
			out.println("������ʵe");
		}
	},
	UP {
		public void execute() {
			out.println("����V�W�ʵe");
		}
	},
	DOWN {
		public void execute() {
			out.println("����V�U�ʵe");
		}
	};
}
