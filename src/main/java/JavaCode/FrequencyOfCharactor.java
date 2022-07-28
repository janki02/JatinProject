package JavaCode;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyOfCharactor {

	public static void main(String[] args) {
		
		
		
		String str="jankiIlove you will you mayy me ";
		
		str=str.replaceAll("\\s","");
		
	char c[]=	str.toCharArray();
		
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		for(char p:c) {
			
			Integer count= map.get(p);
			
			if(count==null) {
				
				map.put(p, 1);
			}else {
				map.put(p,++count);
				
			}
		}
		  Set<Map.Entry<Character,Integer>> set = map.entrySet();
		  System.out.print("<");
		  for(Map.Entry<Character,Integer> m :set) {
			  
			  if(m.getValue()>1) {
				  
				  System.out.print("("+m.getKey()+","+m.getValue()+")");
				  
				
			  }
		  }
		  System.out.print(">");
    System.out.println();
	}

}
