package JavaCode;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

public class CSVFileReader {

	public static void main(String[] args) throws IOException, CsvException {
		
		
		// To read data from CSV file

		CSVReader rd = new CSVReader(new FileReader("CSVDataFolder//input.csv"));

		String[] inputData;

		while ((inputData = rd.readNext()) != null) {
			for (int i = 0; i < inputData.length; i++) {
				System.out.print(inputData[i] + " ");

			}
			System.out.println(" ");

		}

		
		// To print data in  output file in reverse order
		
		CSVWriter writer = new CSVWriter(new FileWriter("CSVDataFolder//output.csv"));

		CSVReader rd1 = new CSVReader(new FileReader("CSVDataFolder//input.csv"));

		List<String[]> list = rd1.readAll();
		writer.writeNext(list.get(0));

		for (int i = list.size() - 1; i > 0; i--) {

			writer.writeNext(list.get(i));
		}
		writer.flush();

	}
	
	
	

}
