package JavaCode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CallByValueAndCallByRaference {

	public static void main(String[] args) {
		
		
		int a=10;
		
		
		System.out.println(a);

		
	   String s = new String();
	   
	   s="ram";
	   
	   System.out.println(s);
	   
    list(s);
    
    System.out.println(s);

	}
	
	
	public static void sum(int x) {
		
		
		x=20;
		
		System.out.println(x);
		
		
		
	}
	
	public static void list( String s) {
		
   s="mohan";
		
		System.out.println(s);
	}

}
