public class PointInSpace
{
	/**
	PointInSpace class is used as inheritence for other classes to inherit from.
	There are six variables declared, one for the distance, angle, diameter, speed, colour of the objects in space.
	Then a constructor is created where all the variables get inherited from in other classes.
	*/
	
	double distance, angle, diameter, speed;
	String colour;
	SolarSystem universe;
	
	public PointInSpace(SolarSystem u, double d, double a, double di, String c)
	{
		this.universe = u;
		this.distance = d;
		this.angle = a;
		this.diameter = di;
		this.colour = c;
		this.speed = 100/distance;
    }	
}