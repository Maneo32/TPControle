package org.example;

import java.util.HashMap;
import java.util.Map;

public class BankAccountManager {

    public Map<Integer, BankAccount> accounts;

    public BankAccountManager(Map<Integer, BankAccount> accounts) {
        this.accounts = accounts;
    }

    public BankAccountManager() {
        accounts = new HashMap<>();
    }

    public void create(int accountId) {
        accounts.put(accountId, new BankAccount());
    }

    public void deposit(int accountId, double amount) {
        accounts.get(accountId).deposit(amount);
    }

    public void withdraw(int accountId, double amount, double decouvert) {
        accounts.get(accountId).withdraw(amount, decouvert);

    }

    public double getBalance(int accountId) {
        return accounts.get(accountId).checkBalance();
    }
}