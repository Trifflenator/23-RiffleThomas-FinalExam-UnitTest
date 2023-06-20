import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest{
	private StringCalculator calculatedString;
	@BeforeEach
	public void setup() {
		calculatedString = new StringCalculator();
	}
	
	@AfterEach
	public void setdown() {
		calculatedString = null;
	}
	@Test
	public void testNegative() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {calculatedString.add("-1, 5"); });
	}
	@Test
	public void test1000() {
		assertTrue(calculatedString.add("1, 1000000") == 1);
	}
}