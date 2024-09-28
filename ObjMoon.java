public class ObjMoon extends PointInSpace
{	
	/**
	ObjMoon class extends PointInSpace class to inherit variables from.
	A move method is created with two extra variables so the moon objects can get the distance and angle of what they orbit around.
	drawSolarObjectAbout is used to pass parameters for the moon objects so they can orbit around their planets.
	
	@param universe to add the object to the 'universe'
	@param distance to get the distance of the object
	@param angle to get the angle of the object
	@param diameter to get the diameter of the object
	@param colour to get the colour of the object
	@param centreOfRotationDistance to get the distance of the object the moon will orbit around
	@param centreOfRotationAngle to get the angle of the object the moon will orbit around
	*/
	
	public ObjMoon(SolarSystem universe, double distance, double angle, double diameter, String colour, double centreOfRotationDistance, double centreOfRotationAngle) 
	{																																								
		super(universe, distance, angle, diameter, colour); 
	}
	
	public void move(double centreOfRotationDistance, double centreOfRotationAngle)
	{
		universe.drawSolarObjectAbout(distance, angle+=speed, diameter, colour, centreOfRotationDistance, centreOfRotationAngle); 
	}																															 
}
