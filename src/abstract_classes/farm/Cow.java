package abstract_classes.farm;

public class Cow extends Animal{

	public Cow(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void makeNoice() {
		// TODO Auto-generated method stub

		System.out.println("MOO");
		
	}

}
