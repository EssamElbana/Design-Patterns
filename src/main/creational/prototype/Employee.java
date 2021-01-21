package main.creational.prototype;

public class Employee implements ProtoType {

    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public Employee() {

    }

    public Employee(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showEmployee() {
        System.out.println("id " + id
        + " name " + name
        + " designation " + designation
        + " salary " + salary
        + " address " + address);
    }
    @Override
    public ProtoType getClone() {
        return new Employee(id, name, designation, salary, address);
    }
}
