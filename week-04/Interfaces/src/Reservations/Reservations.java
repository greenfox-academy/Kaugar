package Reservations;

import java.util.Random;

public class Reservations implements Reservatory {
  private String day;
  private String code;

  public Reservations(){
    day = getDowBooking();
    code = getDowBooking();
  }
  @Override
  public String getDowBooking() {

    String[] days = {"MON", "THU", "WED", "THU", "FRI", "SAT", "SUN"};
    Random ran = new Random();
    int randnum = ran.nextInt(days.length);
    String randomday = days[randnum];
    return randomday;
  }

  @Override
  public String getCodeBooking() {

    char[] alphanum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    String codestring = "";
    for (int i = 0; i < 8 ; i++) {
      Random ran = new Random();
      int randnum = ran.nextInt(alphanum.length);
      codestring += String.valueOf(alphanum[randnum]);
    }
    return codestring;
  }

  public static void main(String[] args) {
    
  }
}
