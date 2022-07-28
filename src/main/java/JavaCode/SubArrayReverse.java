package JavaCode;

public class SubArrayReverse {

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k = 7;

		
for(int i=0;i<a.length;i=i+k) {
	
	int left = i;
	
	int right = Math.min(i+k-1, a.length-1);
	
	while (left<right) {
		
		
		int temp=a[left];
		
		a[left]=a[right];
		a[right]=temp;
		left++;
		right--;
	}
	
	
}
        for(int s:a) {
        	
        	System.out.print(s);
        }
	}

}
