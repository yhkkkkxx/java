package bank;

public class SavingsAccount extends Account {
    private double interestRate;
    private int depositPeriod;

    public SavingsAccount() {
    }

    public SavingsAccount(String accNum, String custName, long balance, double interestRate, int depositPeriod) {
        super(accNum, custName, balance);
        this.interestRate = interestRate;
        this.depositPeriod = depositPeriod;
    }

    public void addInterest(long money) {
        deposit(money);
    }

    public double calculateInterest() {
        return getBalance() * (interestRate / 100) * depositPeriod;
    }

    @Override
    public void printAccountInfo() {
        System.out.println("<예금>");
        super.printAccountInfo();
        System.out.println("이자율: " + interestRate + "%,");
        System.out.println("예금 기간: " + depositPeriod + "년,");
        System.out.println("예상 이자: " + calculateInterest() + "원");
    }
}
