package company;

public class SalesEmployee extends Employee {
    private long bonus;

    public SalesEmployee() {
    }

    public SalesEmployee(String id, String name, String dept, long salary, long bonus) {
        super(id, name, dept, salary);
        this.bonus = bonus;
    }

    public long getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "bonus=" + bonus +
                "} " + super.toString();
        //return super.toString() + this.bonus;
    }

    @Override
    public long getAnnSalary() {
        return (long) (this.getSalary() * 12 * 0.9 + this.bonus);
    }
}
