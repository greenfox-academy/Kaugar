import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

  Sharpie testSharpie;

  @Before
  public void setUp() throws Exception {
    testSharpie = new Sharpie("blue", 5);
  }

  @Test
  public void getInkamounttest() {
    testSharpie.use();
    testSharpie.use();
    assertEquals(98,testSharpie.getInkamount());
  }
}