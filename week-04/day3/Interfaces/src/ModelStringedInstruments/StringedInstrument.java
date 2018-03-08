package ModelStringedInstruments;


public abstract class StringedInstrument extends Instrument {
  private int numberOfStrings;

  public StringedInstrument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public abstract String sound();

  @Override
  public void play() {
    System.out.println(this.getClass().getSimpleName() + ",is a " + numberOfStrings +
            "-stringed instrument that goes " + sound());
  }
}


