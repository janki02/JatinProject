package JavaCode;
import java.util.Arrays;

public class PrimNumber {

	

	
	public static void main(String[] args) {

		
		primPrint(100);
		
		
		
//System.out.println("yy");
	}

public static boolean  prim(int num) {
	
	
	if(num<=1) {
	return false;
	}
	
	for  (int i=2 ; i<num;i++) {
		
		if(num%i==0) {
			return false;
		}
	

}
	return true;

}


public static void primPrint(int num1) {
	
	
	for(int i=2;i<=num1;i++) {
		
		if(prim(i)) {
			
			System.out.println(i);
			
		}
		
	}
	
	
	
}

	
}