package abstract_classes.cities;

public class SanDiego extends City {
 
Double a;	
	
	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		
		  a = getTaxes() + 1000000;
		// TODO Auto-generated method stub
		return a;
	}

}
