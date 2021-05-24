package d;
public class Sphynx implements IAnimal {
	
private int idTag = 0;


public String getAnimalType() {
	String animalType = "Sphynx";
	return animalType;
}


public int getIdTag() {
	return idTag;
}


public void setIdTag(int idTag) {
	this.idTag = idTag;
	
}


public int getMinTemperature() {
	int minTemperature = 36;
	return minTemperature;
}

public int getMaxTemperature() {
	int maxTemperature = 115;
	return maxTemperature;
}
}