package ocp.domain;

import java.util.ArrayList;

public interface IRequestPets {

	public ArrayList<Animal> filter_by_the_type_given(AnimalType animalType);
	public ArrayList<Animal> before_each_spec();
}