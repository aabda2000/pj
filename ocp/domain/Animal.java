package ocp.domain;
public class Animal {

    public AnimalType animalType;
    private AnimalSize animalSize;
    private String name;

    public Animal(String name, AnimalType type, AnimalSize size) {
    	this.setName(name);
        this.animalType = type;
        this.animalSize=size;
    }

	
	public AnimalSize getSize() {
		return animalSize;
	}

	
	public void setSize(AnimalSize size) {
		this.animalSize=size;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

    
}