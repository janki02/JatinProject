package JavaCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class Calculator {
@Test
	public static void calculatoor(String[] args) {
		        
//		       int x=230;//23
//		        
//		        int rev=0; //4
//		        
//		        while(x!=0){
//		             int a=0;
//		             
//		            a=x%10;//4
//		            
//		            
//		            rev=rev*10+a;
//		            x=x/10;
//		           
//		    }
//		       
//		       System.out.println(rev);
		
		
		
		//calculator using with scanner class and switch statement:
		
		double num1,num2,ans;
		char option;
		Scanner reader = new Scanner(System.in);
		System.out.println("Select any one option from following : ");
	System.out.println("Enter any one number: ");
	num1=reader.nextDouble();
	System.out.println("Enter any second number: ");
	num2=reader.nextDouble();
	System.out.println("Select any one option from following : ");
	System.out.println(" \n 1.+ \n 2. - \n 3.* \n 4./ ");
	option=reader.next().charAt(0);
	
	switch(option) {
	case '+':
		ans= num1+num2; 
	System.out.println ( num1 + "+" + num2 + "=" + ans );
	break;
	case '-':
		ans= num1-num2; 
	System.out.println ( num1 + "-" + num2 + "=" + ans  );
	break;	
	case '*':
		ans= num1*num2; 
	System.out.println ( num1 + "*" + num2 + "=" + ans  );
	break;
	case '/':
		ans= num1/num2; 
	System.out.println ( num1 + "/" + num2 + "=" + ans );
	break;
	
	default:
	System.out.println("Error! Select vailed option ");
	break;

	}
		        }
		    
		
	}
