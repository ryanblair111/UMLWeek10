import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("2+2+4");
    assertEquals(8, sum);
    int sumZero = calculator.evaluate("2-2");
    assertEquals(0, sumZero);
    int sumNegative = calculator.evaluate("-2-4");
    assertEquals(-6, sumNegative);
    
  }
}
