public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иванов Иван", "1", 35_000);
        employeeBook.addEmployee("Иванов Иван", "2", 36_000);
        employeeBook.addEmployee("Иванов Иван", "3", 37_000);
        employeeBook.addEmployee("Сидоров Иван", "1", 38_000);
        employeeBook.addEmployee("Сидоров Иван", "2", 39_000);
        employeeBook.addEmployee("Сидоров Иван", "4", 40_000);
        employeeBook.addEmployee("Петров Иван", "1", 40_000);
        employeeBook.addEmployee("Петров Иван", "2", 41_000);
        employeeBook.addEmployee("Петров Иван", "5", 42_000);
        // 9 сотрудников
        // Всего ЗП 348_000

        System.out.println("Сотрудники:");
        employeeBook.printAllEmployee();
        System.out.println("Размер списка сотрудников: " + employeeBook.getEmployeeSize());
        System.out.println("ЗП в месяц: " + employeeBook.isWageMonth());
        System.out.println("Минимальная ЗП: " + employeeBook.isWageMin());
        System.out.println("Максимальная ЗП: " + employeeBook.isWageMax());
        System.out.println("Средняя ЗП: " + employeeBook.isWageMedium());

        System.out.println();






    }
}