public class ObjSun extends PointInSpace
{
	/**
	ObjPlanet class extends PointInSpace class to inherit variables from.
	
	@param universe to add the object to the 'universe'
	@param distance to get the distance of the object
	@param angle to get the angle of the object
	@param diameter to get the diameter of the object
	@param colour to get the colour of the object
	*/
	
	public ObjSun(SolarSystem universe, double distance, double angle, double diameter, String colour)
	{
		super(universe, distance, angle, diameter, colour);
	}
}