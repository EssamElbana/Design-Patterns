package main.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(15666,
                "Ahmed",
                "IT",
                7000,
                "1st, Square, Cairo City");
        Employee employee1 = (Employee) employee.getClone();

        System.out.println("Employee: " + employee.hashCode());
        employee.showEmployee();
        System.out.println("Employee1: " + employee1.hashCode());
        employee1.showEmployee();
    }
}
