package ocp.domain;

import java.util.ArrayList;

public class AnimalFilter {
	AnimalFilterSpecification filterSpecification;
	public AnimalFilter(AnimalFilterSpecification filterSpecification) {
		this.filterSpecification=filterSpecification;
	}
	
	public AnimalFilter() {
		
	}
	public Iterable<Animal> By(ArrayList<Animal> animals) {
		return filterSpecification.Filter(animals);
	}

}