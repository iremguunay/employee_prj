package com.bilgeadam.employeeprj.test;

import com.bilgeadam.employeeprj.entity.Employee;

import java.util.Date;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee empOne = new Employee("Aziz Sancar");
        Employee empTwo = new Employee("Uğur Çoşkun");

        empOne.setAge(70);
        empOne.setDesignation("DNA Bilimi");
        empOne.setSalary(20000);
        empOne.setDogtar(new Date());
        System.out.println(empOne);
        empOne.printEmployee();

        empTwo.setAge(60);
        empTwo.setDesignation("Biyoteknoloji");
        empTwo.setSalary(1000000);
        empTwo.setDogtar(new Date());
        System.out.println(empTwo);
        empTwo.printEmployee();

    }
}
