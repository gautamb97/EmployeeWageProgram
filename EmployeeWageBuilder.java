
public class EmployeeWageBuilder {
	 //Constants
	public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH = 20;
    
    public static int computeEmployeeWage() {
    	//Variables 
        int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;
        
        //Computation
        while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
    	int empHrs = 0;
    	totalWorkingDays++;
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch(employeeCheck) {
        case IS_FULL_TIME:
            empHrs = 8;
            break;
        case IS_PART_TIME:
        	empHrs = 4;
        	break;
        default:
        	empHrs = 0;
        	}
        totalEmpHrs +=empHrs;
        System.out.println("Days#: " + totalWorkingDays + " Emp Hr: " +empHrs);
        }
    totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
    System.out.println("Total Emp Wage: " + totalEmpWage);
    return totalEmpWage;
    }
    
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		computeEmployeeWage();
        
	}
}