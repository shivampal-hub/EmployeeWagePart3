package com.bl.employee;

import java.util.Random;

public class EmployeeWageUC3 {

    static int empCheck;
    static int empHours;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWageUC3 emp = new EmployeeWageUC3();
        emp.employeeAttendance();

    }

    public void employeeAttendance() {

        Random rand = new Random();
        empCheck = rand.nextInt(3);

        if (empCheck == 0) {

            System.out.println("Employee Absent");

        }

        else if (empCheck == 1) {

            System.out.println("Employee Present(Full Time)");

            empHours = 8;
            dailyWage();

        }
        else {

            System.out.println("Employee Present(Half Time)");

            empHours = 4;
            dailyWage();
        }
    }
    public void dailyWage() {


         int wagePerHour = 20;
         int dailyWage;

         dailyWage = empHours * wagePerHour;
         System.out.println("Daily Wage of the Employee is " +dailyWage);

    }
}

