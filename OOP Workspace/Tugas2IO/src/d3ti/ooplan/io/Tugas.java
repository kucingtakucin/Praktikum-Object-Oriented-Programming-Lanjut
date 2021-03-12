package d3ti.ooplan.io;

/**
 * Copyright 2021. Adam Arthur Faizal. All Rights Reserved.
 * @author Adam Arthur Faizal
 * @version 12 Maret 2021 
 * */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Tugas {
	private Path path;
	private static InputStreamReader isr;
	private static BufferedReader in;
	
	/**
	 * Method untuk memasukkan path yang kita inginkan lewat inputan keyboard,
	 * lalu membuatkan file baru didalam path tersebut
	 * @param String data
	 * @return void
	 * */
	public void setPath(String data) {
		this.path = Paths.get(data);
		try {
			Files.createFile(Paths.get(data));
		} catch (IOException e) {
			System.out.println("File sudah ada sebelumnya");
		}
	}
	
	/**
	 * Method untuk mengisikan sesuatu kedalam file yang ada didalam path
	 * @param String inputContent
	 * @paran String data
	 * @return void
	 * */
	public void isiFile(String inputContent, String linePath) {
		this.path = Paths.get(linePath);
		try {
			BufferedWriter bw = Files.newBufferedWriter(path, Charset.forName("ISO-8859-1"), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			bw.write(inputContent, 0, inputContent.length());
			bw.close();
		} catch (IOException e) {
			e.printStackTrace(); 
			System.exit(0);
		 }
	}
	
	
	/**
	 * Method untuk mendapatkan keterangan atau properties dari file kita
	 * @param Path path
	 * @return void
	 * */
	public void getProperties(Path path) {
		System.out.printf("Nama file: %s \n", path.getFileName());
		System.out.printf("Parent  file: %s \n ", path.getParent());
		System.out.printf("Jumlah subfolder: %s \n", path.getNameCount());
		System.out.printf("Apakah path merupakan absolut? %s \n", path.isAbsolute());
		System.out.printf("Subpath dari 0 ke 3: %s \n", path.subpath(0,3));
		System.out.printf("Apakah readable? %s \n", Files.isReadable(path));
		System.out.printf("Apakah writable? %s \n", Files.isWritable(path));
		System.out.printf("Apakah executable? %s \n", Files.isExecutable(path));
		System.out.print("Apakah hidden? ");
		try {
			System.out.println(Files.isHidden(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("Apakah sama filenya?");
		try {
			System.out.println(Files.isSameFile(path, path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("Apakah ada filenya? %s \n", Files.exists(path, LinkOption.NOFOLLOW_LINKS));
	}
	
	/**
	 * Method untuk membaca file berdasarkan inputan path tadi
	 * @param String inputPath
	 * @return void
	 * */
	public void bacaFile(String inputPath) {
		String line = "", fileContent = "";
		try {
			BufferedReader fileInput = new BufferedReader(new FileReader(new File(inputPath)));
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
			// No more lines to read
			System.exit(0);
		} catch (IOException e) {
			// Error reading file
			System.exit(0);
		}
		System.out.printf("Isi file: %s \n", fileContent);
	}
	
	/**
	 * Ini adalah main method
	 * @param String[] args
	 * */
	public static void main(String[] args) {
		Tugas tugas = new Tugas();
		String linePath = "", isiFile = "";
		
		System.out.print("Masukkan path file yang kamu inginkan: ");
		isr = new InputStreamReader(System.in);
		in = new BufferedReader(isr);
		try {
			linePath = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		tugas.setPath(linePath);
		
		System.out.print("Masukkan kata/kalimat sesuka kamu untuk mengisi file: ");
		isr = new InputStreamReader(System.in);
		in = new BufferedReader(isr);
		try {
			isiFile = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		tugas.isiFile(isiFile, linePath);
		tugas.getProperties(Paths.get(linePath));
		tugas.bacaFile(linePath);
	}
}
