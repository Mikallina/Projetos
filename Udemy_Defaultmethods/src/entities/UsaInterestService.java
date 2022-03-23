package entities;

public class UsaInterestService implements InterestService {
	
	//fómula para o calculo com potenciação 
	// payment = amount * (1 + interestRate / 100) elevando a N numeros de meses
	
	private double interestRate;

	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
