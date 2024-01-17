package ru.netology.account;

public class CreditAccount extends Account {
    long creditLimit;
    long initialBalance;
    long limit;

    public CreditAccount(long balance, long creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
        this.initialBalance = balance;
    }

    @Override
    public boolean add(long amount) {
        long balanceCount = balance + amount;
        if (balanceCount > initialBalance) {
            return false;
        } else if (balanceCount <= initialBalance) {
            balance = balanceCount;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        long limitCount = limit + amount;
        if (limitCount > creditLimit) {
            return false;
        } else if (balance < 0) {
            return false;
        } else if (balance >= 0 || limitCount <= creditLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        boolean pay = pay(amount);
        if (pay) {
            boolean add = account.add(amount);
            if (add) {
                return true;
            } else if (!add) {
                balance += amount;
            }
        } else if (!pay) {
            return false;
        }
        return false;
    }

    @Override
    public long getBalance() {
        return balance;
    }
}