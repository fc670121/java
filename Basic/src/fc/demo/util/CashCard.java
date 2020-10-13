package fc.demo.util;

//���O(Class)
public class CashCard {
	private String number;
	private int balance;
	private int bonus;
	private static String companyName = "SKB";	//static���ܼƩR�W�n���p�g,�Ҧp:System.out ==> out�N�Ostatic�ܼƥB���p�g

	// �غc��(Constructor)
	public CashCard(String number, int balance) {
		this.number = number;
		this.balance = balance;
		this.bonus = 0;
	}

	public CashCard(String number, int balance, int bonus) {
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}

	// ��k(Method)
	public static String GetCompanyName() {
		return companyName;
	}

	public String GetNumber() {
		return this.number;
	}

	public int GetBalance() {
		return this.balance;
	}

	public int GetBonus() {
		return this.bonus;
	}

	public void store(int money) { // �x�ȮɩI�s����k
		if (money > 0) {
			this.balance += money;
			if (money >= 1000) {
				this.bonus++;
			}
		} else {
			System.out.println("�x�ȬO�t���H�A�O�Ӷê��ܡH");
		}
	}

	public void charge(int money) { // ���ڮɩI�s����k
		if (money > 0) {
			if (money <= this.balance) {
				this.balance -= money;
			} else {
				System.out.println("�������աI");
			}
		} else {
			System.out.println("���t�ơH�o���O�s���x�ȶܡH");
		}
	}

	public int exchange(int bonus) { // �I�����Q�I�ƮɩI�s����k
		if (bonus > 0) {
			this.bonus -= bonus;
		}
		return this.bonus;
	}
}