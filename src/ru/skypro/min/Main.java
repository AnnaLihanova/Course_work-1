package ru.skypro.min;

import static ru.skypro.min.Employee.*;

public class Main {
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
            if (employee != null) {
                sumMonthlySalary += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату в месяц: " + sumMonthlySalary);
    }

    public static void printAveradgeSunMonthlySalary(Employee[] employees) {
        float averadgeSunMonthlySalary = 0;
        float sumMonthlySalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumMonthlySalary += employee.getSalary();
                averadgeSunMonthlySalary = sumMonthlySalary / employees.length;
            }
        }
        System.out.println("Среднее значение зарплаты в месяц: " + averadgeSunMonthlySalary);
    }

    public static void printMaxSalary(Employee[] employees) {
        float maxSalary = employees[0].getSalary();
        int indexEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
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
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                indexEmployee = i;
            }
        }
        System.out.println("Минимальная зарплата у сотрудника: " + employees[indexEmployee].getFullName() + " и составляет: " + minSalary);
    }

    public static void printListEmployees(Employee[] employees) {
        System.out.println("Ф.И.О. сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public static void printIndexingSalary(Employee[] employees) {
        float indexSalary = 0.1f;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * indexSalary);
                System.out.println(employees[i].getFullName() + employees[i].getSalary());
            }
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