package JavaCode;
import java.util.StringTokenizer;

public class pushAllZeroLast {

	public static void main(String[] args) {
	
        int p[]= {2,3,0,5,0,6,0,3,0};
        
        
        int r=0;
        
        for (int i=0;i<p.length;i++) {
        	
        	if(p[i]>0) {
        		
        		p[r++]=p[i];
        	}
        }
        while(r<p.length) {
        	
        	p[r++]=0;
        }
	
	   for(int q:p) {
		   System.out.print(q);
	   }
	
	
	}

}
