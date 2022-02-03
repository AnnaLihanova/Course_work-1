package ru.skypro.min;

import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private final String lastNameEmployee;
    private final String firstNameEmployee;
    private final String middleNameEmployee;
    private int department;
    private float salary;
    private static int idCounter = 1;
    private final int id;
    private final String fullName;

    public Employee(String lastNameEmployee, String firstNameEmployee, String middleNameEmployee, int department, float salary) {
        this.lastNameEmployee = lastNameEmployee;
        this.firstNameEmployee = firstNameEmployee;
        this.middleNameEmployee = middleNameEmployee;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
        this.fullName = lastNameEmployee + " " + firstNameEmployee + " " + middleNameEmployee + " ";
    }

    public String getLastNameEmployee() {
        return lastNameEmployee;
    }

    public String getFirstNameEmployee() {
        return firstNameEmployee;
    }

    public String getMiddleNameEmployee() {
        return middleNameEmployee;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        return getId() + ". " + getLastNameEmployee() + " " + getFirstNameEmployee() + " " + getMiddleNameEmployee() + "; Департамент: " + getDepartment() + "; з/п: " + getSalary();
    }

    public String toStringDepartment() {
        return getId() + ". " + getLastNameEmployee() + " " + getFirstNameEmployee() + " " + getMiddleNameEmployee() + "; з/п: " + getSalary();
    }

    public static boolean addEmployee(Employee[] employees, Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public static void printAllAboutEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static void printSunMonthlySalary(Employee[] employees) {
        float sumMonthlySalary = 0;
        for (Employee employee : employees) {
            sumMonthlySalary += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплату в месяц: " + sumMonthlySalary);
    }

    public static void printAveradgeSunMonthlySalary(Employee[] employees) {
        float averadgeSunMonthlySalary = 0;
        float sumMonthlySalary = 0;
        for (Employee employee : employees) {
            sumMonthlySalary += employee.getSalary();
            averadgeSunMonthlySalary = sumMonthlySalary / employees.length;
        }
        System.out.println("Среднее значение зарплаты в месяц: " + averadgeSunMonthlySalary);
    }

    public static void printMaxSalary(Employee[] employees) {
        float maxSalary = employees[0].getSalary();
        int indexEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        System.out.println("Максимальная зарплата у сотрудника: " + employees[indexEmployee].getFullName() + " и составляет: " + maxSalary);
    }

    public static void printMinSalary(Employee[] employees) {
        float minSalary = employees[0].getSalary();
        int indexEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        System.out.println("Минимальная зарплата у сотрудника: " + employees[indexEmployee].getFullName() + " и составляет: " + minSalary);
    }

    public static void printListEmployees(Employee[] employees) {
        System.out.println("Ф.И.О. сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public static void printIndexingSalary(Employee[] employees) {
        float indexSalary = (float) 0.1;
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * indexSalary);
            System.out.println(employees[i].getFullName() + employees[i].getSalary());
        }
    }

    public static void printDepartmentMaxSalary(Employee[] employees, int department) {
        float maxSalary = employees[0].getSalary();
        int indexEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null && employees[i].getDepartment() == department) && (employees[i].getSalary() > maxSalary)) {
                maxSalary = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        System.out.println("Максимальная зарплата у сотрудника отдела № " + employees[indexEmployee].getDepartment() + " " + employees[indexEmployee].getFullName() + " и составляет: " + maxSalary);
    }

    public static void printDepartmentMinSalary(Employee[] employees, int department) {
        float minSalary = employees[0].getSalary();
        int indexEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null && employees[i].getDepartment() == department) && (employees[i].getSalary() < minSalary)) {
                minSalary = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        System.out.println("Минимальная зарплата у сотрудника отдела № " + employees[indexEmployee].getDepartment() + " " + employees[indexEmployee].getFullName() + " и составляет: " + minSalary);
    }

    public static void printDepartmentMonthlySalary(Employee[] employees, int department) {
        float sumMonthlyDepartmentSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                sumMonthlyDepartmentSalary += employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу за месяц: " + sumMonthlyDepartmentSalary);
    }

    public static void printAverageDepartmentSalary(Employee[] employees, int department) {
        float averadgeSunMonthlyDepartmentSalary = 0;
        float sumMonthlyDepartmentSalary = 0;
        int numCounter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                sumMonthlyDepartmentSalary += employees[i].getSalary();
                numCounter++;
            }
        }
        averadgeSunMonthlyDepartmentSalary = sumMonthlyDepartmentSalary / numCounter;
        System.out.println("Среднее значение зарплаты по отделу за месяц: " + averadgeSunMonthlyDepartmentSalary);
    }

    public static void printIndexingDepartmentSalary(Employee[] employees, int department) {
        float indexSalary = (float) 0.1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * indexSalary);
                System.out.println(employees[i].getFullName() + employees[i].getSalary());
            }
        }
    }

    public static void printAllAboutEmployeeDepartment(Employee[] employees, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                System.out.println(employees[i].toStringDepartment());
            }
        }
    }

    public static void printEmployeeDepartmentWhoHasMin(Employee[] employees, int department, int number) {
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null && employees[i].getDepartment() == department) && employees[i].getSalary() < number) {
                System.out.println(employees[i].toStringDepartment());
            }
        }
    }

    public static void printEmployeeDepartmentWhoHasMax(Employee[] employees, int department, int number) {
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null && employees[i].getDepartment() == department) && employees[i].getSalary() >= number) {
                System.out.println(employees[i].toStringDepartment());
            }
        }
    }
}