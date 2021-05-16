package ubu.gii.dass.refactoring;

public class NewReleaseType extends MovieType {

	@Override
	double getCharge(Rental rental) {
		return rental.getDaysRented() * 3;
	}
	
	@Override
	public int getFrequentRenterPoints(Rental rental) {
		return (rental.getDaysRented() > 1) ? 2 : 1;
	}

 
}
