package abstract_classes.farm;

public abstract class Animal {

	protected String name;
	protected int age;

	public Animal(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int age() {
		return age;
	}

	abstract public void makeNoice();

}
