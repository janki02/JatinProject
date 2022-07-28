package JavaCode;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringFunction {

	public static void main(String[] args) {
		
		
			String str="jatin larn  java                 and he is good lerner  ";
			
			
			
			str= str.replaceAll("\\s+", " ");  // to remove extra white space 
			
			//1.  str = str.replaceAll("\\s", "");  // to remove all white space 
			
			
			System.out.println(str);
	}

}
