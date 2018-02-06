package Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Module3 {
	
	public static void listFiles(String directoryName)
	{
		
		System.out.println("List of Files and their paths: ");
		ArrayList<File> list = new ArrayList<File>();
		File directory = new File(directoryName);
		File[] listf = directory.listFiles();
		for(int i = 0;i<listf.length;i++)
		{
			File file = listf[i];
			if(file.isFile())
			{
				
				list.add(listf[i]);
				for(File f:list)
				{
					System.out.println("File Name :"+f.getName()+ "   "+ "File Path : " +f);
				}
			
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
		String path1 = "";
		String path2 = "";
		while((c=fr.read())!= 10)
		{
			path1 = path1+(char)c;
		}
		System.out.print(path1);
		
	
	while((c=fr.read())!= -1)
	{
		path2 = path2+(char)c;
		
	}
	System.out.print(path2);
		
		listFiles(path1.substring(0, path1.length()-1));
		
	
		

	}

}
