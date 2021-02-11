
public class EmployeeWageBuilder {
	

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		
		 //Constants
		int IS_PART_TIME = 1;
	    int IS_FULL_TIME = 2;
	    int EMP_RATE_PER_HOUR = 20;
        //Variables 
        int empHrs = 0;
        int empWage = 0;
        
        //Computation
        double employeeCheck = Math.floor(Math.random() * 10) % 3;
        if(employeeCheck == IS_FULL_TIME)
            empHrs = 8;
        else if (employeeCheck == IS_PART_TIME)
        	empHrs = 4;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);

	}

}
