//wrp to demo Hierarchial inheritance
//Yaser  CG BATCH 2576

class A
{
	public void methodA()
	{
		System.out.println("method class A");
	}
}
class B extends A
{
	public void methodB()
	{
		System.out.println("method  class B");
	}
}
class C extends A
{
	public void methodC()
	{
		System.out.println("method class C");
	}
}
class D extends A
{
	public void methodD()
	{
		System.out.println("method  class D");
	}
}
class HierarchialInheritance2
{
	public static void main(String[]args)
	{
		A obj  =new  A();
		B obj1 = new B();
		C obj2 = new C();
		D obj3 = new D();
		obj.methodA();
		obj1.methodB();
		obj2.methodC();
		obj3.methodD();
		
	}
}