package com.bridgelabz;

class EmployeeWageBuilder {
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    public static final int IS_FULL_DAY_PRESENT = 1;
    public static final int IS_HALF_DAY_PRESENT = 2;

    private String companies;
    private int wagePerHour = 20;
    private int workingDays = 22;
    private int workingHoursPerMonth = 80;

    int companyEmpWage() {
        int dailyWage = 0;
        int totalEmpWage = 0;
        int totalHours = 0;

        int totalWorkingDays = 0;
        while (totalWorkingDays < workingHoursPerMonth && totalHours <= workingDays) {
            int empCheck = (int) (Math.random() * 10) % 3;
            //System.out.println("Total Working Hours of an Employee for a Month: " + totalHours);
            switch (empCheck) {
                case IS_FULL_DAY_PRESENT:
                    totalHours += FULL_DAY_HOUR;
                    break;
                case IS_HALF_DAY_PRESENT:
                    totalHours += PART_TIME_HOUR;
                    break;
                default:
                    dailyWage = 0;
            }
            totalWorkingDays++;
            dailyWage = wagePerHour * totalHours;
            totalEmpWage += dailyWage;
            //System.out.println(empCheck + " Daily Wage of an Employee: " + dailyWage);
        }
        //System.out.println("Total Employee Wage for a Month: " + totalEmpWage);
        return totalEmpWage;
    }
}

public class EmployeeWageComputationProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println();
        EmployeeWageBuilder obj1 = new EmployeeWageBuilder();
        EmployeeWageBuilder obj2 = new EmployeeWageBuilder();
        EmployeeWageBuilder obj3 = new EmployeeWageBuilder();

        System.out.println("Total Emp Wage of Company XYZ: " + obj1.companyEmpWage());
        System.out.println("Total Emp Wage of Company GFG: " + obj2.companyEmpWage());
        System.out.println("Total Emp Wage of Company MEG: " + obj3.companyEmpWage());
    }
}
