package JavaCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class IntArrayAddision {
	 
	public static void main(String args[]) {

		
	  int i[]= {2,7,3,9,6};
	  
	  int k[]= {8,1,5};
	  
	  
	  
	  int f[]= new int  [i.length+k.length];
	  
	  
	  int r=0;
	  int s=0;
	  int t=0;
	  
	  
	  while( s<k.length && r<i.length ) {
		  
		  if(i[r]<k[s]) {
			  
			  f[t++]=i[r++];
		  }else {
			  
			  f[t++]=k[s++];
			  
		  }
		  
	  }
       while (r<i.length) {
    	   
    	   f[t++]=i[r++];
    	   
       }while(s<k.length) {
    	   
    	   f[t++]=k[s++];
       }
       
       
       
              Arrays.sort(f);
       System.out.println(Arrays.toString(f));
      
	 
	}
}
