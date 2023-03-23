package Classwork;

public class Staticnonstaticblock
{
	public void m1()
	{
		System.out.println("Simple Method bolck");
	}
static
{
System.out.println("Static Block");
}
{

System.out.println("Non Static Block");

}
public static void main(String args[])
{

Staticnonstaticblock sb=new Staticnonstaticblock();

 System.out.println("Main Method block");
 sb.m1();
           
}
}