package ru.skypro.min;

public class Employee {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private int department;
    private float salary;
    private static int idCounter = 1;
    private final int id;
    private final String fullName;

    public Employee(String lastName, String firstName, String middleName, int department, float salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
        this.fullName = lastName + " " + firstName + " " + middleName + " ";
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
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
        return getId() + ". " + getLastName() + " " + getFirstName() + " " + getMiddleName() + "; Департамент: " + getDepartment() + "; з/п: " + getSalary();
    }

    public String toStringDepartment() {
        return getId() + ". " + getLastName() + " " + getFirstName() + " " + getMiddleName() + "; з/п: " + getSalary();
    }
}