import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0; // Attributes for the program
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        boolean validateHeight = true; // booleans used to validate if user input is a Double
        boolean validateWidth = true;
        
        
        final double squareFeetPerGallons = 350.0;
        

        do { //do-while loop that validates the user input
            validateHeight = true;//resets height validation
            
        	try {
        		System.out.println("Enter wall height (feet): ");
        		
        	wallHeight = scnr.nextDouble();
        	
        	if(wallHeight <= 0) { // validates that input is not 0.
        		throw new Exception("You have entered an invalid height.");
        	}
        	
        	}catch(Exception newException) { //handles exception if not a double
        		System.out.println("Exception Occurred ----" + newException.getMessage());
        		validateHeight = false;
        		scnr.nextLine();
        	}
        	
        }while(validateHeight == false);

        
        do {//do-while loop that validates the user's width
            validateWidth = true; // resets width validation
            
        	try {
        		System.out.println("Enter wall width (feet): ");
        		
        		wallWidth = scnr.nextDouble();
        		
        		if(wallWidth <= 0) {//validates that user input is not 0
            		throw new Exception("You have entered an invalid width.");
            	}
        		
        	}catch(Exception newException) {//handles exceptions if not a double
        		System.out.println("Exception Occurred-->" + newException.getMessage());
        		validateWidth = false;
        		scnr.nextLine();
        	}
        	
        }while(validateWidth == false);


        wallArea = wallHeight * wallWidth;//Calculates the area of the user's wall.
        System.out.println("Wall area: " + wallArea + " square feet");


        gallonsPaintNeeded = wallArea/squareFeetPerGallons;//Calculates the amount of paint needed.
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}
