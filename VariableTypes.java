// wrp to types of variables
//Yaser  CG 2576
class VariableTypes
{
	int a=20;//instance variable		
	
	static int b=30;//static variable	
	
	public int m1()
	{
		int c = 35;//local variable	
		
		Sysytem.out.println("c="+c);
		
		return 0;
		
	}
	public static void main(Syting[]args)
	{
		VariableType variable= new VariabeType();
		
		System.out.println("a="+variable.a+"+b);
		
		variable.m1();
	}
}