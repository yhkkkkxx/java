package company;

public class SecretaryEmployee extends Employee {
    private String boss;

    public SecretaryEmployee(String boss) {
        this.boss = boss;
    }


    public SecretaryEmployee() {

    }

    public SecretaryEmployee(String id, String name, String dept, long salary, String boss) {
        super(id, name, dept, salary);
        this.boss = boss;
    }

    public String getBoss() {
        return boss;
    }

    @Override
    public String toString() {
        return "SecretaryEmployee{" +
                "boss='" + boss + '\'' +
                "} " + super.toString();
    }
}
