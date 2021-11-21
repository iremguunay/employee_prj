package com.bilgeadam.employeeprj.entity;

import com.bilgeadam.ortak.Ortak;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

    private String name;
    private int age;
    private String designation;
    private double salary;
    private Date dogtar;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDogtar() {
        return dogtar;
    }

    public void setDogtar(Date dogtar) {
        this.dogtar = dogtar;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", doğum tarihi=" + dogtar +
                '}';
    }

    public void printEmployee() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getDesignation());
        System.out.println(getSalary());
        System.out.println(getDogtar());

        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //System.out.println(sdf.format(getDogtar()));

        System.out.println(Ortak.tarihToStr(getDogtar()));

        System.out.println("---------");
    }
}
