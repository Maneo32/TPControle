package org.example;

public class BankAccount {
    private double balance;
    private double decouvert;
    public BankAccount(){
        this.balance = 0;
        this.decouvert = 0;
    }

    public BankAccount(double balance, double decouvert) {
        this.balance = balance;
        this.decouvert = decouvert;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if(amount<0){
            throw new IllegalArgumentException("on ne peut pas ajouter du négatif");
        }
        balance += amount;
    }

    public void withdraw(double amount, double decouvert) throws IllegalArgumentException {
        if(amount<0){
            throw new IllegalArgumentException("on ne peut pas retirer du négatif");
        }
        if(balance - amount > decouvert){
            balance -= amount;
        }
        else{
            throw new IllegalArgumentException("Vous depassez le decouvert");

        }
    }

    public double checkBalance() {
        return balance;
    }
}