
public class EmployeeWageBuilder {
	
	//UC1 Employee Presence
	

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		
		 //Constants
        int IS_FULL_TIME = 1;
        //Computation
        double employeeCheck = Math.floor(Math.random() * 10) % 2;
        if(employeeCheck == IS_FULL_TIME){
            System.out.println("Employee is Present");
        }else{
            System.out.println("Employee is Absent");
        }

	}

}
