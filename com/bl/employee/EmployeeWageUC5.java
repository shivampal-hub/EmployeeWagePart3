package com.bl.employee;

public class EmployeeWageUC5 {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        MonthlyWage wage = new MonthlyWage();
        wage.monthlyWage();

    }
    
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
            System.out.println();
        }
        monthlyWage = totalEmpHours * wagePerHour;
        System.out.println("Monthly Wage of the Employee is: " +monthlyWage);

    }
}
