package ORIENTAÇÃO_À_OBJETOS.ACCOUNT_BANK;

import java.util.Locale;

public class AccountInfos {
    private int accountNumber;
    private String name, deposit;
    private double initialDeposit, balance;

    private double tax = 5.00;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDeposit(String deposit){
        this.deposit = deposit;
    }

    public String getDeposit(){
        return this.deposit;
    }

    public void setInitialDeposit(double initialDeposit){
        this.initialDeposit = initialDeposit;
    }

    public double getBalance(){
        return balance + initialDeposit;
    }

    public double valueDeposit(double value){
        return this.balance += value;
    }

    public double withdraw(double value){
        return this.balance -= value + tax;
    }
}


