import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

  CountLetters test;


  @Before
  public void setUp() throws Exception {
    test = new CountLetters();

  }

  @Test
  public void countLetters() {
    String word = "Hello";

    HashMap<Character,Integer> testmap = new HashMap<>();
    testmap.put('H', 1);
    testmap.put('e', 1);
    testmap.put('l', 2);
    testmap.put('o', 1);

    assertEquals(testmap, test.countLetters(word));
  }
  @Test
  public void countLettersfalse() {
    String word = "Hello";

    HashMap<Character,Integer> testmap = new HashMap<>();
    testmap.put('H', 1);
    testmap.put('e', 1);
    testmap.put('l', 3);
    testmap.put('o', 1);

    assertNotEquals(testmap, test.countLetters(word));
  }
}