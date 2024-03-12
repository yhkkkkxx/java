package bankapp;

import bank.Account;
import bank.RecurringDepositAccount;
import bank.SavingsAccount;

public class App {
    public static void main(String[] args) {
        Account regularAccount = new Account("12345", "John Doe", 100000);
        regularAccount.deposit(50000);
        regularAccount.withdraw(20000);
        regularAccount.printAccountInfo();


        // 예금
        SavingsAccount savingsAccount = new SavingsAccount("67890", "Alice Smith", 150000, 5.0, 2);
        long interestToAdd = (long) savingsAccount.calculateInterest();
        savingsAccount.addInterest(interestToAdd);
        savingsAccount.printAccountInfo();


        // 적금
        RecurringDepositAccount recurringDepositAccount = new RecurringDepositAccount("24680", "Bob Brown", 0, 4.0, 12, 10000);
        recurringDepositAccount.depositMonthly();
        double totalInterest = recurringDepositAccount.calculateInterest();
        double maturityAmount = recurringDepositAccount.calcMaturityAmount();
        recurringDepositAccount.printAccountInfo();
    }

}
