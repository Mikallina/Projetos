package entities;

public class Temperatura {
	
	
	public Double c;
	
		
	public Temperatura() {
	}

	public double F () {
		return  c * 1.8;
	} 
	public double K () {
		return  c + 273.15;
	}
	public double Re () {
		return c * 0.8;
	} 
	public double Ra () {
		return c * 1.8+32+459.67;
	} 
	
	public String toString () {
		return "Celsius " + c +
		"\nKelvin " + K() + 
		"\nReaumur " + Re() + 
		"\nRankine " + Ra() + 
		"\nFahrenheit " + F();
	
	}
}
