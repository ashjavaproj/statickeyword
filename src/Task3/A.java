package Task3;

public class A {

	
		static{
		int x=20;
		//print msg and print x
		System.out.println("Static block 1 ");
		System.out.println("x is = "+x);
		}
		static{
		String s1="abc";
		//print msg and print s1
		System.out.println("Static block2");
		System.out.println("S1 is = "+s1);
		
		}	
		static{
		char c='A';
		//print msg and print c
		System.out.println("Static block3");
		System.out.println("c is = "+c);
		
		}
		{//non static block
			int z=100;//add extra code
			System.out.println("Im Non Static block");
			System.out.println("z is = "+z);
			
		}
		public static void main(String args[])
				{
			
			System.out.println("main start");
			A a=new A();
			System.out.println("Main end");

				}
				}
