package ModelStringedInstruments;

import ModelStringedInstruments.StringedInstrument;

public class ElectricGuitar extends StringedInstrument {
  private int strings;

  public ElectricGuitar(){
    this.strings = 6;
  }

  public ElectricGuitar( int strings){
    this.strings = strings;
    }

  @Override
  public void sound() {
    System.out.println("Twang");
  }

  @Override
  public void play() {

  }
}
