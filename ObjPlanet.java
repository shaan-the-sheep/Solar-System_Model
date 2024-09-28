public class ObjPlanet extends PointInSpace //planet class extends PointInSpace class
{
	/**
	ObjPlanet class extends PointInSpace class to inherit variables from.
	A move method is created so that the planet objects can move in the universe.
	drawSolarObject is used to pass parameters for the planet objects so they can orbit around the sun.
	
	@param universe to add the object to the 'universe'
	@param distance to get the distance of the object
	@param angle to get the angle of the object
	@param diameter to get the diameter of the object
	@param colour to get the colour of the object
	*/
	
	public ObjPlanet(SolarSystem universe, double distance, double angle, double diameter, String colour)
	{
		super(universe, distance, angle, diameter, colour);
	}
	
	public void move()
	{
		universe.drawSolarObject(distance, angle+=speed, diameter, colour);
	}
}


