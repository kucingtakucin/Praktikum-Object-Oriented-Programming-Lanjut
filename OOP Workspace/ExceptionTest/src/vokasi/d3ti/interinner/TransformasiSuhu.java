package vokasi.d3ti.interinner;

public interface TransformasiSuhu {
	public final int FAHRENHEIT = 32;
	public abstract double CelsioustoFahrenheit(double celsius);
	public abstract double CelsioustoReamur(double celsius);
	
	public abstract double FahrenheittoCelsious(double fahrenheit);
	public abstract double FahrenheittoReamur(double fahrenheit);
	
	public abstract double ReamurtoCelsious(double reamur);
	public abstract double ReamurtoFahrenheit(double reamur);
}
