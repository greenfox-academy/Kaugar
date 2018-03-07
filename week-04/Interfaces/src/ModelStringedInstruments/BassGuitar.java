package ModelStringedInstruments;

public class BassGuitar extends StringedInstrument{

  public BassGuitar(){
    super(4);
  }

  public BassGuitar( int strings){
    super(strings);
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }
}
