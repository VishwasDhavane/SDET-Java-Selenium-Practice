package javapractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Practice_22 {

	public static void main(String[] args) throws IOException {
		// How to sort a text file in Java?
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\OneDrive\\\\\\\\Desktop\\\\\\\\Test_1.txt"));
		
		ArrayList<String> lines = new ArrayList<String>();
		
		String currentLine = reader.readLine();
		
		while (currentLine != null)
		{
		       lines.add(currentLine);
		       currentLine = reader.readLine();
		       
		}
		
		
		   Collections.sort(lines);
	       
	       BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\hp\\\\\\\\\\\\\\\\OneDrive\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Test_2.txt"));
		
	       for (String line : lines)
           {
               writer.write(line);

               writer.newLine();
           }
	       
	       
	       reader.close();
	       writer.close();

	}

}
