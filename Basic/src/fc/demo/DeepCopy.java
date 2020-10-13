package fc.demo;

public class DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clothes2[] c1 = { new Clothes2("red", 'L'), new Clothes2("blue", 'M') };
		Clothes2[] c2 = new Clothes2[c1.length];
		for (int i = 0; i < c1.length; i++) {
			Clothes2 c = new Clothes2(c1[i].color, c1[i].size);
			c2[i] = c;
		}
		c1[0].color = "yellow";
		System.out.println(c2[0].color);
	}

}

class Clothes2 {
	String color;
	char size;

	Clothes2(String color, char size) {
		this.color = color;
		this.size = size;
	}
}
