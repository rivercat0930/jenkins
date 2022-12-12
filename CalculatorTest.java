import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void addTest() {
    Calculator calculator = new Calculator();
    int sum = calculator.add(1, 5);
    assertEquals(6, sum);
  }
}