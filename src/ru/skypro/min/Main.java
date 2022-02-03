package ru.skypro.min;

import static ru.skypro.min.Employee.*;
import static ru.skypro.min.Employee.printMinSalary;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        Employee newEmployee = new Employee("Иванов", "Иван", "Иванович", 2, 50_000);
        addEmployee(employees, newEmployee);
        addEmployee(employees, new Employee("Романов", "Олег", "Игоревич", 5, 150_000));
        addEmployee(employees, new Employee("Егоров", "Евгений", "Николаевич", 3, 90_000));
        addEmployee(employees, new Employee("Кирюнина", "Ольга", "Васильевна", 1, 45_000));
        addEmployee(employees, new Employee("Власов", "Вячеслав", "Арнольдович", 3, 80_000));
        addEmployee(employees, new Employee("Петрынькин", "Иван", "Иванович", 4, 66_000));
        addEmployee(employees, new Employee("Козлов", "Игорь", "Александрович", 3, 37_000));
        addEmployee(employees, new Employee("Рыбкина", "Татьяна", "Вячеславовна", 2, 98_000));
        addEmployee(employees, new Employee("Шерин", "Петр", "Романович", 1, 52_000));
        addEmployee(employees, new Employee("Алехина", "Виктория", "Степановна", 3, 78_000));


        printAllAboutEmployee(employees);
        printSunMonthlySalary(employees);
        printAveradgeSunMonthlySalary(employees);
        printMaxSalary(employees);
        printMinSalary(employees);
        printListEmployees(employees);
    }
}