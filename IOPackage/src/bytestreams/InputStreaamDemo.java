package bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputStreaamDemo {

	public static void main(String[] args) {
	
		
		try {
			
		FileInputStream fis = new FileInputStream("input.txt");
			
				int n =	0;
			
				while(   (n =fis.read()) != -1 ) {
					
					System.out.print((char)n);
					
				}
				
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		

	}

}
