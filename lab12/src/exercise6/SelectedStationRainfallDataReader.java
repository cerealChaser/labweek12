package exercise6;

import java.io.DataInputStream;
import java.io.FileInputStream;

/*
 * This class is to read the data generated by the class
 * RainfallDataSelectedStationReader.java
 * 
 * @author MacaurelNoelMakRaymund
 * */

public class SelectedStationRainfallDataReader {
	public static void main (String args[]) {
		try {
			//Assign text file to attribute to be passed
			String inFile = "rainfallData2.txt";
			// Declare the stream
			DataInputStream dis = new DataInputStream (new FileInputStream(inFile));
			System.out.println("Reading data from "+inFile);

			// declaring the variables that will be used
			// to retrieve the data
			String[] id = new String [2];
			String[] stations = new String[2];
			String[] districts = new String[2];
			int readingData;
			int index = 0;
			int total = 0;
			int average = 0;

			while (dis.available() > 0) {

				// Retrieve and display data for Station ID
				id[index] = dis.readUTF();
				System.out.println("Station ID: "+ id[index]);

				//Retrieve and display data for station name
				stations[index] = dis.readUTF();
				System.out.println("Station Name:" +stations[index]);

				//Retrieve and display data for district name
				districts[index] = dis.readUTF();
				System.out.println("District : "+districts[index]);


				for (int increment = 0; increment < 6; increment++) {

					//Getting rainfall data for 6 days
					readingData=dis.readInt();

					//Display data
					System.out.println("Day "+(increment+1)+": "+readingData);


					// Totaling the data for 1 station
					total += readingData;
				}

				//Calculate the average for 6 days
				average = total/6;

				//Display the total, average, id, district
				System.out.println("Total for "+stations[index]+" station: "+total);
				System.out.println("Average for "+stations[index]+" station: "+ average);
				
				//Printing out a divider for visibility
				System.out.println("============================================");

				index++;
			}

			//Close the stream
			dis.close();


			// Display the number of station
			System.out.println("Number of Station:" +index);

			//Comparing district names in order to not get false  district values
			for (int index1= 0; index1 < districts.length; index1 ++) {
				for (int index2 = index1+1; index<districts.length; index2++) {
					if (districts[index1].equals(districts[index2])) index--;
				}
			}
			System.out.println("Number of District:" +index);

		}
		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("End of program");
	}
}