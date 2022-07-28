package JavaCode;

public class MaxValueArray {

	public static void main(String[] args) {

		
		
		int k[]= {12,4,6,8,3,9,200};
		
		
		int max1=0;
		int max2=0;
		
		for(int i=0;i<k.length;i++) {
			
			if(k[i]>max1) {
				max2= max1;
				max1=k[i];
			}else if(max2<k[i]) {
				
				max2=k[i];
				
			}
		
		}
		
		
		System.out.println(max1);
		System.out.println(max2);
	
	}
}
