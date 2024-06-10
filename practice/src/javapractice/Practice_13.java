package javapractice;

import java.text.DecimalFormat;

public class Practice_13 {

	public static void main(String[] args) {
		//Write a Java program to find the percentage of uppercase letters, lowercase letters, digits and special characters in a given string?

		
		
		
		String str="Tiger Runs @ The Speed Of 100 km/hour.";
		
		int len=str.length();
		
		int upperCaseLetters = 0;
        
        int lowerCaseLetters = 0;
         
        int digits = 0;
         
        int others = 0;
         
        
        for (int i = 0; i < str.length(); i++) 
        {
        	
        	char ch =str.charAt(i);
        	
        	 
            if(Character.isUpperCase(ch))
            {
                upperCaseLetters++;
            }
            
            else if(Character.isLowerCase(ch))
            {
                lowerCaseLetters++;
            }
            
            
            else if (Character.isDigit(ch))
            {
                digits++;
            }
            
            
            else
            {
                others++;
            }
        }
        
        double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / len ;
        
        double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / len;
         
        double digitsPercentage = (digits * 100.0) / len;
         
        double otherCharPercentage = (others * 100.0) / len;
        
        DecimalFormat formatter = new DecimalFormat("##.##");
        
        System.out.println("In '"+str +"' : ");
        
        System.out.println("Uppercase letters are "+formatter.format(upperCaseLetterPercentage)+"% ");
         
        System.out.println("Lowercase letters are "+formatter.format(lowerCaseLetterPercentage)+"%");
         
        System.out.println("Digits Are "+formatter.format(digitsPercentage)+"%");
         
        System.out.println("Other Characters Are "+formatter.format(otherCharPercentage)+"%");
         
        System.out.println("-----------------------------");
        	
        	
        	
        }
	}


