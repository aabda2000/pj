package ocp.ui;

import ocp.infra.ConsoleAdapter;
import ocp.infra.PetLibraryFileAdapter;
import ocp.domain.AnimalFilter;
import ocp.domain.AnimalReader;
import ocp.domain.AnimalType;
import ocp.domain.TypeFilterSpecification;

class App {
	public static void main(String[] args) {
		// 1. Instantiate right-side adapter(s) ("I want to go outside the hexagon")
		PetLibraryFileAdapter fileAdapter = new PetLibraryFileAdapter();

		// 2. Instantiate the hexagon
		AnimalReader animalReader = new AnimalReader(fileAdapter);
		TypeFilterSpecification tfs = new TypeFilterSpecification(AnimalType.Herbivore);
		AnimalFilter animalFilter = new AnimalFilter(tfs);
		
		// 3. Instantiate the left-side adapter(s) ("I want ask/to go inside the hexagon")
		ConsoleAdapter consoleAdapter = new ConsoleAdapter(animalReader);
       
		//4. Get results
		System.out.println("Here is all animals...");
		consoleAdapter.get_all_pets();
		System.out.println("Here is some animals filtered by type...");
		
		consoleAdapter.get_pets_by_the_spec_given(animalFilter);
		System.out.println("Type enter to exit...");

	}
}