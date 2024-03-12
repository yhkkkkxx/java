package bank;

public class RecurringDepositAccount extends Account {
    private double interestRate;
    private int termLength;
    private int monthlyDepositAmount;

    public RecurringDepositAccount() {
    }

    public RecurringDepositAccount(String accNum, String custName, long balance, double interestRate, int termLength, int monthlyDepositAmount) {
        super(accNum, custName, balance);
        this.interestRate = interestRate;
        this.termLength = termLength;
        this.monthlyDepositAmount = monthlyDepositAmount;
    }

    public void depositMonthly() {
        for (int i = 0; i < termLength; i++) {
            deposit(monthlyDepositAmount);
        }
    }

    public double calculateInterest() {
        double interest = 0;
        for (int i = 0; i < termLength; i++) {
            interest += (getBalance() + monthlyDepositAmount * i) * (interestRate / 100) / 12;
        }
        return interest;
    }

    public double calcMaturityAmount() {
        return this.getBalance() + calculateInterest();
    }

    @Override
    public void printAccountInfo() {
        System.out.println("<적금>");
        super.printAccountInfo();
        System.out.println("이자율: " + interestRate +"%,");
        System.out.println("적금 기간: " + termLength +"개월,");
        System.out.println("월 납부 금액: " + monthlyDepositAmount +"원,");
        System.out.println("총 이자: " + calculateInterest() + "원,");
        System.out.println("만기 시 총 적금 금액: " + calcMaturityAmount() + "원");
    }
}
