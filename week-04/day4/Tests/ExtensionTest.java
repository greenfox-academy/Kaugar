import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ExtensionTest {

  Extension extension;

  @Before
  public void setUp(){
    extension = new Extension();
  }

  @Test
  public void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }
  @Test
  public void testAddfalse(){
    assertNotEquals(4,extension.add(2,3));
  }

  @Test
  public void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  public void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }
  @Test
  public void testMaxOfThree_second() {
    assertEquals(5, extension.maxOfThree(3, 5, 4));
  }

  @Test
  public void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  public void testMedian_four() {
    assertEquals(5, extension.median(Arrays.<Double>asList(5.0, 1.0, 4.0, 1.0)));
  }
  @Test
  public void testMedian_four2() {
    assertEquals(2.5, extension.median(Arrays.asList(1.0,1.0,4.0,5.0)));
  }

  @Test
  public void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1.0,2.0,3.0,4.0,5.0)));
  }

  @Test
  public void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  public void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  public void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  public void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}