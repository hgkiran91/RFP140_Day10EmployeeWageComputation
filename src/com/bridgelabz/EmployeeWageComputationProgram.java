package com.bridgelabz;

class EmployeeWage {
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    public static final int IS_FULL_DAY_PRESENT = 1;
    public static final int IS_HALF_DAY_PRESENT = 2;

    private String companies;
    private int wagePerHour;
    private int workingDays;
    private int workingHoursPerMonth;

    public EmployeeWage(String companies, int wagePerHour, int workingDays, int workingHoursPerMonth) {
        this.companies=companies;
        this.wagePerHour=wagePerHour;
        this.workingDays=workingDays;
        this.workingHoursPerMonth=workingHoursPerMonth;
    }

    double companyEmpWage() {
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
        EmployeeWage obj1 = new EmployeeWage("XYZ", 20, 24, 80);
        EmployeeWage obj2 = new EmployeeWage("GFG", 25, 22, 90);
        EmployeeWage obj3 = new EmployeeWage("MEG", 24, 23, 100);

        System.out.println("Total Emp Wage of Company XYZ: "+obj1.companyEmpWage());
        System.out.println("Total Emp Wage of Company GFG: "+obj2.companyEmpWage());
        System.out.println("Total Emp Wage of Company MEG: "+obj3.companyEmpWage());
    }
}
