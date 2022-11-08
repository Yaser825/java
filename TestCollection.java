//wrp to demo print forward and backward using ListIterator
//Yaser  CG BATCH 2576

import java.util.*;
public class TestCollection

{
	
	public static void main(String[]args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Abdul");
		al.add("Mani");
		al.add("Simbu");
		al.add("ravi");
		System.out.println("element at 2nd position:"+al.get(2));
		ListIterator<String> itr = al.listIterator();
		System.out.println("traversing elements in forward direction...");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("traversing elements in backward direction...");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}	
			
		
	}
}