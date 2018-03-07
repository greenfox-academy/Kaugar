package ModelStringedInstruments;

public class Violin extends StringedInstrument {
  int strings;
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
