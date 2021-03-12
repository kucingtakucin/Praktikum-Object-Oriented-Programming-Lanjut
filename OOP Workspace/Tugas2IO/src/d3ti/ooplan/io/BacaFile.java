package d3ti.ooplan.io;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BacaFile {

	public static void main(String[] args) {
		String line = "", fileContent = "";
		try {
			BufferedReader fileInput = new BufferedReader(new FileReader(new File("C:/Users/PC-Mburi/Documents/tulis-file.txt")));
			line = fileInput.readLine();
			fileContent = line + "\n";
			while (line != null) {
				line = fileInput.readLine();
				if (line != null) {
					fileContent += line + "\n";
				}
			}
			fileInput.close();
		} catch (EOFException e) {
			e.printStackTrace();	// No more lines to read
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();	// Error reading file
			System.exit(0);
		}
		System.out.println(fileContent);
	}
}
