package abstract_classes.cities;

public class Boston extends City {

	Double a;
	
	public Boston(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		
		a = (0.50*population)+ getTaxes();
		// TODO Auto-generated method stub
		return a;
	}

}
