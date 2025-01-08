
public class Monkey extends RescueAnimal{//inherits from RescueAnimal

	private String tailLength;//private attributes
	private String height;
	private String bodyLength;
	private String species;
	

    public Monkey(String name, String species, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, String tailLength,
	String height, String bodyLength) {// constructor
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
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        
    }
        
    public String getTailLength() {//accessers
    	return tailLength;
    }
    
    public String getHeight() {
    	return height;
    }
    
    public String getBodyLength() {
    	return bodyLength;
    }
    
    public String getSpecies() {
    	return species;
    }
    
    public void setTailLength(String tail) {//mutators
        tailLength = tail;
    }
    
    public void setHeight(String monkeyHeight) {
    	height = monkeyHeight;
    }
    
    public void setBodyLength(String length) {
    	bodyLength = length;
    }
    
    public void setSpecies(String monkeySpecies) {
    	species = monkeySpecies;
    }
	
}
