package Classwork;

public class Staticmethod
{
public void m1()
{
System.out.println("simple method m1");
}
public static void m2()
{
System.out.println("Static method m2");
}

 static public void m3()
{
System.out.println("Static method m3");
}
public static void main(String args[])
{
Staticmethod sm=new Staticmethod();
System.out.println("Calling through Direactally ");
//m1();
m2();
m3();
System.out.println(" ");
System.out.println("Calling through Object ");
 sm.m1();
 sm.m2();
 sm.m3();
System.out.println(" ");
System.out.println("Calling through Class Name");
//mStaticmethod.m1();
Staticmethod.m2();
Staticmethod.m3();
System.out.println(" ");
}
}
