package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOoperations2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Read a Text File
		
		String line;
		
		FileReader file = new FileReader("C:\\Users\\saikumar\\Desktop\\saikumark\\loginnames.txt");
		
		BufferedReader br = new BufferedReader(file);
		   
		while ((line = br.readLine()) !=null){
			System.out.println(line);
			}
				br.close();
			    file.close();
			    
			    
			    
			    //write a text file

			    
			    
			   FileWriter file1 = new FileWriter("C:\\Users\\saikumar\\Desktop\\saikumark\\saik.txt");
			    BufferedWriter bw =new BufferedWriter(file1);
			    
			    String data = "welcome to file";
			    bw.write(data);
			    bw.close();
			    file1.close();
			    
			    
			    
			    // Read data from UFT.txt file and Write to Selenium.txt file
			    String line1;
			    FileReader file2 = new FileReader("C:\\Users\\saikumar\\Desktop\\saikumark\\loginnames.txt");
			    FileWriter file3 = new FileWriter("C:\\Users\\saikumar\\Desktop\\saikumark\\saik.txt");

			    BufferedReader br1 = new BufferedReader(file2);
			    BufferedWriter bw1 = new BufferedWriter(file3);

			    while ((line =br1.readLine()) != null){
			    bw1.write(line);
			    br1.readLine();
			    }
			    br1.close();
			    bw1.close();
			    file2.close();
			    file3.close();
			    
			    
			    
			    
			}
		
		
		

	}


