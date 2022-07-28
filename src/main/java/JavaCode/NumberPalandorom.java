package JavaCode;

public class NumberPalandorom {

	public static void main(String[] args) {
	
		
		
		

	    int s = 353;
	    int reversedNum = 0;
	    int p;
	    
	   
	    int originalNum = s;
	    
	    // get the reverse of originalNum
	    // store it in variable
	    while (s != 0) {
	      p= s % 10;
	      reversedNum = reversedNum * 10 + p;
	      s /= 10;
	    
	    }
	    if (originalNum == reversedNum) {
	        System.out.println(originalNum + " is Palindrome.");
	      }
	      else {
	        System.out.println(originalNum + " is not Palindrome.");
	      }
	}
}
