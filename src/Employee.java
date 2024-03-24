import java.security.PublicKey;

public class Employee {
    private String name;
    private int wage;

    public Employee(String name, int wage) {
        this.name = name;
        this.wage = wage;
        }
    public String getName() {
        return name;
    }
    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
