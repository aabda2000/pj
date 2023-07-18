package ocp.infra;

import java.util.ArrayList;

import ocp.domain.Animal;
import ocp.domain.AnimalFilter;
import ocp.domain.AnimalFilterSpecification;
import ocp.domain.AnimalType;
import ocp.domain.IRequestPets;
import ocp.domain.TypeFilterSpecification;

public class ConsoleAdapter {

	private IRequestPets animalReader;

	public ConsoleAdapter(IRequestPets animalReader) {
		this.animalReader = animalReader;
	}


	public void get_all_pets() {
		// from infra to domain

		// busines logic
		Iterable<Animal> pets = this.animalReader.before_each_spec();
		// from domain to Infra
		pets.forEach((element) -> {
			System.out.println(element.getName());
		});
	}

	public void get_pets_by_the_spec_given(AnimalFilter af) {
		// from infra to domain

		// busines logic
		Iterable<Animal> pets = this.animalReader.filter_by_the_type_given(af);
		// from domain to Infra
		pets.forEach((element) -> {
			System.out.println(element.getName());
		});
	}

}

			


	

