package homework2_LW;
//CopyFile.java

import java.util.Scanner;  // Import the Scanner class
import java.nio.file.Files;
import java.io.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.PrintWriter;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
//import java.nio.FileAlreadyExistsException;


/*
Name (As in Blackboard): Lorrayya Williams
Honor Statement:I have neither received nor given unauthorized aid concerning this homework.
*/

//Import packages 

public class CopyFile {
	public static void main(String args[]) 
	{
		
		String input_filename; //Source file name 
		String output_filename; //Target file name
		Scanner reader = new Scanner(System.in);
		
		try {
		// Enter the name of the file to be copied 
			System.out.println("Enter the path of the file to be copied: ");
			input_filename = reader.nextLine();
			File input_f = new File(input_filename); 
			input_f.exists();
			
		// Enter the name of the target file to be pasted
			System.out.println("Enter the path of the target file to be pasted: ");
			output_filename = reader.nextLine();
			File output_f = new File(output_filename); 
			output_f.exists();
			
		// Copying file
			FileInputStream fis = null;
	        FileOutputStream fos = null;
	        
	     // Custom directory path on local machine
	        fis = new FileInputStream(input_filename);
	
	        // Custom directory path on local machine
	        fos = new FileOutputStream( output_filename);
	
	        int c;
	
	        // Condition check
	        // Reading the input file till there is input
	        // present
	        while ((c = fis.read()) != -1) {
	
	            // Writing to output file of the specified
	            // directory
	            fos.write(c);
	        }
	
	        // By now writing to the file has ended, so
	
	        // Display message on the console
	        System.out.println(
	            "copied the file successfully");
	        
	        // prints contents of the file
	       /* File myObj = new File(output_filename);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();*/
		      
	        //print file contents
		      Scanner sc = new Scanner(new File(output_filename));
				while (sc.hasNextLine())
		          System.out.println(sc.nextLine());
				
		    
		    //Print the metadata of the target file (Absolute path, Writeable, Readable and file size in bytes) into the terminal   
		    //System.out.println("length: " + input_filename.length());
			System.out.println("length: " + output_filename.length());
			
			//prints absolute path
			
			String absolute = output_f.getAbsolutePath();
			System.out.println("Absolute  path: " + absolute);
			
			//prints if file is readable or writeab;e
			boolean canRead = output_f.canRead();
			boolean canWrite = output_f.canWrite();
			
			if(canRead) {
				System.out.println("File is readable");
			} 
			if(canWrite) {
				System.out.println("File is Writeable");
			}
        
		} catch(IOException e) {
			System.out.println("Please Enter a legitamate file path");
		}
		
	// Handle exceptions and close the files whereever needed
	
	} 

}
 
