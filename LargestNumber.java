// wrp to print LargestNumbers
//Yaser  CG 2576
import java.util.Scanner;
class LargestNumbers
{
	public static void main(String[] Args)
	{
		int a,b,c;
		System.out.println("Enter the numbers");
		Scanner Sc1=new Scanner(System.in);
		a=Sc1.nextInt();
	    Scanner sc2=new Scanner(System.in);
		b=Sc2.nextInt();
	    Scanner Sc3=new Scanner(System.in);
		c=Sc3.nextInt();
		if(a>b && a>c)
			System.out.println(a+"is the largest number");
			else if(b>a && b>C);
			System.out.println(b+"is the largest number");
			else if(c>a && c>b)
			System.out.println(c+"is the largest number");
			else
			System.out.println("invalid");
	
	}
	}
