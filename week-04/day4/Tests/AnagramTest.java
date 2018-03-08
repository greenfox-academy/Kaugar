import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram test;

  @Before
  public void setUp() {
    test = new Anagram();
  }

  @Test
  public void anagramTrue() {
    String word1 = "Hello";
    String word2 = "olelh";

    assertTrue(test.anagram(word1,word2));
  }
  @Test
  public void anagramFalselength() {
    String word1 = "Hello";
    String word2 = "Hellooo";

    assertFalse(test.anagram(word1,word2));
  }
  @Test
  public void anagramFalse() {
    String word1 = "Hello";
    String word2 = "Bello";

    assertFalse(test.anagram(word1,word2));
  }
}