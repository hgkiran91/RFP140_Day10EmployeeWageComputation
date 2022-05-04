package com.bridgelabz;

public class EmployeeWageComputationProgram {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    public static final int IS_FULL_DAY_PRESENT = 1;
    public static final int IS_HALF_DAY_PRESENT = 2;
    public static final int MAX_WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int empPresent = 1;
        int empHalfDayPresent = 2;
        int dailyWage = 0;
        int totalEmpWage=0;

        int totalWorkingDays = 0;
        while (totalWorkingDays < MAX_WORKING_DAYS_PER_MONTH) {
            int empCheck = (int) (Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_DAY_PRESENT:
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;
                case IS_HALF_DAY_PRESENT:
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    break;
                default:
                    dailyWage = 0;
            }
            totalWorkingDays++;
            totalEmpWage+=dailyWage;
            System.out.println(empCheck + " Daily Wage of an Employee: " + dailyWage);
        }
        System.out.println("Total Employee Wage for a Month: "+totalEmpWage);
    }
}
