public class EmployeeBook {
    private Employee[] employees;
//    private int size;

    public EmployeeBook() {
        this.employees = new Employee[5];
    }

    public void addEmployee(String name, int wage) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee employee = new Employee(name, wage);
                employees[i] = employee;
                return;
            } else if (i == employees.length - 1) {
                System.out.println("массив переполнен");
                return;
            }
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
                System.out.println(employees[i].getName() + "delete");
                employees[i] = null;
                return;
            } else if (i == employees.length - 1) {
                System.out.println("Сотрудник " + name + " не найден");
                return;
            }
        }
    }
    public void delEmployee(int j) {
        for (int i = 0; i == j; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName() + "delete");
                employees[i] = null;
                return;
            } else if (i == employees.length - 1) {
                System.out.println("Сотрудник по id " + j + " не найден");
                return;
            }
        }
    }




}
