package company;

public class Employee {
    private int id;
    private String idc;
    private String name;
    private long sal;

    public Employee() {

    }

    public Employee(int id, String idc, String name, long sal) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getIdc() {
        return idc;
    }

    public String getName() {
        return name;
    }

    public long getSal() {
        return sal;
    }

    //Method, Operator
    public long getAnnSalary() {
        return sal * 12;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", idc='" + idc + '\'' +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
