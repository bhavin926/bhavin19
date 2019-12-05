package employee;

public class Worker extends Employee {
	
	private int hoursWorked;
	private double rate;
	public Worker(String name,String email,int dept_id,double basic,int hWorked,double rate)
	{
		super(name,email,dept_id,basic);
		hoursWorked=hWorked;
		this.rate=rate;	
		
	}

	public Worker() 
	{
		
	}
	@Override
	public String toString()
	{
		return "Employee:"+super.toString()+ "hours worked:"+hoursWorked+ "Hourly Rate"+ rate;
		
	}
	@Override
	public double computeNetSalary()
	{
		return basic+getHourlyRate();
	
	}
	public double getHourlyRate()
	{
		return hoursWorked*rate ;
	}

}
