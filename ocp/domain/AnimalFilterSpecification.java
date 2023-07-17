package ocp.domain;

import java.util.ArrayList;
import java.util.Enumeration;

public abstract class AnimalFilterSpecification {
	public Iterable<Animal> Filter(ArrayList<Animal> animals) {
		return ApplyFilter(animals);
	}

	protected abstract Iterable<Animal> ApplyFilter(ArrayList<Animal> animals);
}