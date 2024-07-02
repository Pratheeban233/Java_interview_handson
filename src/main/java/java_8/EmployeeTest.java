package java_8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
    private static List<Employee> employeeList = Employee.getEmployeeList();

    public static void main(String[] args) {
        // Q1:What is the average age of all employees?
        getAverageAgeForAllEmployees();

        // Q2: How many employees work in the Sales department?
        getCountOfSalesDept();

        // Q3: What is the total salary of all managers?
        getTotalSalaryOfAllManagers();

        // Q4: Who is the highest-paid employee?
        getHighestPaidEmployee();

        // Q5: How many years of service do all employees have combined?
        getTotalYearsOfServiceByAllEmployees();

        // Q6: Who is the youngest employee?
        getYoungestEmployee();

        // Q7: What is the average salary of employees who work in the Engineering department?
        getAverageSalaryOfEngineeringDept();

        // Q8: How many employees have a job title that includes "Manager"?
        getManagersCount();

        // Q9: What is the total salary of all non-managers?
        getTotalSalaryOfNonManagers();

        // Q10: How many employees are over the age of 35 and have worked for at least 5 years?
        getCountOf35AgeAnd5YrsOfExpEmployees();

        //Q11: get highest second salary
        getHighestSecondSalary();

    }

    private static void getHighestSecondSalary() {

        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);
    }

    private static void getCountOf35AgeAnd5YrsOfExpEmployees() {
        long count = employeeList.stream()
                .filter(employee -> employee.getAge() > 35 && employee.getYearsOfService() >= 5)
                .count();
        System.out.println("\n getCountOf35AgeAnd5YrsOfExpEmployees = " + count);
    }

    private static void getTotalSalaryOfNonManagers() {
        double totalSalaryOfNonManagers = employeeList.stream()
                .filter(employee -> !employee.isManager())
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("\n getTotalSalaryOfNonManagers = " + totalSalaryOfNonManagers);
    }

    private static void getManagersCount() {
        long count = employeeList.stream()
                .filter(Employee::isManager)
                .count();
        System.out.println("\n getManagersCount =" + count);
    }

    private static void getAverageSalaryOfEngineeringDept() {
        Double engineeringAvgSalary = employeeList.stream()
                .filter(employee -> employee.getDepartment().equals("Engineering"))
                .collect(Collectors.averagingDouble(Employee::getSalary));

        System.out.println("\n getAverageSalaryOfEngineeringDept = " + engineeringAvgSalary);
    }

    private static void getYoungestEmployee() {
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .findFirst()
                .ifPresent(employee -> System.out.println("\n getYoungestEmployee \n = " + employee));

    }

    private static void getTotalYearsOfServiceByAllEmployees() {
        int totalYearsOfService = employeeList.stream()
                .mapToInt(Employee::getYearsOfService)
                .sum();
        System.out.println("\n getTotalYearsOfServiceByAllEmployees = " + totalYearsOfService);
    }

    private static void getHighestPaidEmployee() {
        employeeList.stream()
                .sorted((Comparator.comparing(Employee::getSalary))
                        .reversed())
                .findFirst()
                .ifPresent(employee -> System.out.println("\n getHighestPaidEmployee = \n" + employee));

    }

    private static void getTotalSalaryOfAllManagers() {
        Double aDouble = employeeList.stream()
                .filter(Employee::isManager)
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println("\n getTotalSalaryOfAllManagers = " + aDouble);
    }

    private static void getCountOfSalesDept() {
        long count = employeeList.stream()
                .filter(employee -> employee.getDepartment().equals("Sales")).count();
        System.out.println("\n getCountOfSalesDept = " + count);

    }


    private static void getAverageAgeForAllEmployees() {

        Double avg = employeeList.stream()
                .collect(Collectors.averagingInt(Employee::getAge));
        System.out.println("getAverageAgeForAllEmployees \n" + avg);

    }

}
