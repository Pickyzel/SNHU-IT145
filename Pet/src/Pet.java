
public class Pet {// pet class

	
	 private String petType;
	 private String petName;
	 private int petAge;
	 private int dogSpaces;
	 private int catSpaces;
	 private int daysStay;
	 private double amountDue;
	 
	 private Pet(){ // constructor
		 petType = "Cat";
		 petName = "Name";
		 petAge = 0;
		 dogSpaces = 0;
		 catSpaces = 0;
		 daysStay = 0;
		 amountDue = 0.0;
				 
	 }
	
	 
	 public String getPetType(){// pet type accessor
		 return petType;
	 }
	 public void setPetType(String type){ // pet type mutator
		 petType = type;
	 }
	 public String getPetName(){// pet name accessor
		 return petName;
	 }
	 public void setPetName(String name){// pet name mutator
		 petName = name;
	 }
	 public int getPetAge(){// pet age accessor
		 return petAge;
	 }
	 public void setPetAge(int age){// pet age mutator
		 petAge = age;
	 }
	 public int getDogSpaces(){// dog space accessor
		 return dogSpaces;
	 }
	 public void setDogSpaces(int spaces){// dog space mutator
		 dogSpaces = spaces;
	 }
	 public int getCatSpaces(){// cat space accessor
		 return catSpaces;
	 }
	 public void setCatSpaces(int spaces){// cat space mutator
		 catSpaces = spaces;
	 }
	 public int getDaysStay(){// days stay accessor
		 return daysStay;
	 }
	 public void setDaysStay(int stay){// days stay mutator
		 daysStay = stay;
	 }
	 public double getAmountDue(){// amount due accessor
		 return amountDue;
	 }
	 
	 public void setAmountDue(double amount){// amount due mutator
	 this.amountDue = amount;
	 }
	 
	 
}
	