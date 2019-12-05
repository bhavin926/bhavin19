package employee;

public class EmployeeUtil {
	//counter
	public static int counter;
	public static void addEmployee(Employee e,Employee[] basket)
	{
		if(counter < basket.length)
			basket[counter++]=e;
		else
			System.out.println("NO VACANCY!!");
		
	}
}
