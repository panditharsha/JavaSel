package Array;

public class Multidim_Array {

	public static void main(String[] args) {
	  int array[][] =new int [4][3] ;
	  
	  array[0][0] =50;
	  array[0][1] =110;
	  array[0][2] =50;
	  
	  array[1][0] =25;
	  array[1][1] =100;
	  array[1][2] =75;
	  
	  array[2][0] =15;
	  array[2][1] =150;
	  array[2][2] =85;
	  
	  array[3][0] =35;
	  array[3][1] =110;
	  array[3][2] =60;
	  
	  
	  
	  
	  System.out.println("Given 2D array is :");
	  for (int i =0; i<=3;i++) 
	  {
		  		  for (int  j=0;j<=2;j++) 
		  {
			  System.out.print(array[i][j] +" ");
		  }
		  System.out.println(); 	  
	  }
	  
	}

}
