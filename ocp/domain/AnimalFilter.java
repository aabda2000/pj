package ocp.domain;

import java.util.ArrayList;

public class AnimalFilter {

	public Iterable<Animal> By(ArrayList<Animal> animals, AnimalFilterSpecification filterSpecification) {
		return filterSpecification.Filter(animals);
	}

}