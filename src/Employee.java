import java.security.PublicKey;
import java.util.Objects;

public class Employee {
    private String name;
    private int department;
    private int wage;
    private int id;




    public Employee(String name, int department, int wage, int id) {
        this.name = name;
        this.department = department;
        this.wage = wage;
        this.id = id;
        }
    public String getName() {
        return name;
    }
    public int getWage() {
        return wage;
    }
    public int getDepartment() {
        return department;
    }
    public int getId() {
        return id;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return wage == employee.wage && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    public String getDep() {
        return "Employee{" +
//                ", id=" + id +
                "name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wage, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", id=" + id +
                "name='" + name + '\'' +
                ", department=" + department +
                ", wage=" + wage +
                '}';
    }
}
