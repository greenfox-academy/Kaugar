package Zoo;

import Flyable.Flyable;

public class Bird extends Animal implements Flyable {
  public Bird(String name) {
    super(name);
  }

  @Override
  public String breed() {
    return "laying egg";
  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}
