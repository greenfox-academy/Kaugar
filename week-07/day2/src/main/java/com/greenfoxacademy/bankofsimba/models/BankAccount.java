package com.greenfoxacademy.bankofsimba.models;

import java.text.DecimalFormat;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private boolean isBad;
  DecimalFormat df = new DecimalFormat("0.00");

  public BankAccount(String name, double balance, String animalType, boolean isKing, boolean isBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isBad = isBad;
  }

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = false;
    this.isBad = false;

  }

  public String getName() {
    return name;
  }

  public String getBalance() {
    return df.format(balance);
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isBad() {
    return isBad;
  }

  public void setBad(boolean bad) {
    isBad = bad;
  }

  @Override
  public String toString() {
    return "BankAccount{" +
            "name='" + name + '\'' +
            ", balance=" + df.format(balance) + "Zebra" +
            ", animalType='" + animalType + '\'' +
            '}';
  }
}
