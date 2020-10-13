package fc.demo.util;

//類別(Class)
public class CashCard {
	private String number;
	private int balance;
	private int bonus;
	private static String companyName = "SKB";	//static的變數命名要全小寫,例如:System.out ==> out就是static變數且全小寫

	// 建構式(Constructor)
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

	// 方法(Method)
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

	public void store(int money) { // 儲值時呼叫的方法
		if (money > 0) {
			this.balance += money;
			if (money >= 1000) {
				this.bonus++;
			}
		} else {
			System.out.println("儲值是負的？你是來亂的嗎？");
		}
	}

	public void charge(int money) { // 扣款時呼叫的方法
		if (money > 0) {
			if (money <= this.balance) {
				this.balance -= money;
			} else {
				System.out.println("錢不夠啦！");
			}
		} else {
			System.out.println("扣負數？這不是叫我儲值嗎？");
		}
	}

	public int exchange(int bonus) { // 兌換紅利點數時呼叫的方法
		if (bonus > 0) {
			this.bonus -= bonus;
		}
		return this.bonus;
	}
}
