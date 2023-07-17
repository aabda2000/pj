package ocp.domain;

import java.util.ArrayList;


public class TypeFilterSpecification extends AnimalFilterSpecification {

	private AnimalType animalType;

	public TypeFilterSpecification(AnimalType animalType) {
		this.animalType = animalType;
	}

	@Override
	protected Iterable<Animal> ApplyFilter(ArrayList<Animal> animals) {
		ArrayList<Animal> aList = new ArrayList<Animal>();
		for (Animal animal : animals) {
			if (animal.animalType == animalType)
				aList.add(animal);

		}
		return aList;

	}
}
