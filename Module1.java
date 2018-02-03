package Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Module1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("C://Users//sgarg//Desktop//project1//module1.txt");
		try {
			FileReader r1 = new FileReader(file1);
			
			try {
				int c;
				while((c=r1.read())!= -1)
					System.out.print((char)c);
				c = r1.read();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			r1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
