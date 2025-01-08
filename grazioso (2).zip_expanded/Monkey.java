
public class Monkey extends RescueAnimal{

    // Instance variable
    private int tailLength;
    private int height;
    private int bodyLength;
    private String species;

    // Constructor
    public Monkey(String name, String species, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, int tailLength,
	int height, int bodyLength) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }

    // Accessor Method
    public String getSpecies() {
        return species;
    }
    
    public int getTailLength() {
    	return tailLength;
    }
    
    public int getHeight() {
    	return height;
    }
    
    public int getBodyLength() {
    	return bodyLength;
    }

    // Mutator Method
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }
    
    public void setTailLength(int tail) {
    	tailLength = tail;
    }
    
    public void setHeight(int monkeyHeight) {
    	height = monkeyHeight;
    }
    
    public void setBodyLength(int bdyLength) {
    	bodyLength = bdyLength;
    }  
}

