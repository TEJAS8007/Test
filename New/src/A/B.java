package A;
 import java.util.Scanner;
 public class B {

	  public static void main(String args[])
	  {
		  
		  Scanner Sc=new Scanner(System.in);
		     double num1,num2;
		     String operation;
		 System.out.println("Enter The first Number");   
		     num1=Sc.nextDouble();   
		 System.out.println("Enter the Second Number");
		     num2=Sc.nextDouble();
		 System.out.println("Enter The Second Operation=(+,-,*,/): "); 
		     operation=Sc.next();
		     
		   switch(operation)
		   {
		   case"+":
		   {
		     System.out.println(num1+num2);
		   }
		   break;
		   case"-":
		   {
			   System.out.println(num1-num2);
		   }
		   break;
		   case"*":
		   {
			   System.out.println(num1*num2);
		   }
	       break;
		   case"/":
		   {
			   System.out.println(num1/num2);
		   }
		   break;
		   default:
			   System.out.println("Invalid Operation");
			   break;
		   }
	  
	  
	  }
}
