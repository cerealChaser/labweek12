package exercise6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * This class is to generate data for 2 
 * different stations in each district in Melaka
 * 
 * @author MacaurelNoelMakRaymund*/
public class SelectedStationRainfallDataGenerator {
	public static void main (String args[]) {

		// Declare the output file
		String outFile = "rainfallData2.txt";

		// Declaring the station attributes
		String id[] = {"2421003", "2324033"};
		String station[] = {"Simpang Ampat", "Hospital Jasin"};
		String district[] = {"Alor Gajah", "Alor Gajah"};
		int readingData[][] = {{0, 4, 1, 0, 6, 19},
				{0, 0, 14, 0, 11, 15 }};

		try {
			// Declaring the stream
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));

			for (int index = 0; index < id.length; index ++) {
				
				//Inserting station id, name, district
				dos.writeUTF(id[index]);
				dos.writeUTF(station[index]);
				dos.writeUTF(district[index]);
				
				for (int increment = 0; increment < 6; increment++) {
					
					// Insert rainfall data for 6 days
					dos.writeInt(readingData[index][increment]);
					
				}
				//Flush the stream
				dos.flush();
			}
			dos.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End of program. Please check "+outFile);
	}
}
