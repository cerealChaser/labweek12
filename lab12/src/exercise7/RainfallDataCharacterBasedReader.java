package exercise7;

import java.io.FileReader;
import java.io.Reader;

/*
 *This class is to read the data generated by the
 *class RainfallDataCharacterbasedGenerator
 *
 *@author MacaurelNoelMakRaymund
 * */
public class RainfallDataCharacterBasedReader {
	public static void main (String args[]) {

		//Declare target file
		String fileName = "rainfallDataCharacterBased.txt";

		//Variables declaration
		int data;
		int total = 0;
		int average = 0;
		int noOfData = 0;

		try {
			//Declare the stream
			Reader reader = new FileReader (fileName);

			//Read data from file
			while(reader.ready() == true) {

				// Get no of data per iteration
				noOfData++;

				// Assign data from text file to variable
				data=reader.read();

				// Display data
				System.out.println(data);

				//Total the data per iteration
				total += data;
			}

			// Calculate the average for 6 days
			average = total / noOfData;

			//Display average and total
			System.out.println("Total within 6 days  : "+ total);
			System.out.println("Average within 6 days: "+average);

		}
		catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("Program terminated.");
	}
}
