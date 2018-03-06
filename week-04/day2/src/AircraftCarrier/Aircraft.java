package AircraftCarrier;

public class Aircraft {
  int ammo = 0;
  int maxAmmo;
  int baseDamage;
  String type;

  public int fight (){
    int damage = this.ammo * this.baseDamage;
    ammo = 0;
    return damage;
  }
  public int fill (int remaining){
    int ammoNeeded = this.maxAmmo - this.ammo;
    int filledAmmo = 0;
    for (int i = 0; i < ammoNeeded; i++) {
      this.ammo++;
      filledAmmo++;
    }
    remaining -= filledAmmo;
    return remaining;
  }

  public String getType() {
    return type;
  }
  public void getStatus () {
    System.out.println("Type: " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + fight());
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
