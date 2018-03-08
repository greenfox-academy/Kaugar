import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest extends TestCase {

  @Test
  public void getApple() {
    Apple myObject = new Apple();
    assertEquals("apple", myObject.getApple());
  }
}