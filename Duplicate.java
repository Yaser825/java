//wrp to duplicate elements and copy of array
//yaser CG2576

import java.util.Scanner;
class Duplicate
{
	public static void main(String[] args)
	{
		int[] a=new int[4];
		int elm,cnt=0;
		int[] b={3,3};
		int[] c=new int[4];
		System.out.println("enter array elements");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=3;i++)
		{
			a[i]=sc.nextInt();
		}
		elm=sc.nextInt();
		for(int i=0;i<=3;i++)
		{
			if(a[i]==elm)
			{
				cnt++;
			}
		}
		System.out.println(cnt+" times duplicate elements occured");
		System.out.println("copied array");
		for(int i=0;i<=3;i++)
		{
			c[i]=b[i];
			System.out.print(c[i]+"  ");
		}
		
	}
}
