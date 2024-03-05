import java.util.Arrays;

public class TestLinkedListAndSorting {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");

        System.out.println("Linked List elements:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        Employee[] employees = {
                new Employee("John", 25, 50000),
                new Employee("Alice", 30, 60000),
                new Employee("Bob", 28, 55000)
        };

        System.out.println("\nUnsorted Employees:");
        Arrays.stream(employees).forEach(System.out::println);

        Arrays.sort(employees);
        System.out.println("\nSorted Employees (by age):");
        Arrays.stream(employees).forEach(System.out::println);

        Arrays.sort(employees, new EmployeeSalaryComparator());
        System.out.println("\nSorted Employees (by salary):");
        Arrays.stream(employees).forEach(System.out::println);
    }
}
