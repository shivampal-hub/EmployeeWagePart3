package com.bl.employee;

import java.util.Random;

public class MonthlyWage {

    int empCheck, monthlyWage;;
    int empHours = 0;
    int wagePerHour = 20;
    int numberOfWorkingDays = 20;
    int totalEmpHours = 0;
    int totalWorkingDays = 0;

    public void monthlyWage() {

        for(int i = 0;i<numberOfWorkingDays;i++) {
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
        }
        monthlyWage = totalEmpHours * wagePerHour;
        System.out.println("Monthly Wage of the Employee is: " +monthlyWage);

    }
}
