public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иванов Иван0", 1, 35_000);
        employeeBook.addEmployee("Иванов Иван1", 2, 36_000);
        employeeBook.addEmployee("Иванов Иван2", 3, 37_000);
        employeeBook.addEmployee("Сидоров Иван1", 3, 38_000);
        employeeBook.addEmployee("Сидоров Иван2", 2, 39_000);
        employeeBook.addEmployee("Сидоров Иван3", 4, 40_000);
        employeeBook.addEmployee("Петров Иван1", 1, 40_000);
        employeeBook.addEmployee("Петров Иван2", 2, 41_000);
        employeeBook.addEmployee("Петров Иван3", 5, 42_000);
        employeeBook.addEmployee("Петров Иван4", 5, 45_000);


        System.out.println("Очень сложно");
        employeeBook.printAllEmployee();
        System.out.println("Размер списка сотрудников: " + employeeBook.getEmployeeSize());
        System.out.println("ЗП в месяц: " + employeeBook.isWageMonth());
        System.out.println("Минимальная ЗП: " + employeeBook.isWageMin());
        System.out.println("Максимальная ЗП: " + employeeBook.isWageMax());
        System.out.println("Средняя ЗП: " + employeeBook.isWageMedium());

        System.out.println();



        // Базовая сложность
        System.out.println("\n" + "Базовая сложность");
        // Получить список всех сотрудников со всеми имеющимися по ним данными
        // (вывести в консоль значения всех полей (toString));
        employeeBook.printAllEmployee();
        // Посчитать сумму затрат на ЗП в месяц;
        System.out.println(employeeBook.isWageMonth());
        // Найти сотрудника с минимальной ЗП;
        System.out.println(employeeBook.isWageMin());
        // Найти сотрудника с максимальной ЗП;
        System.out.println(employeeBook.isWageMax());
        // Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b);
        System.out.println(employeeBook.isWageMedium());
        // Распечатать ФИО всех сотрудников (метод ничего???).
        employeeBook.printAllName();

        // Повышенная сложность
        System.out.println("\n" + "Повышенная сложность");
        // Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
        employeeBook.performWageIndexation(0);
        // Получить в качестве параметра номер отдела (1-5) и найти (всего 6 методов):
        // Сотрудника с минимальной зп;
        employeeBook.isWageMinDepartment(2);
        // Сотрудника с максимальной зп;
        employeeBook.isWageMaxDepartment(3);
        // Сумму затрат на зп по отделу;
        employeeBook.isWageMonthDepartment(1);
        // Среднюю зп по отделу (учесть, что количество людей в отделе отличается от employees.length);
        employeeBook.isWageMediumDepartment(1);
        // Проиндексировать зарплату всех сотрудников отдела на процент, который
        // приходит в качестве параметра;
        employeeBook.performWageIndexationDepartment(10, 5);
        // Напечатать всех сотрудников отдела (все данные, кроме отдела).
        employeeBook.printAllEmployeeDepartment(1);
        // Получить в качестве параметра число и вывести:
        // Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль);
        employeeBook.printWageLess(40_000);
        // Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль).
        employeeBook.printWageMore(40_500);





    }
}