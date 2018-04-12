package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();

		Animal pig = new Pig("Zach", 2);
		Animal horse = new Horse("Blue", 5);
		Animal duck = new Duck("Kevin", 3);
		Animal cow = new Cow("Nancy", 4);
		Animal cowTwo = new Cow("Andrew", 6);
		Animal cowThree = new Cow("Helen", 7);

		farm.add(pig);
		farm.add(horse);
		farm.add(duck);
		farm.add(cow);
		farm.add(cowTwo);
		farm.add(cowThree);

		for (int i = 0; i < farm.size(); i++) {

			farm.get(i).makeNoice();

		}

	}
}
