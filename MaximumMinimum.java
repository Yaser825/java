//wrp to maximum and minimum element
//Yaser CG 2576
import java.util.Scanner;
class MaximumMinimum
{
	public static void main(String[] args)
	{
		int[] marks=new int[4];
		int max=marks[0],min=marks[0];
		System.out.println("enter array elements ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=3;i++)//read
		{
			marks[i]=sc.nextInt();
			if(marks[i]>max)
			{
				max=marks[i];
			}
			else if(marks[i]<min)
			{
			    min=marks[i];
			}
			
		}
		System.out.println("maximum element is ="+max);
		System.out.println("minimum element is ="+min);
	}
}
