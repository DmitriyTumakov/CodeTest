package ru.netology.account;

public class SimpleAccount extends Account {

    public SimpleAccount(long balance) {
        super(balance);
    }

    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance < amount) {
            return false;
        } else if (balance >= amount) {
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
