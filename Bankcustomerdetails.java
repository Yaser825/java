//wrp to bankcustomer details
//yaser CG2576
package Anudip1;
import java.util.*;
class Customerdetails{
	int acno;
	String atype;
	double amt;
	Customerdetails()
	{
		acno=7550022;
		atype="savings";
		amt=80000;
	}
	Customerdetails(String x,double y)
	{
		atype=x;
		amt=y;
	}
	Customerdetails(int z,double y)
	{
		amt=y;
		acno=z;
	}
	void show()
	{
		System.out.println(acno+" "+atype+" "+amt);
	}
}
public class Bankcustomer {

	public static void main(String[] args) {
		Customerdetails m1=new Customerdetails();
		Customerdetails m2=new Customerdetails("current ",200000);
		Customerdetails m3=new Customerdetails(250000,755006);
		m1.show();
		m2.show();
		m3.show();
		

		
		
	}

}
