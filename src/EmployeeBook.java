import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees;
    private int size;


    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String name, String department, int wage) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().isEmpty()) {
                Employee employee = new Employee(name, department, wage);
                employees[i] = employee;
                size++;
                return;
            }
            System.out.println("массив переполнен");
        }
//        if (size >= employees.length) {
//            System.out.println("массив переполнен");
//        } else {
//            Employee employee = new Employee(name, wage);
//            employees[size++] = employee;
//        }
    }

    public void delEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                System.out.println(employees[i].getName() + " delete");
                employees[i] = null;
                size--;
                return;
            }
        }
        System.out.println("Сотрудник " + name + " не найден");
    }
    public void delEmployee(int j) {
//        for (int i = 0; i == j; i++) {
            if (employees[j].getName().isEmpty() != false) {
                System.out.println(employees[j].getName() + "delete");
                employees[j] = null;
                size--;
                return;
            }
//        }
        System.out.println("Сотрудник по id " + j + " не найден");
    }
    public void printAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
//            Employee employee = employees[i];
            System.out.println(employees[i].toString());
//            System.out.println(employee.getName() + " " + employee.getDepartment()
//                    + ": " + employee.getWage());
        }
    }
    public int getEmployeeSize() {
        return size;
    }

    public int isWageMonth() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getWage();
        }
        return sum;
    }

    public String isWageMin() {
        int wageMin = employees[0].getWage();
        String name = "";
        for (int i = 0; i < employees.length; i++) {
            if (wageMin > employees[i].getWage()) {
                wageMin = employees[i].getWage();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (wageMin == employees[i].getWage()) {
                name = employees[i].getName() + " " + employees[i].getWage();
                return name;
            }
        }
        return "0";
    }
    public String isWageMax() {
        int wageMax = employees[0].getWage();
        String name = "";
        for (int i = 0; i < employees.length; i++) {
            if (wageMax < employees[i].getWage()) {
                wageMax = employees[i].getWage();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (wageMax == employees[i].getWage()) {
                name = employees[i].getName() + " " + employees[i].getWage();
                return name;
            }
        }
        return "0";
    }

    public int isWageMedium() {
        int medium = 0;
        medium = isWageMonth() / size;
        return medium;
    }

    @Override
    public String toString() {
        return "EmployeeBook{" +
                "employees=" + Arrays.toString(employees) +
                ", size=" + size +
                '}';
    }
}
