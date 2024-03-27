import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees;
    static int size;
    private int id;


    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    // Очень сложно
    public void addEmployee(String name, int department, int wage) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                id = 0;
                Employee employee = new Employee(name, department, wage, id);
                employees[i] = employee;
                size++;
                return;
            }
        }
        System.out.println("массив переполнен");
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

    public void delEmployee(int emp) {
        for (int i = 0; i == employees.length; i++) {
            if (employees[i].getId() == emp) {
                System.out.println(employees[i].getName() + "delete");
                employees[i] = null;
                size--;
                return;
            }
        }
        System.out.println("Сотрудник по id " + emp + " не найден");
    }

    @Override
    public String toString() {
        return "EmployeeBook{" +
//                ", id=" + id +
                "employees=" + Arrays.toString(employees) +
                '}';
    }

    // Сложно
    public void printAllEmployee() {
        System.out.println("Cписок всех данных сотрудников: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
    public int getEmployeeSize() {
        return size;
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
            }
        }
        return name;
    }

    public int isWageMonth() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getWage();
        }
        return sum;
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
            }
        }
        return name;
    }

    public int isWageMedium() {
        int medium = 0;
        medium = isWageMonth() / size;
        return medium;
    }
    // Dcnfdrf

    public void printAllName(){
        System.out.println("Полный список: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }

    public void performWageIndexation(double percent) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setWage(employees[i].getWage() * (int) (1 + percent / 100.0));
        }
    }

    // Повышенная сложность

    public String isWageMinDepartment(int dep) {
        int wageMin = -1;
        String name = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == dep) {
                wageMin = employees[i].getWage();
                if (wageMin > employees[i].getWage()) {
                    wageMin = employees[i].getWage();
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (wageMin == employees[i].getWage()) {
                name = employees[i].getName() + " " + employees[i].getWage();
            }
        }
        return name;
    }
    public String isWageMaxDepartment(int dep) {
        int wageMax = -1;
        String name = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == dep) {
                wageMax = employees[i].getWage();
                if (wageMax < employees[i].getWage()) {
                    wageMax = employees[i].getWage();
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (wageMax == employees[i].getWage()) {
                name = employees[i].getName() + " " + employees[i].getWage();
            }
        }
        return name;
    }
    public int isWageMonthDepartment(int dep) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == dep) {
                sum = sum + employees[i].getWage();
            }
        }
        return sum;
    }
    public int isWageMediumDepartment(int dep) {
        int medium = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == dep) {
                count++;
            }
        }
        medium = isWageMonthDepartment(dep) / count;
        return medium;
    }
    public void performWageIndexationDepartment(double percent, int dep) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == dep) {
                employees[i].setWage(employees[i].getWage() * (int) (1 + percent / 100.0));
            }
        }
    }
    public void printAllEmployeeDepartment(int dep) {
        System.out.println("Cписок всех сотрудников отдела " + dep + ": ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == dep) {
                System.out.println(employees[i].getDep());
            }
        }
    }

    public void printWageLess(int wage) {
        System.out.println("Cписок всех сотрудников с зарплатой ниже - " + wage + ": ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getWage() <= wage) {
                System.out.println(employees[i].getDep());
            }
        }
    }
    public void printWageMore(int wage) {
        System.out.println("Cписок всех сотрудников с зарплатой больше - " + wage + ": ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getWage() >= wage) {
                System.out.println(employees[i].getDep());
            }
        }
    }




}
