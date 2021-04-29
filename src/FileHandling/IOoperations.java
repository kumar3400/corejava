package FileHandling;

import java.io.File;

/*
 * Using File Class we can handle Computer files
Using File Object we can handle all types files (Ex: text files/excel files etc…) but external operations only.
External operations
Create File
Delete File etc…

Internal operations (Reading, Writing etc…) only for Text files.
——————–
 */

public class IOoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a folder
		
		File obj = new File("C:\\Users\\saikumar\\Desktop\\saikumark");
		obj.mkdir();
		
		
		//Check the existence of Selenium Folder
		boolean a =obj.exists();
		
		if(a==true) {
			
			System.out.println("folder exist");
			
		}else {
			
			System.out.println("folder not exist");
		}
		
		
		
		
		
		//check the existence of file
		File obj1 = new File("C:\\Users\\saikumar\\Desktop\\saikumark\\xml.txt");
		boolean b =obj1.exists();
		
		if(b==true) {
			
                   System.out.println("file exist");
			
		}else {
			
			System.out.println("file not exist");
			
		}
		
		
		
		//delete a text file
		File obj2 = new File("C:\\Users\\saikumar\\Desktop\\saikumark\\ac.txt");
		boolean c =obj2.delete();
		
		if(c==true) {
            System.out.println("file deleted");

		}else {
			
            System.out.println("file not deleted");

		}

		
		
			
			
		}
		


	}


