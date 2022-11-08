//wrp to demo Exception demo
//Yaser  CG BATCH 2576
import java.util.*;
public class ExceptionDemo

{
	public static void main(String[]args)
	{
		try
		{
			try
			{
			String s1= null;
			System.out.println(s1.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("String is null");
			}
			try{
				int[] x= {20,40,30};
				System.out.println(x[3]);
			}
			catch(Exception e)
			{
				System.out.println("index is not found");
			}
			}
			catch(Exception e)
			{
				System.out.println("Exception is occured");
			}
			System.out.println("hello");
		}
		
	}