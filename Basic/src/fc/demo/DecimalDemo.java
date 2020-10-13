package fc.demo;
import java.math.BigDecimal;

public class DecimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BigDecimal operand1 = new BigDecimal("1.0");
        BigDecimal operand2 = new BigDecimal("0.8");
        BigDecimal result = operand1.subtract(operand2);
        System.out.println(result);

	}

}
