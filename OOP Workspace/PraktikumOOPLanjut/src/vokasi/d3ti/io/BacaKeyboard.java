package vokasi.d3ti.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BacaKeyboard {

	public static void main(String[] args) {
		String line = "";
		System.out.println("Masukkan kata/kalimat yang anda inginkan");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		try {
			line = in.readLine();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		System.out.println(line);
	}
}
