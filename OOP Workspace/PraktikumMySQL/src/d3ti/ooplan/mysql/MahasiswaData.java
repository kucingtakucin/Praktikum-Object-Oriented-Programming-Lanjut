package d3ti.ooplan.mysql;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class MahasiswaData {
	public Connection connection;
	public Statement statement;
	public ResultSet resultSet;
	public ArrayList<MahasiswaModel> dataMahasiswa;
	public String databaseHandler, host, dbname, username, password, query;
	
	public MahasiswaData() throws ClassNotFoundException, SQLException {
		this.host = "127.0.0.1";
		this.dbname = "pemweblan";
		this.username = "root";
		this.password = "";
		this.databaseHandler = String.format("jdbc:mysql://%s/%s?user=%s&password=%s", this.host, this.dbname, this.username, this.password);;
		this.dataMahasiswa = new ArrayList<MahasiswaModel>();
		Class.forName("com.mysql.jdbc.Driver");
		this.connection = (Connection) DriverManager.getConnection(this.databaseHandler);
	}
		
	public ArrayList<MahasiswaModel> getDataMahasiswa() throws SQLException{
		this.statement = (Statement) connection.createStatement();
		this.query = "SELECT * FROM mahasiswa";
		this.resultSet = (ResultSet) this.statement.executeQuery(this.query);
		while (this.resultSet.next()) {
			MahasiswaModel mahasiswaModel = new MahasiswaModel();
			mahasiswaModel.setId(this.resultSet.getString(1));
			mahasiswaModel.setNim(this.resultSet.getString(2));
			mahasiswaModel.setNama(this.resultSet.getString(3));
			mahasiswaModel.setPassword(this.resultSet.getString(4));
			mahasiswaModel.setEmail(this.resultSet.getString(5));
			mahasiswaModel.setTanggal_lahir(this.resultSet.getString(6));
			mahasiswaModel.setJenis_kelamin(this.resultSet.getString(7));
			mahasiswaModel.setProdi(this.resultSet.getString(8));
			mahasiswaModel.setWarga_negara(this.resultSet.getString(9));
			mahasiswaModel.setStatus(this.resultSet.getString(10));
			mahasiswaModel.setKeterangan(this.resultSet.getString(11));
			this.dataMahasiswa.add(mahasiswaModel);
		}
		return this.dataMahasiswa;
	}
}
