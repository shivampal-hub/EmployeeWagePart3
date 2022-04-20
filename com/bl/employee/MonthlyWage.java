package com.bl.employee;

import java.util.Random;

public class MonthlyWage {

    int empCheck, monthlyWage;;
    int empHours = 0, wagePerHour = 20, numberOfWorkingDays = 20;
    int totalEmpHours = 0, totalWorkingDays = 0, maxWorkingHours = 100;

    public void monthlyWage() {

        while(totalEmpHours <= maxWorkingHours && totalWorkingDays < numberOfWorkingDays) {
            totalWorkingDays++;

            Random rand = new Random();
            empCheck = rand.nextInt(3);

            switch (empCheck) {
                case 0:
                    System.out.println("Employee Present(Full Time)");
                    empHours = 8;
                    break;
                case 1:
                    System.out.println("Employee Present(Half Time)");
                    empHours = 4;
                    break;
                default:
                    System.out.println("Employee Absent");
                    empHours = 0;

            }
            totalEmpHours += empHours;
            System.out.println("Day: " + totalWorkingDays + " Emp Hrs: " + empHours);
            System.out.println();
        }
        monthlyWage = totalEmpHours * wagePerHour;
        System.out.println("Monthly Wage of the Employee is: " +monthlyWage);

    }
}
