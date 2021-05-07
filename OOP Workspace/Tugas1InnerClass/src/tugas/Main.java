package tugas;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

public class Main {
	
	public static void main(String[] args) {
		String line = "";
		String content = "";
		String letak = "C:/Users/PC-Mburi/Documents/tulis-file.txt";
		try {
			BufferedReader fileInput = new BufferedReader(new FileReader(new File(letak)));
			line = fileInput.readLine();
			content = line + "\n";
			while (line != null){
				line = fileInput.readLine();
				if (line != null) {
					content += line + "/n";
				}
			}
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		}						
		System.out.println(Paths.get(URL.create(“file:///~/kmm.txt”));

		System.out.println(content);
		Path path = Paths.get(letak);
		System.out.println(path.getFileName());  // Nama file
		System.out.println(path.getParent());  // Nama parent
		System.out.println(path.getNameCount());  // Jumlah sub folder
		System.out.println(path.subpath(1, 2));  // Type file absolut
		System.out.println(Files.isReadable(path));  // Sub file 1 - 2
		System.out.println(Files.isWritable(path));  // Apakah writable
		System.out.println(Files.isExecutable(path));  // Apakah executable
	}
}
	