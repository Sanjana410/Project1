package Project1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Module4 {
	
	public static void listFiles(String path1,String path2) throws IOException
	{
		System.out.println("List of Files and their paths: ");
		ArrayList<File> list = new ArrayList<File>();           // Creating Array List
		File directory = new File(path1);
		File[] listf = directory.listFiles();
		for(int i = 0;i<listf.length;i++)
		{
			File file = listf[i];
			if(file.isFile())
			{
				
				list.add(listf[i]);
				for(File f:list)
				{
					
					System.out.println("File Name :"+f.getName()+ "   "+ "File Path : " +f);   // Displaying output 
					                                                                           // on Console
					File file3 = new File(path2);
					FileWriter fw = new FileWriter(path2,true);
					fw.write("Name of file : "+ f.getName()+" , ");
					fw.write("Path of the file: "+ f.getAbsolutePath());
					fw.write(10);
					fw.flush();
					fw.close();
					
					
				}
				
			
			}
			else if(file.isDirectory())
			{
				listFiles(file.getAbsolutePath(),path2);
				
			}
				
		}
			
		
	}

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.out.println("Enter the path for the File:");
		Scanner scan = new Scanner(System.in);               // Getting input from user
		String file_name = scan.nextLine();
		File file2 = new File(file_name);
		FileReader fr = null;
		try {
			fr = new FileReader(file2);                       // Reading File
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int c ;
		String path1 = "";
		String path2 = "";
		while((c=fr.read())!= 10)                             // Extracting Path1 from File
		{
			path1 = path1+(char)c;
		}
		System.out.print(path1);
		
	
	while((c=fr.read())!= -1)
	{
		path2 = path2+(char)c;                               // Extracting Path2 from File
		
	}
	System.out.print(path2);
	System.out.println();
		
		listFiles(path1.substring(0, path1.length()-1),path2);        // Calling the ListFiles method
		
		
	
		
		
		
		
		

	}

}
