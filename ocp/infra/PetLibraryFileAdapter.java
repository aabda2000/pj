package ocp.infra;

import java.util.ArrayList;

import ocp.domain.Animal;
import ocp.domain.AnimalSize;
import ocp.domain.AnimalType;
import ocp.domain.IObtainPets;

public class PetLibraryFileAdapter implements IObtainPets {
	private ArrayList<Animal> animals ;

	public ArrayList<Animal> GetAllPets() {
		return buildAnimals();
	}

	private ArrayList<Animal> buildAnimals() {
		animals = new ArrayList<Animal> ();
		animals.add(new Animal("Cow", AnimalType.Herbivore, AnimalSize.Large));
		animals.add(new Animal("Zebra", AnimalType.Herbivore, AnimalSize.ReallyBig));
		animals.add(new Animal("Lion", AnimalType.Carnivore, AnimalSize.Medium));
		return animals;
	}
}