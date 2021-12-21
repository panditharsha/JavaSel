package Array;

public class Split_fun {

	public static void main(String[] args) {
		String a ="This,is,a,large,Pizza ";
        String b =",";
        
        String op[] =a.split(b);
        
        for (int i=0;i<=4;i++)
        {
        	System.out.println(op[i]);
        }
        
        
	}

}
