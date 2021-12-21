package Exceptions;

public class Exception1 {

	public static void main(String[] args) {
		int a =10;
		int b =0;
		
		
		int arr [] =new int [3];
		
		try
		{
			int c =a/b;
			System.out.println(c);
			
			
			arr[4]=45;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("It is wrong statement");
			System.out.println("Divide by zero is not possible");
			e.printStackTrace();
		}
		
		catch(Exception e)                    //when generic exception, dont know exact 
		{
			System.out.println("Something is wrong");
			e.printStackTrace();
		}

	}

}
