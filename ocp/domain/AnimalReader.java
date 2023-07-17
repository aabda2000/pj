package ocp.domain;

import java.util.ArrayList;

public class AnimalReader implements IRequestPets {
	private IObtainPets petsLibrary;

	public AnimalReader(IObtainPets petsLibrary) {
		this.petsLibrary = petsLibrary;
	}

	public ArrayList<Animal> before_each_spec() {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals = petsLibrary.GetAllPets();
		return animals;

	}

	public ArrayList<Animal> filter_by_the_type_given(AnimalType animalType) {
		AnimalFilter animalFilter = new AnimalFilter();
		ArrayList<Animal> animals = new ArrayList<Animal>();
		ArrayList<Animal> filteredAnimals = new ArrayList<Animal>();
		animals = petsLibrary.GetAllPets();

		for (Animal animal : animalFilter.By(animals, new TypeFilterSpecification(animalType))) {
			filteredAnimals.add(animal);
		}
		return filteredAnimals;

	}

}
