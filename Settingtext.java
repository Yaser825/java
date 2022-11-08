//wrp to demo user defined exception
//Yaser  CG BATCH 2576

class MyException extends Exception{
	

	public class SettingText
	{
		public static void main(String[]args)
		{
			try
			{
				throw new MyException();
			}
			catch(MyException e)
			{
				System.out.println("1st exception program");
				System.out.println(e.getMessage());
			}
		}
	}
}