package d3ti.ooplan.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BacaInput {
	
	public static void main(String[] args) {
		String line = "";
		System.out.println("Masukkan kata/kalimat sesuka kamu: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		try {
			line = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(line);
	}
}
