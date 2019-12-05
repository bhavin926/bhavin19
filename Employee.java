package employee;

public class Employee {

	static int count;
	private int emp_id;
	private String emp_name;
	private String email;
	private int dept_id;
	double basic;
	
	public Employee(String name,String email,int dept_id,double basic)
	{
		emp_id=count++;
		emp_name=name;
		this.email=email;
		this.dept_id=dept_id;
		this.basic=basic;
		
	}
	public Employee()
	{
		
	}
	
	public int getId()
	{
		return emp_id;
	}
	
	static
	{
		count=100;
	}
	
	@Override
	public String toString()
	{
		return "emp_id:"+emp_id+" name:"+emp_name+" email:"+email+" deptId:"+dept_id+" basic:"+basic;
		
	}
	
	
	public double computeNetSalary()
	{
		return basic;
	
	}
	
	
	
	
	
	
}
