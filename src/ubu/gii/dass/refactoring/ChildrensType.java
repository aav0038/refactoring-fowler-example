package ubu.gii.dass.refactoring;

public class ChildrensType extends MovieType {

	@Override
	double getCharge(Rental rental) {
		double result = 1.5;
		if (rental.getDaysRented() > 3)
			result += (rental.getDaysRented() - 3) * 1.5;
		return result;
	}


}
