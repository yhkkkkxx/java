package array;

public class Customer {
    private String name;
    private  String pwd;

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name, String pwd, String id) {
        this.name = name;
        this.pwd = pwd;
        this.id = id;
    }
}