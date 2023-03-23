package Classwork;

public class Staticvar
{
static int x=10;
public static void main(String args[])
{
Staticvar s=new Staticvar();
System.out.println("Static Variable calling Through Object = "+s.x);
System.out.println("Static Variable calling Through ClassName = "+Staticvar.x);
System.out.println("Static Variable calling Through Directally = "+x);
}
}