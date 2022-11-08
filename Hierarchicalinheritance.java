//wrp to demo inheritance
//Yaser  CG BATCH 2576

import java.io.*;
import java.lang.*;
import java.util.*;

class Person
{
	int pid;
	String pname;
	Person()
	{
	pid = 26;
	pname = "Yaser";
	}
}
class Student extends Person
{
	double studentmarks;
	void student()
	{
		studentmarks = 86;
		System.out.println("Student marks is");
	}
}
class Emp extends Person
{
	double salary;
	void emp()
	{
		salary = 20000;
		System.out.println("Emp salary is");
	}
}
class  HierarchicalInheritance
{
	public static void main(String[]args)
	{
		Person p = new Person();
		Student s = new Student();
		Emp e = new Emp();
	}
}