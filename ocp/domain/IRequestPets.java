package ocp.domain;

import java.util.ArrayList;

public interface IRequestPets {

	public ArrayList<Animal> filter_by_the_type_given(AnimalFilter af);
	public ArrayList<Animal> before_each_spec();
}