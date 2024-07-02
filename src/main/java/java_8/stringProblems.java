package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stringProblems {

    public static void main(String[] args) {
        String  input = "hi Im Pratheeban, How are you doing";

        extractSubstringStartH(input);
        convertListObjIntoListString(Employee.getEmployeeList());
    }

    private static void convertListObjIntoListString(List<Employee> employeeList) {
        employeeList.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    private static void extractSubstringStartH(String input) {
        String[] str = input.split(" ");

        String joining = Arrays.stream(str)
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("h"))
                .collect(Collectors.joining(","));
        System.out.println(joining);
    }
}
