package Demo;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCalculator {

  private Calculator calculator;
  
  @BeforeEach
    
     public void setup() {
	  calculator = new Calculator();
  }

  @Test
  @DisplayName("Simple mulitplication should work")
  public void testMulitply() {
	  assertEquals(20, calculator.multiply(4, 5));
  }
  
  @Test
  @Disabled("Subtract is not implemented")
  public void subtract() {
	  assertEquals(0, calculator.subtract(4,5));
  }
}
