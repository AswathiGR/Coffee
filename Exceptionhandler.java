import java.util.Scanner;
class Exceptionhandler{
   public static void main(String args[ ])
 
{   
	System.out.println("This is an Exception Handler for Zero division");
  try
  {   Scanner myObj = new Scanner(System.in);
     
     
	  
	  System.out.println("Enter first number");
	  int a = myObj.nextInt();
	  System.out.println("Enter second number"); 
      
      int b = myObj.nextInt();
      float Result=a/b;
      System.out.println("Result is: " + Result);  
  }
  catch(ArithmeticException e)
  {
	  System.out.println("Zero division. Exception Occurred");
  }
}
}
