
public class Cat{  //a java class named Cat
	private int catSpaceNumber;  //attribute
	
	public Cat(){  //constructor
		catSpaceNumber = 12;
	}
	
	public void setCatSpaceNumber(int spaceNumber){ //mutator
		catSpaceNumber = spaceNumber;
	}
	
	public int getCatSpaceNumber(){   //accessor
		return catSpaceNumber;
	}

}
