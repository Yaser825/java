// wrp to demo operators
// Yaser   CG batch 2576
class Operator
{
public statis void main(String[]args)
{
int a=15,b=6,c;
boolean a1;
System.out.println("initial value a=6 and b=15");

c=a-b;//arithmetic operator
System.out.println("result of arithmetic operation c=a-b :"+c);

C=a;//assignment operator
System.out.println("result of assignment operation c=a :"+c);

a-=4;//multiple assignment operator
System.out.println("result of multiple assignment operation a-=4 :"+a);

a1=(a>15)&&(b>15);//logical operator
System.out.println("result of logical operation a1=(a>15)&&(b>15) :"+a1);

a1=(a<b);//relational operator
System.out.println("result of relational operation a1=(a<b) :"+a1);

c=(a<b)?a:b;//ternary operator
System.out.println("result of ternary  operation c=(a<b)?a:b :"+c;

c=a++ + ++b;//unary operator
System.out.println("result of unary operation c=a++ + ++b :"+c);

c=(a<<b);//bitwise operator
System.out.println("result of bitwise operation c=(a<<b) :"+c);
}
}