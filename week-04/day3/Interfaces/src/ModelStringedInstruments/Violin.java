package ModelStringedInstruments;

public class Violin extends StringedInstrument {
  public Violin() {
    super(4);
  }

  public Violin(int strings) {
    super(strings);
  }

  @Override
  public String sound() {
    return "Sceech";
  }
}
