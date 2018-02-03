package Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Module2 {
	
	public static void listFiles(String directoryName)
	{
		System.out.println("List of Files and their paths: ");
		File directory = new File(directoryName);
		File[] listf = directory.listFiles();
		for(int i = 0;i<listf.length;i++)
		{
			File file = listf[i];
			if(file.isFile())
			{
			System.out.println("File Name :"+ file.getName()+"File Path :" + file.getAbsolutePath());
			}
			else if(file.isDirectory())
			{
				listFiles(file.getAbsolutePath());
				
			}
				
		}
			
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the path for the File:");
		Scanner scan = new Scanner(System.in);
		String file_name = scan.nextLine();
		File file2 = new File(file_name);
		FileReader fr = new FileReader(file2);
		int c ;
		String path = "";
		while((c=fr.read())!= 10)
		{
			path = path+(char)c;
			//System.out.print(path);
			//System.out.print((char)c);
		}
		System.out.print(path);
		
	
	while((c=fr.read())!= -1)
	{
		System.out.print((char)c);
	}
		
		listFiles(path.substring(0, path.length()-1));
		
		
		
	      }
	    

	}


