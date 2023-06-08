package exercise5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * This class is to generate the Daily Rainfall Data 
 * in a station
 * 
 * @author MacaurelNoelMakRaymund
 * */

public class RainfallDataGenerator {
	public static void main(String args[]) {

		//1. Declare the output file
		String fileName = "rainfallData.txt";

		//2. Create stream to read data
		int data[] = {5, 0, 0, 4, 1, 0};
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));

			//Process data
			for (int index = 0; index < data.length; index++) {

				//3. Write data into stream
				dos.write(data[index]);

				//4. Flush for each writing
				dos.flush();

			}

			//5. Close stream
			dos.close();

		}
		//Error handling
		catch(Exception e) {
			e.printStackTrace();
		}

		// Indicate the program has ended
		System.out.println("Program has terminated. Check "+fileName);
	}
}
