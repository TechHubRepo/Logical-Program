package com.techhub.collections;

import java.time.LocalDate;

public class Employee {

    private int employeeId;

    private String firstName;

    private String lastName;

    private LocalDate dateOfJoining;

    private double salary;

    private int jobLevel;

    private boolean confirmed;

    private String city;

    public Employee() {
    }

    public Employee(int employeeId, String firstName, String lastName, LocalDate dateOfJoining, double salary, int jobLevel, boolean confirmed, String city) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
        this.jobLevel = jobLevel;
        this.confirmed = confirmed;
        this.city = city;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(int jobLevel) {
        this.jobLevel = jobLevel;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + this.city + " " + this.lastName+
                ", dateOfJoining=" + dateOfJoining +
                ", salary=" + salary +
                ", jobLevel=" + jobLevel +
                ", confirmed=" + confirmed +
                ", city='" + city + '\'' +
                '}';
    }
}
