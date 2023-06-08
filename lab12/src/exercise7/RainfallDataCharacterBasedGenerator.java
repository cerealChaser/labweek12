package exercise7;

import java.io.Writer;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/*
 * This class is to generate rainfall data
 * for by using java.io.Writer
 * 
 * @author MacaurelNoelMakRaymund
 * 
 */

public class RainfallDataCharacterBasedGenerator {
	public static void main (String args[]) {

		//Declare target file
		String fileName = "rainfallDataCharacterBased.txt";

		try {
			//Declare the stream	
			Writer writer = new PrintWriter(new FileOutputStream(fileName));

			//Declare the variables
			int data[] = {5, 0, 0, 4, 1, 0};

			//Writing data into file
			for (int index = 0; index < data.length; index ++) {
				writer.write(data[index]);

				//Flush the stream
				writer.flush();
			}

			//Close the stream
			writer.close();

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		System.out.println("End of program. Refer to "+fileName);
	}
}
