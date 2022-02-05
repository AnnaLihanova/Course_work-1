package ru.skypro.hard;

import ru.skypro.min.Employee;

public class Hard_Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);
        employeeBook.addEmployee(new Employee("Иванов", "Иван", "Иванович", 2, 50_000));
        employeeBook.addEmployee(new Employee("Романов", "Олег", "Игоревич", 5, 150_000));
        employeeBook.addEmployee(new Employee("Егоров", "Евгений", "Николаевич", 3, 60_000));
        employeeBook.addEmployee(new Employee("Кирюнина", "Ольга", "Васильевна", 1, 45_000));
        employeeBook.addEmployee(new Employee("Петрынькин", "Иван", "Иванович", 4, 66_000));
        employeeBook.addEmployee(new Employee("Козлов", "Игорь", "Александрович", 3, 37_000));
        employeeBook.addEmployee(new Employee("Рыбкина", "Татьяна", "Вячеславовна", 2, 98_000));
        employeeBook.addEmployee(new Employee("Власов", "Вячеслав", "Арнольдович", 3, 70_000));
        employeeBook.addEmployee(new Employee("Шерин", "Петр", "Романович", 1, 52_000));
        employeeBook.addEmployee(new Employee("Алехина", "Виктория", "Степановна", 3, 78_000));


        employeeBook.deleteEmployee("Козлов", "Игорь", "Александрович");

        employeeBook.addNewEmployee(new Employee("Жданов", "Олег", "Романович", 5, 56000));
        employeeBook.changeSalary("Алехина", "Виктория", "Степановна", 88000);
        employeeBook.changeDepartment("Алехина", "Виктория", "Степановна", 5);
        employeeBook.printListByDepartment();
        employeeBook.deleteEmployee("Власов", "Вячеслав", "Арнольдович");
        employeeBook.printAllAboutEmployee();
        employeeBook.printDepartmentMonthlySalary(3);
        employeeBook.printListByDepartment();
    }
}

