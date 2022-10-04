//wrp to constructor,named method,static method
//yaser CG 2576
package Anudip1;
import java.util.*;
class Empdetails{
	int eid;
	String ename;
	double esalary;
	static String cname="capgemini";
		static void change()//static method
		{
			cname="zoho";
		}
		Empdetails(int x,String y,double z)//parameterised consttuctor
		{
			eid=x;
			ename=y;
			esalary=z;
		}
		void show()//normal method
		{
			System.out.println(eid+"  "+ename+" "+esalary);
		}
	

}
public class Employees {

	public static void main(String[] args) {
		
		Empdetails E1=new Empdetails(15,"suresh",50000);
		Empdetails E2=new Empdetails(21,"ganesh",70000);
		Empdetails E3=new Empdetails(26,"mukesh",20000);
		Empdetails.change();
		E1.show();
		E2.show();
		E3.show();
		
	}

}
