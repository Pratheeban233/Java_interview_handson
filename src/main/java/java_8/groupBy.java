package java_8;

import java.util.*;
import java.util.stream.Collectors;

public class groupBy {
    public static void main(String[] args) {
        groupBy_departmentName(Employee.getEmployeeList());
        countOfDept(Employee.getEmployeeList());
        sortBasedOnDeptAndSalary(Employee.getEmployeeList());
        findMinSalary(Employee.getEmployeeList());
        reduce(Employee.getEmployeeList());
        convertToArray(Employee.getEmployeeList());
        takeWhile(Employee.getEmployeeList());


    }

    private static void takeWhile(List<Employee> employeeList) {
        employeeList
                .stream()
                .filter(employee -> employee.getAge() > 35)
                .forEach(System.out::println);
    }


    private static void convertToArray(List<Employee> employeeList) {
        Employee[] employees = employeeList.toArray(Employee[]::new);
        System.out.println(employees[0]);
    }

    private static void reduce(List<Employee> employeeList) {
        Double reduce = employeeList.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println("reduce = " + reduce);
    }

    private static void findMinSalary(List<Employee> employeeList) {
        Optional<Employee> min = employeeList.stream()
                .min(Comparator.comparing(Employee::getSalary));
        System.out.println("min salary = " + min.get());
    }

    private static void sortBasedOnDeptAndSalary(List<Employee> employeeList) {
        List<Employee> collect = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary))
                .toList();
        System.out.println("sortBasedOnDeptAndSalary : \n" + collect);
    }


    private static void countOfDept(List<Employee> employeeList) {
        Map<String, Long> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("countOfDept : \n" + collect);
    }

    private static void groupBy_departmentName(List<Employee> employeeList) {
        Map<String, List<Employee>> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("groupBy_departmentName : \n" + collect);
    }


}
