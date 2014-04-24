/* 
 * Alex Ferm K887M523
 * Individual project for Object Oriented Programming
 * Written for use by Wichita State Rocket Club
 * 
 * This class extends GPSpoint to provide functionality 
 * needed for a stationary marker.
*/
public class pointMarker extends GPSpoint implements hasCoordinates{
	//constructor
	public pointMarker (double inLat, double inLong, double inAlt, String inName){
		super(inLat,inLong,inAlt,inName);
		return;
	}
	
	//copy constructor
	public pointMarker(pointMarker copyPoint){
		super(copyPoint.getLat(),copyPoint.getLong(),copyPoint.getAlt(),copyPoint.getName());
		return;
	}
	
	//convert movingPoint
	public pointMarker(movingPoint copyPoint){
		super(copyPoint.getLat(),copyPoint.getLong(),copyPoint.getAlt(),copyPoint.getName());
		return;
	}
	
	//convert GPSpoint
	public pointMarker(GPSpoint copyPoint){
		super(copyPoint);
		return;
	}
	
	//calculations
	//distance
	public double findDistance(hasCoordinates otherPoint){
		double distance;
		distance = (otherPoint.getLat() - this.getLat()) * (otherPoint.getLat() - this.getLat());
		distance += (otherPoint.getLong() - this.getLong()) * (otherPoint.getLong() - this.getLong());
		distance = Math.sqrt(distance);
		return distance;
	}
	
	
	//heading
	//point
	public double findHeading(hasCoordinates otherPoint){
		double yDistance = otherPoint.getLong() - this.getLong();
		double xDistance = otherPoint.getLat() - this.getLat();
		double heading = Math.atan2(xDistance, yDistance);
		heading *= 180 / Math.PI;//convert from radians to degrees
		return heading;
	}
	
}
