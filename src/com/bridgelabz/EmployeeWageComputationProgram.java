package com.bridgelabz;

class EmployeeWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int FULL_DAY_HR = 8;
    public static final int PART_DAY_HR = 4;

    private CompanyEmpWage[] companyEmpWagerArray= new CompanyEmpWage[5];
    private int numOfCompany = 0;

    private void addCompanyEmpWage(String companyName, int empWagePerHr,  int numMaxWorkingDay, int maxHrsInMonth) {
        CompanyEmpWage empWage = new CompanyEmpWage(companyName , empWagePerHr , numMaxWorkingDay , maxHrsInMonth);
        companyEmpWagerArray[numOfCompany] = empWage;
        numOfCompany++;
    }
    private void computeEmpWageFromArray() {
        for (int i= 0; i< numOfCompany; i++){
            int totalWage =computeEmpWage(companyEmpWagerArray[i]);
            companyEmpWagerArray[i].totalEmpWage= totalWage;
            System.out.println(companyEmpWagerArray[i]);
        }
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int totalEmpHours = 0, totalWorkingDays = 0, workingHours = 0;
        while (totalEmpHours < companyEmpWage.maxHrsInMonth && totalWorkingDays < companyEmpWage.numMaxWorkingDay) {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            // Calculating Wage On Employee Type
            switch ((int) empCheck) {
                case 0:
                    workingHours = FULL_DAY_HR;
                    break;
                case 1:
                    workingHours = PART_DAY_HR;
                    break;
                default:
                    workingHours = 0;
            }
            totalEmpHours += workingHours;
            totalWorkingDays++;
        }
        return totalEmpHours * companyEmpWage.empWagePerHr;
    }

    public static void main(String[] args) {
        EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();
        empWageBuilder.addCompanyEmpWage("XYZ",22,18,80);
        empWageBuilder.addCompanyEmpWage("MFG",20,20,90);
        empWageBuilder.computeEmpWageFromArray();
    }
}
