package Counter;

public class Counter {
  int counter;
  int reset;


  public Counter (int number){
    counter = number;
    reset = number;
  }
  public Counter (){
    counter = 0;
    reset = 0;
  }

  public void add (int number){
    counter += number;
  }
  public void add (){
    counter++;
  }
  public int get (){
    return counter;
  }
  public void reset (){
    counter = reset;
  }
}
