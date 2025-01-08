import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);//attributes
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded = 0.0;
        boolean validateHeight = true;
        boolean validateWidth = true;

        final double squareFeetPerGallons = 350.0;
        //final double gallonsPerCan = 1.0;
        
        do {//loop that validates user input is a double
        	validateHeight = true;
        	
        	try {//handles exceptions
                System.out.println("Enter wall height: ");
                wallHeight = scnr.nextDouble();
                
        		if(wallHeight <= 0) {
        			throw new Exception("You have entered an invalid height: ");
        		}
        	
        	}catch(Exception newException) {
        		System.out.println("Exception Occurred --- " + newException.getMessage());
        		validateHeight = false;
        		scnr.nextLine();
        	}

        	}while(validateHeight == false);

        do {//loop that validates user input is a double
        	validateWidth = true;
        	
        	try {     //handles exceptions
        		System.out.println("Enter wall width): ");
        		wallWidth = scnr.nextDouble();
        		
        		if(wallWidth <= 0) {
        			throw new Exception("You have entered an invalid width: ");
        		}
        		
        	}catch(Exception newException) {
        		System.out.println("Exception Occurred --- " + newException.getMessage());
        		validateWidth = false;
        		scnr.nextLine();
        	}

        	}while(validateWidth == false);

        wallArea = wallHeight * wallWidth;//calculates wallArea
        System.out.println("Wall area: "  + wallArea + " square feet");

        
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;//calculates how much paint is needed
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        cansNeeded = Math.ceil(gallonsPaintNeeded);//allows the double to round up
        
        System.out.println("Cans needed: " + cansNeeded + " can(s)");//prints cansNeeded
    }
}
