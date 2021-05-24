package d;
public class Sphynx implements IAnimal {
	
	private int idTag = 0;
	private String animalType = "Sphynx";
	private final int MIN_TEMPERATURE = 36;
	private final int MAX_TEMPERATURE = 115;



	public String getAnimalType() {
		return animalType;
	}


	public int getIdTag() {
		return idTag;
	}


	public void setIdTag(int idTag) {
		this.idTag = idTag;
	
	}


	public int getMinTemperature() {
		return MIN_TEMPERATURE;
	}

	public int getMaxTemperature() {
		return MAX_TEMPERATURE;
	}
}
