package Reservations;

import java.util.Random;
import java.util.Scanner;

public class Reservations implements Reservatory {
  private String day;
  private String code;



  public Reservations(){
    day = getDowBooking();
    code = getCodeBooking();
  }
  @Override
  public String getDowBooking() {

    String[] days = {"MON", "THU", "WED", "THU", "FRI", "SAT", "SUN"};
    Random ran = new Random();
    int randNum = ran.nextInt(days.length);
    String randomDay = days[randNum];
    return randomDay;
  }

  @Override
  public String getCodeBooking() {

    char[] alphanum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    String codestring = "";
    for (int i = 0; i < 8 ; i++) {
      Random ran = new Random();
      int randNum = ran.nextInt(alphanum.length);
      codestring += String.valueOf(alphanum[randNum]);
    }
    return codestring;
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Bookings to generate:");
    Integer input = scanner.nextInt();

    Reservations reservation = new Reservations();
    for (int i = 0; i < input; i++) {
      System.out.println("Booking# " + reservation.getCodeBooking() + " for " + reservation.getDowBooking());
    }
  }
}
