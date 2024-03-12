package bank;

public class Account {
    private String accNum;
    private String custName;
    private long balance;

    public Account() {
    }

    public Account(String accNum, String custName, long balance) {
        this.accNum = accNum;
        this.custName = custName;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(long money) {
        this.balance += money;
    }

    public void withdraw(long money) {
        if(this.balance >= money) this.balance -= money;
        else return;
    }


    public void printAccountInfo() {
        System.out.println("계좌 번호 "+this.accNum+", "+this.custName+" 고객님, 현재 잔고는 "+this.balance+"원 입니다.");
    }
}

