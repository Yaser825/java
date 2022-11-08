//wrp to demo StringBuilders and StringBuffer
//Yaser  CG BATCH 2576

import java.util.*;
class MyString

{
	StringBuffer sb= new StringBuffer("first program");
	StringBuilder tb = new StringBuilter("hello");
	sb.append("first program");
	sb.insert(5,"My");
	sb.reverse();
	sb.delete(0,5);
	System.out.println(sb);
	tb.append("java");
	tb.insert(1,"java");
	tb.delete(1,3);
	tb.reverse();
	System.out.println(tb);
	
}