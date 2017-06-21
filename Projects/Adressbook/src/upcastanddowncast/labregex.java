package upcastanddowncast;

import java.util.regex.*;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Matcher;

public class labregex {
public static void main(String [] args){
//	String input="123456";
//	String regex="[0-9]{6}";
//	System.out.println(input.matches(regex));
	////String input1="38301-0511666-7";
////	String regex1="([0-9]{5}\\-[0-9]{7}\\-[0-9]{1})";
////	
	/*String text="my age is 20 and my brother age is 22";
	String regex="[0-9]+";
	Pattern pattern=Pattern.compile(regex);
	Matcher m=pattern.matcher(text);
	while(m.find())
	{
		System.out.println(m.group());
	}*/
//	String text="my age is j  and my brother   is 22";
//	String regex="(joe)|(jim)|(())";
//	Pattern pattern=Pattern.compile(regex);
//	Matcher m=pattern.matcher(text);
//	//System.out.println(m.find());
//	while(m.find())
//	{
//		System.out.println(m.group());
//	}
//	String a="()()() ";
//	String y="\\(|\\)";
//	Pattern pattern=Pattern.compile(y);
//	Matcher m=pattern.matcher(a);
//	String[] z={};
//	int x=0;
//	while(m.find())
//		{
//			
//			z[x]=m.group();
//        x++;
//			
//		}
//	for(int i=0;i<x;i++){
//		System.out.print(z[i]);
//	}
//	
//	String test="[aa[bb]";
//	String regex="a[a";
//	try{
//	System.out.println(test.matches(regex));
//	}
//	catch(Exception obj){
//		System.out.println("some error");
//	}
	
	
	
//	System.out.println("by character classes and quantifiers ...");
//	System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true
//	System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true
//
//	System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)
	//System.out.println(Pattern.matches("[A-Z]{2}|[a-z]{3,}[ ]|[0-9]+", "sss "));//false (starts from 6)
//	System.out.println(Pattern.matches("[789]{2,9}", "888888888"));//true
//
//	System.out.println("by metacharacters ...");
//	System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true
//	System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)
//	try{  
//		int ab =39/0; 
//	    try{  
//	     System.out.println("going to divide");  
//	    // int b =39/0;  
//	    }catch(ArithmeticException e){System.out.println(e);}  
//	   
//	    try{  
//	    int a[]=new int[5];  
//	    a[4]=4; 
//	    System.out.println(a[4]+4);  
//	    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
//	     
//	   
//	  }catch(Exception e){System.out.println("handeled");}  
//	  
//	  System.out.println("normal flow..");  
	try{  
		   int data=25/0;  
		   //throw new ArithmeticException("some error");
		   System.out.println("zahid");
		  // System.out.println(data);  
		  }  
		  catch(ArithmeticException e){//System.out.println(e);
		  System.out.println("some error");
		 }  
	System.out.println("zahid");
//		  finally{System.out.println("finally block is always executed");
//		  }  
		  System.out.println("rest of the code...");  

	

	}
}



