package com.workintech.developers;

public class HRManager extends Employee {
    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing human resources.");
    }
}