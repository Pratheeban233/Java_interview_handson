package completableFutureDemo;

import java_8.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CompletableFutureDemo {

    public void testRunAsync(List<Employee> employeeList) throws ExecutionException, InterruptedException {

        Executor executor = Executors.newFixedThreadPool(5);

        CompletableFuture<Void> runAsync = CompletableFuture.runAsync(() -> employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println), executor);
        System.out.println("Thread : " + Thread.currentThread().getName());
        runAsync.get();

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFutureDemo futureDemo = new CompletableFutureDemo();
        futureDemo.testRunAsync(Employee.getEmployeeList());
    }
}
