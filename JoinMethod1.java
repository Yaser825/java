//wrp to demo thread using threadsheduler methods sleep(), join()methods
//Yaser  CG BATCH 2576

class JoinMethod1
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e){System.out.println(e);}
			System.out.println(i);
			
		}
	}
	public static void main(String[]args)
	{
			JoinMethod1 t1 = new JoinMethod1();
			JoinMethod1 t2 = new JoinMethod1();
			JoinMethod1 t3 = new JoinMethod1();
			t1.start();
			try{
				t1.join();
			}
			catch(Exception e){System.out.println(e);}
		t2.start();
		t3.start();
	}
}