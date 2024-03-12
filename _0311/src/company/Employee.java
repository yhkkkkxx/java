package company;

public class Employee {
    private int id;
    private String idc;
    private String name;
    private long sal;

    private static int num = 100;

    public Employee() {
        System.out.println("Default constructor...");
    }
    public Employee(int id) {
        this(id,"","");
        this.sal = 10000L;
    }
    public Employee(int id, String idc, String name) {
        this(id,"","",10000L);
    }

    public Employee(int id, String idc, String name, long sal) {
        this.id = num++;
        this.idc = idc;
        this.name = name;
        if(sal<=0)
        {
            //예외처리
        }
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
