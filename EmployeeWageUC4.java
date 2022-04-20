package com.bl.employee;

import java.util.Random;

public class EmployeeWageUC4 {

    static int empCheck;
    static int empHours;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWageUC4 emp = new EmployeeWageUC4();
        emp.employeeAttendance();

    }

    public void employeeAttendance() {

        Random rand = new Random();
        empCheck = rand.nextInt(3);

        switch (empCheck) {

            case 0:
                System.out.println("Employee Present(Full Time)");
                empHours = 8;
                dailyWage();
                break;
            case 1:
                System.out.println("Employee Present(Half Time)");
                empHours = 4;
                dailyWage();
                break;
            default:
                System.out.println("Employee Absent");

        }
    }
    public void dailyWage() {


         int wagePerHour = 20;
         int dailyWage;

         dailyWage = empHours * wagePerHour;
         System.out.println("Daily Wage of the Employee is " +dailyWage);

    }
}
