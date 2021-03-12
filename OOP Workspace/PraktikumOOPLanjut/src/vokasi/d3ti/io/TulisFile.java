package vokasi.d3ti.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TulisFile {

	public static void main(String[] args) {
		String letakFile = "C:/Users/PC-Mburi/Documents/tulis-file.txt";
		Path path = Paths.get(letakFile);
		try {
			BufferedWriter bw = Files.newBufferedWriter(path, Charset.forName("ISO-8859-1"), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			String content = "Data Pertama";
			bw.write(content, 0, content.length());
			bw.close();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}
