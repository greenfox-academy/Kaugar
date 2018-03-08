import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  Apple myObject;
  @Before
  public void setUp(){
    myObject = new Apple();
  }

  @Test
  public void getApple() {
    assertEquals("apple", myObject.getApple());
  }
}