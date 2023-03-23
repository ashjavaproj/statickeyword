package Task1;

public class Student {

	
     	int rollno;  
     	String name;  
     static	 String college = "Diploma"; 

    	
     	public Student(int rollno,String name)
     	{  	
     		this.rollno=rollno;
     		this.name=name;
     	}  
	public  static void change()
	{  
     		college = "Engg";  
     	}  
   	void display(){
   		
//   Student st=new Student();
   		
System.out.print(rollno);//print rollno
System.out.print(name);//print name
System.out.print(college);// print clg 
System.out.println();
   		
    	}  
}  


