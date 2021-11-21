package com.bilgeadam.employeeprj.test;

import com.bilgeadam.employeeprj.entity.Employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee empOne = new Employee("Aziz Sancar");
        Employee empTwo = new Employee("Uğur Çoşkun");

        empOne.setAge(70);
        empOne.setDesignation("DNA Bilimi");
        empOne.setSalary(20000);
        System.out.println(empOne);

        empTwo.setAge(60);
        empTwo.setDesignation("Biyoteknoloji");
        empTwo.setSalary(1000000);
        System.out.println(empTwo);

    }
}
