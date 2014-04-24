/* 
 * Alex Ferm K887M523
 * Individual project for Object Oriented Programming
 * Also written for use by Wichita State Rocket Club
 * 
 * This class extends GPSpoint to provide functionality 
 * needed for a moving point
*/
public class movingPoint extends pointMarker implements hasCoordinates {
	private int refreshRate;
	private boolean logSwitch = false;
	private boolean refreshSwitch = false;
	
	//constructor
	public movingPoint (double inLat, double inLong, double inAlt, String inName, int inRate){
		super(inLat,inLong,inAlt,inName); 
		refreshRate = inRate;
		return;
	}
	
	//copy constructor
	public movingPoint(movingPoint copyPoint){
		super(copyPoint.getLat(),copyPoint.getLong(),copyPoint.getAlt(),copyPoint.getName());
		this.refreshRate = copyPoint.refreshRate;
		return;
	}
	
	//convert movingPoint
	public movingPoint(pointMarker copyPoint){
		super(copyPoint.getLat(),copyPoint.getLong(),copyPoint.getAlt(),copyPoint.getName());
		return;
	}
	
	//convert GPSpoint
	public movingPoint(GPSpoint copyPoint, int inRate){
		super(copyPoint);
		refreshRate = inRate;
		return;
	}
	
	//getters
	//refresh rate
	public int getRate(){
		return refreshRate;
	}
	//log switch
	public boolean getLSwitch(){
		return logSwitch;
	}
	//refresh switch
	public boolean getRSwitch(){
		return refreshSwitch;
	}
	
	

}
