
public class Dog {

	private int dogSpaceNumber;  //attribute
	private int dogWeight;
	private boolean grooming;
	
	public Dog(){  //constructor
		dogSpaceNumber = 12;
	}
	
	public void setDogSpaceNumber(int spaceNumber){ //mutator
		dogSpaceNumber = spaceNumber;
	}
	
	public void setDogWeight(int weight) {
		dogWeight = weight;
	}
	
	public void setGrooming(boolean dogGrooming) {
		grooming = dogGrooming;
	}
	
	public int getDogSpaceNumber(){   //accessor
		return dogSpaceNumber;
	}
	
	public int getDogWeight() {
		return dogWeight;
	}
	
	public boolean getGrooming() {
		return grooming;
	}
	
	
}
