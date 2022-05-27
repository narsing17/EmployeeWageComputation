public class EmployeeWageBuilderClassMethod {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 2;
    public static final int MAX_HOURS_IN_MONTHS = 10;

    public static int computeEmpWage() {
        int empHrs = 0, totalEmpHours = 0, totalWorkingDays = 0;
        while (totalEmpHours <= MAX_HOURS_IN_MONTHS &&
                totalWorkingDays < NO_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHours += empHrs;
            System.out.println("DAy#: " + totalWorkingDays + "Emp Hr:" + empHrs);

        }
        int totalEmpWage = totalEmpHours * EMP_RATE_PER_HOUR;
        System.out.println("Total emp wage :" + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage();
    }
}


