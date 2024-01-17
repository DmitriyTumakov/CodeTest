package ru.netology.account;

public abstract class Account {
    protected long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public abstract boolean transfer(Account account, long amount);

    public abstract long getBalance();
}
