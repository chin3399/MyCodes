package SeleniumPractise.SeleniumPractise;

import java.util.Scanner;
import java.util.stream.IntStream;

public class BiggestString {

	public static void main(String[] args) 
	{
		// TODO Print Biggest word from a string 
		
		String fullword,Small ="",word="";
	    String[] words = new String[100];
		char ch;
	    int i,length=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Full string");
		fullword = sc.nextLine();
		fullword = fullword + "";
	for(i=0;i<fullword.length();i++) {
			if(fullword.charAt(i)!=' ') {
			word = word+fullword.charAt(i);
		    }
		
			else {
				
				
				words[length] = word;
				length++;
				word=" ";
			}  
	}
	
	Small=words[0];
	
	for(int k=0;k<length;k++) {
		
		if(Small.length()>words[k].length()) {
			
			Small = words[k];
		}
	}
		
	System.out.println("Smallest word is :"+Small);
		
		

	}

}
