package ru.netology;

import ru.netology.account.Account;
import ru.netology.account.CreditAccount;
import ru.netology.account.SimpleAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(10000);
        CreditAccount creditAccount = new CreditAccount(60000, 50000);
        chooseAccount(simpleAccount, creditAccount);
    }

    public static void chooseAccount(Account simpleAccount, Account creditAccount) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        while (true) {
            System.out.println("Выберите счёт");
            System.out.println("1. Простой счёт");
            System.out.println("2. Кредитный счёт");
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    menu();
                    answer = scanner.nextInt();
                    switch (answer) {
                        case 0:
                            chooseAccount(simpleAccount, creditAccount);
                            break;
                        case 1:
                            System.out.println("Введите сумму");
                            simpleAccount.add(scanner.nextInt());
                        case 2:
                            System.out.println("Введите сумму");
                            creditAccount.pay(scanner.nextInt());
                        case 3:
                            System.out.println("Выберите счёт");
                            System.out.println("1. Простой счёт");
                            System.out.println("2. Кредитный счёт");
                            int account = scanner.nextInt();
                            switch (account) {
                                case 1:
                            }
                        default:
                            System.out.println("Неизвестная команда, повторите попытку.");
                            break;
                    }
                    break;
                case 2:
                    menu();
                    answer = scanner.nextInt();
                    switch (answer) {
                        case 0:
                            chooseAccount(simpleAccount, creditAccount);
                            break;
                        case 1:

                        default:
                            System.out.println("Неизвестная команда, повторите попытку.");
                            break;
                    }
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Выберите операцию:");
        System.out.println("0. Вернуться к выбору счёта");
        System.out.println("1. Положить деньги на счёт");
        System.out.println("2. Снять деньги со счёта");
        System.out.println("3. Перевести деньги на другой счёт");
        System.out.println("4. Положить деньги на счёт");
    }
}