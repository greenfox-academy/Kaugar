import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void sumfirst() {
    Sum sum1 = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(4);

    assertEquals(7,sum1.sum(numbers));
  }
  @Test
  public void sumone(){
    Sum sum2 = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(3);

    assertEquals(3,sum2.sum(numbers));
  }
  @Test
  public void sumempty(){
    Sum sum3 = new Sum();
    ArrayList<Integer> empty = new ArrayList<>();

    assertEquals(0,sum3.sum(empty));
  }
  @Test (expected = NullPointerException.class)
  public void sumnull(){
    Sum sum4 = new Sum();
    ArrayList<Integer> number = new ArrayList<>();
    number.add(null);

    assertEquals(null,sum4.sum(number));
  }
}