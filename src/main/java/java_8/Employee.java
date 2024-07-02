package java_8;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String department;
    private String jobTitle;
    private boolean isManager;
    private int yearsOfService;

    public Employee(String name, int age, double salary, String department, String jobTitle, boolean isManager, int yearsOfService) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.jobTitle = jobTitle;
        this.isManager = isManager;
        this.yearsOfService = yearsOfService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", isManager=" + isManager +
                ", yearsOfService=" + yearsOfService +
                '}';
    }

    public static List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", 25, 50000.0, "Sales", "Sales Rep", false, 2));
        employees.add(new Employee("Bob", 30, 60000.0, "Marketing", "Marketing Manager", true, 5));
        employees.add(new Employee("Charlie", 35, 70000.0, "Finance", "Financial Analyst", false, 3));
        employees.add(new Employee("Dave", 40, 80000.0, "Engineering", "Software Engineer", false, 7));
        employees.add(new Employee("Emily", 28, 55000.0, "Sales", "Sales Manager", true, 4));
        employees.add(new Employee("Frank", 33, 65000.0, "Marketing", "Marketing Coordinator", false, 2));
        employees.add(new Employee("Grace", 37, 75000.0, "Finance", "Finance Manager", true, 6));
        employees.add(new Employee("Henry", 42, 85000.0, "Engineering", "Senior Software Engineer", false, 10));
        employees.add(new Employee("Irene", 29, 60000.0, "Sales", "Sales Rep", false, 1));
        employees.add(new Employee("Jack", 31, 65000.0, "Marketing", "Marketing Specialist", false, 3));
        employees.add(new Employee("Kate", 34, 75000.0, "Finance", "Financial Analyst", false, 4));
        employees.add(new Employee("Luke", 39, 85000.0, "Engineering", "Software Architect", true, 8));
        employees.add(new Employee("Megan", 27, 55000.0, "Sales", "Sales Rep", false, 1));
        employees.add(new Employee("Nick", 32, 60000.0, "Marketing", "Marketing Coordinator", false, 2));
        employees.add(new Employee("Olivia", 36, 70000.0, "Finance", "Finance Manager", true, 5));
        employees.add(new Employee("Pete", 41, 80000.0, "Engineering", "Senior Software Engineer", false, 9));
        employees.add(new Employee("Quinn", 30, 55000.0, "Sales", "Sales Rep", false, 2));
        employees.add(new Employee("Riley", 33, 65000.0, "Marketing", "Marketing Manager", true, 4));
        employees.add(new Employee("Samantha", 38, 75000.0, "Finance", "Financial Analyst", false, 6));
        employees.add(new Employee("Tom", 43, 85000.0, "Engineering", "Software Engineer", false, 5));

        return employees;
    }
}