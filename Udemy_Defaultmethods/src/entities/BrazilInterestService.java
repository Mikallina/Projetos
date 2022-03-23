package entities;

public class BrazilInterestService implements InterestService {
	
	//f�mula para o calculo com potencia��o 
	// payment = amount * (1 + interestRate / 100) elevando a N numeros de meses
	
	private double interestRate;

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
