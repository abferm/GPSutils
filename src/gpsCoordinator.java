import java.util.ArrayList;
import java.util.Scanner;


public class gpsCoordinator {
	
	public ArrayList points = new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int action = 0;
		int exitFlag = 0;
		Scanner input = new Scanner(System.in);
		do{
		// Generate user menue
		System.out.println("Welcome to Alex Ferm's GPS Coordinator");
		System.out.println("Main menue:");
		System.out.println("1: Manage Points");
		System.out.println("2: Display Points");
		System.out.println("3: Exit");
		System.out.println("Enter your selection: ");
		action = input.nextInt();
		
		// Call appropriate method
		switch (action){
		case 1:
			pointManagement();
			break;
		case 2:
			pointDisplay();
			break;
		case 3:
			exitFlag = 1;
		}
		
		}while(exitFlag != 1);

	}
	
	public static void pointManagement(){
		int action = 0;
		int exitFlag = 0;
		Scanner input = new Scanner(System.in);
		do{
		// Generate user menue
		System.out.println("Point Managemente Menue:");
		System.out.println("1: Add a Point");
		System.out.println("2: Remove a Point");
		System.out.println("3: Change a Point");
		System.out.println("4: Main Menue");
		System.out.println("Enter your selection: ");
		action = input.nextInt();
		
		// Call appropriate method
		switch (action){
		case 1:
			addPoint();
			break;
		case 2:
			removePoint();
			break;
		case 3:
			changePoint();
		case 4:
			exitFlag = 1;
		}
		
		}while(exitFlag != 1);
		input.close();
	}
	
	public static void pointDisplay(){
		
	}
	
	public static void addPoint(){
		
	}
	
	public static void removePoint(){
		
	}
	
	public static void changePoint(){
		
	}

}
