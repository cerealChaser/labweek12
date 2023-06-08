package exercise5;

import java.io.DataInputStream;
import java.io.FileInputStream;
/*
 * This class is to generate the Daily Rainfall Data 
 * in a station
 * 
 * @author MacaurelNoelMakRaymund
 * */
public class RainfallDataReader {
	public static void main(String args[]) {
		
		// Declare input file
		String inputFileName = "rainfallData.txt";
		
		System.out.println("Reading data from "+inputFileName+ "\n");
		try {	
			
			// Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(inputFileName));
			

			//Variables for accepting data
			int data = 0;
			int noOfData = 0;
			int totalRainfall = 0;
			int average = 0;
			
			while (dis.available() > 0) {
				
				//Read Data
				data = dis.read();
				
				// Display data
				System.out.println(data);
				
				//Calculate the total for 6 days
				totalRainfall += data;
				
				//Get number of data
				noOfData++;
			}
			
			//Close the stream
			dis.close();
			
			//Calculate average for 6 days
			average = totalRainfall / noOfData;
			
			//Display average rainfall within 6 days
			System.out.println("\nAverage within 6 days: "+average);
			
		} 
		// Error Handling
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//Let user know the program has ended
		System.out.println("Program has ended.");
	}
}
