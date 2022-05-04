package com.bridgelabz;

public class EmployeeWageComputationProgram {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int empPresent = 1;
        int empHalfDayPresent = 2;
        int dailyWage = 0;
        int empCheck = (int) (Math.random() * 10) % 3;
        if (empCheck == empPresent) {
            System.out.println("Employee Present");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Daily Wage of an Employee: " + dailyWage);
        } else if (empCheck == empHalfDayPresent) {
            System.out.println("Employee Half Day Present");
            dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Half Day Wage of an Employee: " + dailyWage);
        } else {
            System.out.println("Employee Absent");
            System.out.println("Daily Wage of an Employee: " + dailyWage);
        }
    }
}
