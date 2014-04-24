/* 
 * Alex Ferm K887M523
 * Individual project for Object Oriented Programming
 * Written for use by Wichita State Rocket Club
 * 
 * This class contains the basic format for all the points to be monitored
*/

public class GPSpoint implements hasCoordinates{
	private double latitude;
	private double longitude;
	private double altitude;
	private String pointName;
	
	//constructor
	public GPSpoint (double inLat, double inLong, double inAlt, String inName){
		latitude = inLat;
		longitude = inLong;
		altitude = inAlt;
		pointName = new String(inName); 
		
		return;
	}
	
	//copy constructor
	public GPSpoint(GPSpoint copyPoint){
		this.longitude = copyPoint.longitude;
		this.latitude = copyPoint.latitude;
		this.altitude = copyPoint.altitude;
		this.pointName = new String(copyPoint.pointName);
		this.pointName.concat("Copy");
		return;
	}
	
	//setters
	//name
	public void changeName(String inName){
		this.pointName = new String(inName);
		return;
	}
	//longitude
	public void changeLong(double inLong){
		longitude = inLong;
		return;
	}
	//latitude
	public void changeLat(double inLat){
		latitude = inLat;
		return;
	}
	
	
	//getters
	//latitude
	public double getLat(){
		return latitude;
	}
	//longitude
	public double getLong(){
		return longitude;
	}
	//altitude
	public double getAlt(){
		return altitude;
	}
	//name
	public String getName(){
		return pointName;
	}
	
	//calculations
	//NO CALCULATIONS IN THIS CLASS

}
