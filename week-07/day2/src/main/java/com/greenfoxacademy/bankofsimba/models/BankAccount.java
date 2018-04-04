package com.greenfoxacademy.bankofsimba.models;

import java.text.DecimalFormat;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  DecimalFormat df = new DecimalFormat("0.00");

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
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
