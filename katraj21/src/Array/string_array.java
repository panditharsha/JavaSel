package Array;

public class string_array {

	public static void main(String[] args) {
		String name[]  = new  String [5];
		 name[0]="Kavya";
		 name[1]="Harshada";
		 name[2]="Pallavi";
		 name[3]="shria";
		 name[4] ="Abha";
		 
		 String fruit [] = {"Apple","Mango","Cherry","Peach"};
				 
		 System.out.println(name[3]);
		 System.out.println(name[1]);
		 System.out.println(name.length);
		 
		 System.out.println("*******************************");
		  
		 for(int i=0 ;i <=name.length-1 ;i++)
		 {
			 System.out.println(name[i]);
		 }
		 
	      System.out.println("************Fruit List*******************");
		 for (int i =3;i>=0;i--)
		 {
			 System.out.println(fruit[i]);
		 }
		 
		// string_array.sort(name);

	}

	

}
