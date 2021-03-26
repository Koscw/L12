package com.company;

public class Employee {
    private final String name;

    public Employee(Pearson pearson) {
        this.name = pearson.getName();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
