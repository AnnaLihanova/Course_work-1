package ru.skypro.hard;

import ru.skypro.min.Employee;

public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int size) {
        employees = new Employee[size];
    }

    public boolean addEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public void printAllAboutEmployee() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public void printSunMonthlySalary() {
        float sumMonthlySalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumMonthlySalary += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату в месяц: " + sumMonthlySalary);
    }

    public void printAveradgeSunMonthlySalary() {
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

    public void printMaxSalary() {
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

    public void printMinSalary() {
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

    public void printListEmployees() {
        System.out.println("Ф.И.О. сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public void printIndexingSalary() {
        float indexSalary = 0.1f;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * indexSalary);
                System.out.println(employees[i].getFullName() + employees[i].getSalary());
            }
        }
    }

    public void printDepartmentMaxSalary(int department) {
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

    public void printDepartmentMinSalary(int department) {
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

    public void printDepartmentMonthlySalary(int department) {
        float sumMonthlyDepartmentSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                sumMonthlyDepartmentSalary += employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу за месяц: " + sumMonthlyDepartmentSalary);
    }

    public void printAverageDepartmentSalary(int department) {
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

    public void printIndexingDepartmentSalary(int department) {
        float indexSalary = (float) 0.1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * indexSalary);
                System.out.println(employees[i].getFullName() + employees[i].getSalary());
            }
        }
    }

    public void printAllAboutEmployeeDepartment(int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                System.out.println(employees[i].toStringDepartment());
            }
        }
    }

    public void printEmployeeDepartmentWhoHasMin(int department, int number) {
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null && employees[i].getDepartment() == department) && employees[i].getSalary() < number) {
                System.out.println(employees[i].toStringDepartment());
            }
        }
    }

    public void printEmployeeDepartmentWhoHasMax(int department, int number) {
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null && employees[i].getDepartment() == department) && employees[i].getSalary() >= number) {
                System.out.println(employees[i].toStringDepartment());
            }
        }
    }

    public void deleteEmployee(String lastName, String firstName, String middleName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getLastName().equals(lastName) && employees[i].getFirstName().equals(firstName) && employees[i].getMiddleName().equals(middleName)) {
                employees[i] = null;
                return;
            }
        }
    }

    //Этот метод уже был создан в базовом уровне:
    public void addNewEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
            }
        }
    }

    public void changeSalary(String lastName, String firstName, String middleName, float newSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getLastName().equals(lastName) && employees[i].getFirstName().equals(firstName) && employees[i].getMiddleName().equals(middleName)) {
                employees[i].setSalary(newSalary);
            }
        }
    }

    public void changeDepartment(String lastName, String firstName, String middleName, int newDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getLastName().equals(lastName) && employees[i].getFirstName().equals(firstName) && employees[i].getMiddleName().equals(middleName)) {
                employees[i].setDepartment(newDepartment);
            }
        }
    }

    public void printListByDepartment() {
        int numberDepartment = 1;
        int maxNumberDepartment = 5;
        do {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDepartment() == numberDepartment) {
                    System.out.println("Отдел № " + employees[i].getDepartment() + " - " + employees[i].getFullName());
                }
            }
            System.out.println("===============");
            numberDepartment++;
        } while (numberDepartment <= maxNumberDepartment);

    }
}

