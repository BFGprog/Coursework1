import java.security.PublicKey;
import java.util.Objects;

public class Employee {
    private String name;
    private int wage;
    private String department;



    public Employee(String name, String department, int wage) {
        this.name = name;
        this.department = department;
        this.wage = wage;
        }
    public String getName() {
        return name;
    }
    public int getWage() {
        return wage;
    }
    public String getDepartment() {
        return department;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return wage == employee.wage && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wage, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", wage=" + wage +
                '}';
    }
}
