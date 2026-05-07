package lambdaexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return String.format("%s (%s) - %d원", name, department, salary);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("김철수", "개발팀", 5000000),
                new Employee("이여희", "마케팅팀", 4500000),
                new Employee("박민수", "개발팀", 5500000),
                new Employee("정수진", "인사팀", 4000000),
                new Employee("최영수", "개발팀", 6000000)
        );

        Map<String, Double> avSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingInt(Employee::getSalary)
                ));

        System.out.println("=== 부서별 평균 급여===");
        avSalaryByDept.forEach((dept, avgSalary) ->
                System.out.printf("%s: %.0f원%n", dept, avgSalary));

        System.out.println("\n=== 금여 500만원 이상 개발팀 직원===");
        employees.stream()
                .filter(emp -> emp.getDepartment().equals("개발팀"))
                .filter(emp -> emp.getSalary() >= 5000000)
                .forEach(System.out::println);
    }
}
