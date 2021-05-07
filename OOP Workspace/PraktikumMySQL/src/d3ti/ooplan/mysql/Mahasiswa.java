package d3ti.ooplan.mysql;

import java.sql.SQLException;

public class Mahasiswa {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MahasiswaData mahasiswaData = new MahasiswaData();
		for (int i = 0; i < 6; i++) {			
			System.out.println(mahasiswaData.getDataMahasiswa().get(i).getNim());
			System.out.println(mahasiswaData.getDataMahasiswa().get(i).getNama());
			System.out.println(mahasiswaData.getDataMahasiswa().get(i).getEmail());
		}
	}
}
