package Array;

public class Multidim_Array2 {

	public static void main(String[] args) {
		
		char Div[][] = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		
		System.out.println("Given 2D array is :");
		for (int i =0;i<=2;i++)
		{
			for (int j =0;j<=2;j++)
			{
				System.out.print(Div[i][j] +" ");
			}
			System.out.println(); 
		}
		

	}

}
