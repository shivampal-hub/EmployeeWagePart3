package com.bl.employee;

import java.util.Random;

public class EmployeeWageUC1 {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWageUC1 emp = new EmployeeWageUC1();
        emp.employeeAttendance();

    }
    public void employeeAttendance() {

        int empCheck;

        Random rand = new Random();
        empCheck = rand.nextInt(2);

        if(empCheck == 0) {

            System.out.println("Employee Present");

        }

        else {

            System.out.println("Employee Absent");
        }
    }
}
