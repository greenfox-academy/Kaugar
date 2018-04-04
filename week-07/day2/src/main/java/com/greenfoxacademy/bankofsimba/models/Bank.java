package com.greenfoxacademy.bankofsimba.models;

import java.util.ArrayList;

public class Bank {
  ArrayList<BankAccount> accounts;

  public Bank() {
    accounts = new ArrayList<>();
    fill();
  }
  private void fill() {
    accounts.add(new BankAccount("Simba", 2000, "lion"));
    accounts.add(new BankAccount("Mufasa", 1000, "lion"));
    accounts.add(new BankAccount("Pumbaa", 5700, "warthog"));
    accounts.add(new BankAccount("Rafiki", 6456, "mandrill"));
    accounts.add(new BankAccount("Timon", 2056, "meerkat"));
    accounts.add(new BankAccount("Lion King", 99999, "lion"));
  }

  public ArrayList<BankAccount> getAccounts() {
    return accounts;
  }

  @Override
  public String toString() {
    return "Bank{" +
            "accounts=" + accounts +
            '}';
  }
}
