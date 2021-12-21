package Array;

public class Blank_Space_Count {

	public static void main(String[] args) {
		String str ="Ah mad na  gar";
		int count =0;
		
		for (int i=0;i<=str.length()-1;i++)
		{
		  char blank =' ';
		  if (blank ==str.charAt(i))
		  {
			  count++;
		  }
		}
		System.out.println("blank Spaces in String are :"+count);

	}

}
