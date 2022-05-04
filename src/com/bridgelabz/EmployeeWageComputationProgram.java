package com.bridgelabz;

public class EmployeeWageComputationProgram {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int empPresent = 1;
        int dailyWage = 0;
        int empCheck = (int) (Math.random() * 10) % 2;
        if (empCheck == empPresent) {
            System.out.println("Employee Present");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Daily Wage of an Employee: " + dailyWage);
        } else {
            System.out.println("Employee Absent");
            System.out.println("Daily Wage of an Employee: " + dailyWage);
        }
    }
}
