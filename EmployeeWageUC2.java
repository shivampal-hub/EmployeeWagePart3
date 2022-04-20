package com.bl.employee;

import java.util.Random;

public class EmployeeWageUC2 {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWageUC2 emp = new EmployeeWageUC2();
        emp.employeeAttendance();

    }
    public void employeeAttendance() {

        int empCheck;
        int empHours;
        int wagePerHour = 20;
        int dailyWage;

        Random rand = new Random();
        empCheck = rand.nextInt(2);

        if(empCheck == 0) {

            System.out.println("Employee Absent");

        }

        else {

            System.out.println("Employee Present");
            empHours = 8;

            dailyWage = empHours * wagePerHour;
            System.out.println("Daily Wage of Employee is " +dailyWage);

        }
    }

}
