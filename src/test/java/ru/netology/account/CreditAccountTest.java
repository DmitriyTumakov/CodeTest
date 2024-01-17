package ru.netology.account;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {
    @Test
    void creditAccountAddFail() {
        // given:
        CreditAccount creditAccount = new CreditAccount(1000, 5000);

        // when:
        creditAccount.add(2000);
        long balance = creditAccount.balance;

        // then:
        Assertions.assertEquals(1000, balance);
    }

    @Test
    void creditAccountAddSuccess() {
        // given:
        CreditAccount creditAccount = new CreditAccount(5000, 10_000);

        // when:
        creditAccount.pay(2000);
        creditAccount.add(1000);
        long balance = creditAccount.balance;

        // then:
        Assertions.assertEquals(4000, balance);
    }

    @Test
    void creditAccountPayFail() {
        // given:
        CreditAccount creditAccount = new CreditAccount(1000, 5000);

        // when:
        creditAccount.pay(15_000);
        long balance = creditAccount.balance;

        // then:
        Assertions.assertEquals(1000, balance);
    }

}