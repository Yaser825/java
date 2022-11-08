//wrp to demo console class with password method
//Yaser  CG BATCH 2576

import java.io.*;

class ReadPassword

{
	public static void main(String[]args)
	{
	Console c = System.console();
	System.out.println("Enter the password:");
	char[]ch = c.readPassword();
	String pass = String.valueOf(ch);
	System.out.println("Password is:"+pass);
}
}