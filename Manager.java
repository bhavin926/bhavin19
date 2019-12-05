package employee;

public class Manager extends Employee{
	private double perfBonus;
	
	public Manager(String name,String email,int dept_id,double basic,double bonus)
	{
		super(name,email,dept_id,basic);
		perfBonus=bonus;
	}
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString()
	{
		return "Employee:"+super.toString()+ "bonus:"+perfBonus;
		
	}
	@Override
	public double computeNetSalary()
	{
		return basic+getPerfBonus();
	
	}
	public double getPerfBonus()
	{
		return perfBonus ;
	}

}
