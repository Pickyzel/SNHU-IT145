//Tiffany McDonnell
//SNHU It-145

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();//monkey array list

    private static String userMenuOption = "1";//user input for menu

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);


        initializeDogList();
        initializeMonkeyList();
        
        while(!userMenuOption.equals("q")) {//loops through menu options
        	
        	displayMenu();
        	userMenuOption = scnr.nextLine();
        	
        	switch (userMenuOption) {//switch statement for menu options
        	case "1":  intakeNewDog(scnr);//creates new Dog object
                 	break;
        	case "2":  intakeNewMonkey(scnr);//creates new Monkey object
                 	break;
        	case "3":  reserveAnimal(scnr); //reserves an animal
                 	break;
        	case "4":  printAnimals(userMenuOption); //prints all dogs in list
        			break;
        	case "5":  printAnimals(userMenuOption);//prints all monkeys in list
                 	break;
        	case "6":  printAnimals(userMenuOption);//prints all animals that are in service and are not reserved
                 	break;
        	case "q":  userMenuOption = "q"; // ends the while loop
                 	break;

        	default: 
        			System.out.println("Invalid selection!");//lets user know input was invalid
        			if(userMenuOption != "q") {
        				continue;
        			}
        		}
        }

    }

    public static void displayMenu() {//shows the user the menu options
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    public static void initializeDogList() {//adds 3 test dogs
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    public static void initializeMonkeyList() {// adds 3 test monkeys
    	
    	Monkey monkey1 = new Monkey("Momo", "Tamarin", "female", "1", "25.6", "05-12-2019", "Mexico", "intake", true, "Mexico", "12", "9", "20");
        Monkey monkey2 = new Monkey("Kiki", "Squirrel monkey", "female", "3", "35.2", "02-03-2020", "Germany", "Phase I", false, "Germany", "13", "10", "21");
        Monkey monkey3 = new Monkey("George", "Guenon", "male", "4", "25.6", "12-12-2019", "France", "in service", false, "France", "14", "11", "22");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }


    public static void intakeNewDog(Scanner scanner) {//creates a new dog object if it is not already created
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        System.out.println("What is the dog's breed?");
        String breed = scnr.nextLine();
        
        System.out.println("What is the dog's gender?");
        String gender = scnr.nextLine();
        
        System.out.println("What is the dog's age?");
        String age = scnr.nextLine();
        
        System.out.println("What is the dog's weight?");
        String weight = scnr.nextLine();
        
        System.out.println("What is the dog's acquisition date?");
        String date = scnr.nextLine();
        
        System.out.println("What is the dog's acquistion country?");
        String country = scnr.nextLine();

        String status;
        while(true) {
            System.out.println("What is the dog's training status?");
            status = scnr.nextLine();
        
            //validates status input
        	if (!(status.equalsIgnoreCase("intake")) && !(status.equalsIgnoreCase("Phase I")) && !(status.equalsIgnoreCase("Phase II")) && !(status.equalsIgnoreCase("Phase III")) 
        		&& !(status.equalsIgnoreCase("Phase IV")) && !(status.equalsIgnoreCase("Phase V")) && !(status.equalsIgnoreCase("in service")) && !(status.equalsIgnoreCase("farm"))) {
                	System.out.println("\nInvalid Status. Please choose from: Intake, Phase I, Phase II, Phase III, Phase IV, Phase V,in service, or farm.\n");
                	continue;
        	}
        	else {
        		break;
        	}
        }
        System.out.println("Is the dog resurved?");
        Boolean reserved = scnr.nextBoolean();
        scnr.nextLine();

        System.out.println("What is the dog's service Country?");
        String service = scnr.nextLine();
        
        Dog doggy = new Dog(name,breed,gender,age,weight,date,country,status,reserved,service);
        
        dogList.add(doggy);//adds new dog to list

    }

        public static void intakeNewMonkey(Scanner scanner) {//creates a new monkey object if not already created

            Scanner scnr = new Scanner(System.in);

            	System.out.println("What is the monkey's name?");
            	String name = scanner.nextLine();
           
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
            System.out.println("What is the monkey's species?");
            String species = scnr.nextLine();
            
            //validates that user input is of the correct species
            if (!(species.equalsIgnoreCase("Capuchin")) && !(species.equalsIgnoreCase("Guenon")) && !(species.equalsIgnoreCase("Macaque")) && 
            	!(species.equalsIgnoreCase("Marmoset")) && !(species.equalsIgnoreCase("Squirrel Monkey")) && !(species.equalsIgnoreCase("Tamarin"))) {
                System.out.println("\n\nThis monkey's species is not allowed\n\n");
                return;
            }
            
            System.out.println("What is the monkey's gender?");
            String gender = scnr.nextLine();
            
            System.out.println("What is the monkey's age?");
            String age = scnr.nextLine();
            
            System.out.println("What is the monkey's weight?");
            String weight = scnr.nextLine();
            
            System.out.println("What is the monkey's acquisition date?");
            String date = scnr.nextLine();
            
            System.out.println("What is the monkey's acquistion country?");
            String country = scnr.nextLine();
            String status;
            
            //validate the train status input
            while(true) {
            	System.out.println("What is the monkey's training status?");
            	status = scnr.nextLine();
            	if (!(status.equalsIgnoreCase("intake")) && !(status.equalsIgnoreCase("Phase I")) && !(status.equalsIgnoreCase("Phase II")) && !(status.equalsIgnoreCase("Phase III")) 
            		&& !(status.equalsIgnoreCase("Phase IV")) && !(status.equalsIgnoreCase("Phase V")) && !(status.equalsIgnoreCase("in service")) && !(status.equalsIgnoreCase("farm"))) {
                    	System.out.println("\nInvalid Status. Please choose from: Intake, Phase I, Phase II, Phase III, Phase IV, Phase V,in service, or farm.\n");
                    	continue;
                }
            	else {
            		break;
            	}
            }

            
            System.out.println("Is the monkey reserved?");
            Boolean reserved = scnr.nextBoolean();
            
            scnr.nextLine();

            System.out.println("What is the monkey's service Country?");
            String service = scnr.nextLine();
            
            System.out.println("What is the monkey's tail length?");
            String tail = scnr.nextLine();
            
            System.out.println("What is the monkey's height?");
            String height = scnr.nextLine();
            
            System.out.println("What is the monkey's body length?");
            String body = scnr.nextLine();
            
            Monkey mkey = new Monkey(name, species, gender, age, weight, date, country,
            		status, reserved, service, tail, height, body);
            
            monkeyList.add(mkey); 
            
            /*test print to view created monkey
            System.out.println(mkey.getName() + " " + mkey.getSpecies() + " " + mkey.getGender()+ " "
            		+ mkey.getAge() + " " + mkey.getWeight() + " " + mkey.getAcquisitionDate()+ " " +
            		mkey.getAcquisitionLocation()+ " " + mkey.getTrainingStatus() + " " + mkey.getReserved()
            		+ " " + mkey.getInServiceLocation() + " " + mkey.getTailLength() + " " + mkey.getHeight() + " " + mkey.getBodyLength());*/
        }

        public static void reserveAnimal(Scanner scanner) {//reserves based on animal, country, and availability
            Scanner scnr = new Scanner(System.in);
            System.out.println("What is your desired animal?");
            String userAnimal = scnr.nextLine();
            System.out.println("What is the Country?");
            String userCountry = scnr.nextLine();
            while(true) {
                if(userAnimal.equalsIgnoreCase("Dog")) {
                    for(Dog dog: dogList) {
                    	if(dog.getAcquisitionLocation().equalsIgnoreCase(userCountry)){
                    		if("in service".equals(dog.getTrainingStatus())) {
                    			if(dog.getReserved()== false) {
                    				dog.setReserved(true);
                    				System.out.println("Your reserved " + dog.getName());
                    				return; //returns to menu
                    			}
                    		}
                    	}

                    
                    }
            		System.out.println("Sorry there are no dogs available!");
            		return;
                }
                
                if(userAnimal.equalsIgnoreCase("Monkey")) {
                    for(Monkey monkey: monkeyList) {
                    	if(monkey.getAcquisitionLocation().equalsIgnoreCase(userCountry)){
                    		if("in service".equals(monkey.getTrainingStatus())) {
                    			if(monkey.getReserved()== false) {
                    				monkey.setReserved(true);
                    				System.out.println("Your reserved " + monkey.getName());
                    				return; //returns to menu
                    			}
                    		}
                    	}
                    }
            		System.out.println("Sorry there are no monkeys available!");
            		return;
                }
            }

        }

        
        public static void printAnimals(String print) {
            Scanner scnr = new Scanner(System.in);
            switch(print) {
            case "4"://prints dogs in list
            	System.out.println("\"Name - Status - Location - Reserved\"\n");
            	for(Dog dog: dogList) {
            		System.out.print(dog.getName() + " - " + dog.getTrainingStatus() + " - ");
            		System.out.println(dog.getAcquisitionLocation() + " - " + dog.getReserved());
            		
            	}
            	break;
            case "5": //prints monkey's in list
            	System.out.println("\"Name - Status - Location - Reserved\"\n");
            	for(Monkey monkey: monkeyList) {
            		System.out.print(monkey.getName() + " - " + monkey.getTrainingStatus() + " - ");
            		System.out.println(monkey.getAcquisitionLocation() + " - " + monkey.getReserved());
            	}
            	break;
            case "6"://print all animals that are not reserved
            	System.out.println("\"Name - Status - Location - Reserved\"\n");
            	for(Dog dog: dogList) {
            		if(dog.getTrainingStatus().equalsIgnoreCase("in service")) {
            			if(dog.getReserved() == false) {
            				System.out.print(dog.getName() + " - " + dog.getTrainingStatus() + " - ");
                    		System.out.println(dog.getAcquisitionLocation() + " - " + dog.getReserved());
            			}
            		}
            	}
            	for(Monkey monkey: monkeyList) {
            		if(monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
            			if(monkey.getReserved() == false) {
            				System.out.print(monkey.getName() + " - " + monkey.getTrainingStatus() + " - ");
                    		System.out.println(monkey.getAcquisitionLocation() + " - " + monkey.getReserved());
            			}
            		}
            	}
            	
            }
        }
}


