package ubu.gii.dass.refactoring;

public abstract class MovieType {

	abstract double getCharge(Rental rental);

	public int getFrequentRenterPoints(Rental rental) {
		return 1;
	}
}
