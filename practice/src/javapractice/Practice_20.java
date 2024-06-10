package javapractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice_20 {

	public static void main(String[] args) {
		//How do you find the number of characters, words and lines in the given text file in Java?
		
		BufferedReader reader =null;
		
		int charcount=0;
		int wordcount=0;
		int linecount=0;
		
		
		
		try
		{
			reader = new BufferedReader(new FileReader("C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\Test.txt"));
			String currentLine = reader.readLine();
			
			while(currentLine!=null)
			{
				linecount++;
				
				 String[] words = currentLine.split(" ");
				 wordcount=wordcount+words.length;
				 
				 for (String word : words)
	                {
	                    //Updating the charCount
	                     
	                    charcount = charcount + word.length();
	                }
				 currentLine = reader.readLine();
			}
			
			System.out.println("Number Of Chars In A File : "+charcount);
            
            System.out.println("Number Of Words In A File : "+wordcount);
             
            System.out.println("Number Of Lines In A File : "+linecount);
		}
		
		catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
		
		

	}

}
