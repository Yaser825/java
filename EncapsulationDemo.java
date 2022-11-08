//wrp to demo Encapsulation using private members
//Yaser CG BATCH 2576

class EncapsulationDemo
{
	private int ssn;
	private String empName;
	private int empAge;
	public int getEmpSSN()
	{
		return ssn;
	}
    public String getEmpName()
{
	return empName;
}

	public int getAge()
	{
		return empAge;
	}
	public void setEmpAge(int newValue)
	{
		empAge=newValue;
	}
	public void setEmpName(String newValue)
	{
	empName=newValue;
}
    public void setEmpSSN(int newValue)
{
	ssn=newValue;
}

}
public class EncapsulationTest
{
	public static void main(String[]args)
	{
		EncapsulationDemo Ed = new EncapsulationDemo();
		Ed.setEmpName("yaser");
		Ed.setEmpAge(26);
		Ed.setEmpSSN(200026);
		System.out.println("Employee Name: " + Ed.getEmpName());
		System.out.println("Employee SSN: " + Ed.getEmpSSN());
		System.out.println("Employee Age:" + Ed.getEmpAge());
		
	}
}  