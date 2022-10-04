//wrp to multiple inheritance
//Yaser CG2576
package Anudip1;
import java.util.*;


public interface Red {
void show();
{
	System.out.println("red colour");
}
}

public interface Green {
void show1();
{
	System.out.println("green colour");
}
}


public class Yellow  implements Red,Green{
public void show()
{
	System.out.println("hello red colour");
}
public void show1()
{
	System.out.println("hello Green colour");
}

	public static void main(String[] args) {
Yellow c1=new Yellow();
c1.show();
c1.show1();
	}

}
