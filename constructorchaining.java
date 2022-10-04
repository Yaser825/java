//wrp to constructor chaining
//Yaser CG2576
package Anudip1;
import java.util.*;
class Welcome
{
	
	Welcome()
	{
		this(10);
		System.out.println("constructor");
	}
	Welcome(int x)
	{
		
		this(10,20);
		System.out.println(x);
	}
	Welcome(int x,int y)
	{
		
		System.out.println(x+" "+y);
	
}
}
public class Simple{
	public static void main(String[] args)
	{
		Welcome o=new Welcome();
	}
}

