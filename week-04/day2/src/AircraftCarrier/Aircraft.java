package AircraftCarrier;

public class Aircraft {
  int ammo = 0;
  int maxAmmo;
  int baseDamage;

  public int fight (){
    int damage = this.ammo * this.baseDamage;
    ammo = 0;
    return damage;
  }
  public static class F16 extends Aircraft {
    public F16 (){
      super.maxAmmo = 8;
      super.baseDamage = 30;
    }
  }
  public static class F35 extends Aircraft {
    public F35 (){
      super.maxAmmo = 12;
      super.baseDamage = 30;
    }
  }
}
