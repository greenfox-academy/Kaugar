package ModelStringedInstruments;


public class ElectricGuitar extends StringedInstrument {


  public ElectricGuitar() {
    super(6);
  }

  public ElectricGuitar(int strings) {
    super(strings);
  }

  @Override
  public String sound() {
    return "Twang";
  }
}
