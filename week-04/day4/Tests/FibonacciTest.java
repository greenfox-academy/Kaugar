import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  Fibonacci test;

  @Before
  public void setUp() throws Exception {
    test = new Fibonacci();
  }

  @Test
  public void fibonaccinumber() {
    int number = 7;

    assertEquals(13, test.fibonaccinumber(number));
  }
  @Test
  public void fibonaccinumberfalse() {
    int number = 7;

    assertNotEquals(16, test.fibonaccinumber(number));
  }
  @Test
  public void fibonaccinumber0() {
    int number = 0;

    assertEquals(0, test.fibonaccinumber(number));
  }
  @Test
  public void fibonaccinumber1() {
    int number = 1;

    assertEquals(1, test.fibonaccinumber(number));
  }
}