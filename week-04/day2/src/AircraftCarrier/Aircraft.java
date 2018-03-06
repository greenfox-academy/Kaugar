package AircraftCarrier;

public class Aircraft {
  private int ammo = 0;
  private int maxAmmo;
  private int baseDamage;
  private String type;

  public int fight (){
    int damage = this.ammo * this.baseDamage;
    ammo = 0;
    return damage;
  }
  public int refill (){
    int ammoNeeded = this.maxAmmo - this.ammo;
    int remaining = 0;
    for (int i = 0; i < ammoNeeded; i++) {
      this.ammo++;
      remaining++;
    }
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
      super.type = "F16";
      super.maxAmmo = 8;
      super.baseDamage = 30;
    }
  }
  public static class F35 extends Aircraft {
    public F35 (){
      super.type = "F35";
      super.maxAmmo = 12;
      super.baseDamage = 50;
    }
  }

  public int getAmmo() {
    return ammo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setAmmo(int ammo) {
    this.ammo = ammo;
  }
}
