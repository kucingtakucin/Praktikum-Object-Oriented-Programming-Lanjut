package d3ti.ooplan.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TulisFile {

	public static void main(String[] args) {
		Path path = Paths.get("C:/Users/PC-Mburi/Documents/tulis-file.txt");
		try {
			BufferedWriter bw = Files.newBufferedWriter(path, Charset.forName("ISO-8859-1"), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			String fileContent = "Saya yang menuliskan data ini";
			bw.write(fileContent, 0, fileContent.length());
			bw.close();
		} catch (IOException e) {
			e.printStackTrace(); 
			System.exit(0);
		 }
	}
}
