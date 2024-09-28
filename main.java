import java.util.*;

public class theUniverse
{
	/**
	SolarSystem class creates new object called universe with variables that are dimensions of the program.
	
	The ObjSun class creates a new sun object and gives it variables, one to be placed in the universe, one for the distance,
	one for the angle, diameter and one for the colour.
	
	Each planet object is created using the ObjPlanet class and has variables, one to be placed in the universe,
	one for the distance, angle, diameter and colour.
	
	Moon class creates new moon object to represent the earths moon with its variables and two extra variables for the planet that it orbits around.
	
	The ObjMoon class then creates an array that stores 2 moon objects to represent mars' moons.
	Then a for loop is used to create the moon objects.	Each object is created through the mars moon object array with its respected variables, one for 
	different distances on each moon, angle, diameter, colour, one to get the distance of mars and oen to get the angle of mars.
	
	Jupiters moons are created the same was as mars' moons.
	
	Moon class creates an array that stores 400 moon objects to represent the asteroid belt. 
	A for loop is used to create the moon objects for the asteroid belt.
	Min and max integers to define the minimum distance and max distance from the sun for random number generator.
	Random class creates new random object.
	Integer rNum has the random integers from the max and minimum distance integers.
	Each object is created through the asteroid moon objects array with variables.
	The random number variable randomises the distance of moons from 275 and 305 And the angle variable as i so that the asteroid belt has moons going all around the sun.
	
	While loop to add the objects to the universe to make the move. 
	Inside the while loop drawSolarObject is used to draw the sun in the center of the universe with its variables.
	Each planet gets the move method that makes them orbit around the sun.
	
	Earth moon gets the move method with two extra variables so that it can orbit around the earth.
	A for loop is used to create 2 moons for mars from the array and then Mars moon gets the move method and two variables to orbit mars.
	Same thing happens for jupiter and the asteroid belt.
	
	Universe finishes drawing.	
	*/
	
	public static void main(String[] args)
	{
		SolarSystem universe = new SolarSystem(1050, 1050); 
		
		ObjSun sun = new ObjSun(universe, 0, 0, 70, "YELLOW"); 
		
		ObjPlanet merc = new ObjPlanet(universe, 60, 50, 9.6, "DARKGREY");	
		ObjPlanet venus = new ObjPlanet(universe, 90, 50, 24.2, "ORANGE");
		ObjPlanet earth = new ObjPlanet(universe, 140, 50, 25.4, "BLUE"); 
		ObjPlanet mars = new ObjPlanet(universe, 216, 50, 13.4, "RED");
		ObjPlanet jup = new ObjPlanet(universe, 420, 50, 30, "LIGHTGREY");
		
		ObjMoon eMoon = new ObjMoon(universe, 22, 50, 4.2, "LIGHTGREY", earth.distance, earth.angle); 
			
		ObjMoon[] mMoon = new ObjMoon[3]; 
		for(int i=0; i<3; i++) 
		{
			mMoon[i] = new ObjMoon(universe, (i*22), 50, 4, "LIGHTGREY", mars.distance, mars.angle); 
		}																						  
																			
		ObjMoon[] jMoon = new ObjMoon[5]; 
		for(int i = 0; i<5; i++)
		{
			jMoon[i] = new ObjMoon(universe, (i*22), 50, 4, "LIGHTGREY", jup.distance, jup.angle);
		}
		
		ObjMoon[] aBelt = new ObjMoon[400]; 
		for(int i = 0; i<400; i++) 
		{
			int minDis = 275; int maxDis = 305; 
			Random rand = new Random(); 
			int rNum = rand.nextInt(maxDis - minDis +10) + minDis; 
			aBelt[i] = new ObjMoon(universe, rNum, i, 4, "LIGHTGREY", sun.distance, sun.angle); 
		}																					
			
		while(true) 
		{
			universe.drawSolarObject(0, 0, 70, "YELLOW");
			merc.move();
			venus.move();
			earth.move();
			mars.move();
			jup.move();
			
			eMoon.move(earth.distance, earth.angle);
			
			for(int j=0; j<3; j++)
			{
				mMoon[j].move(mars.distance, mars.angle);
			}
			
			for(int j=0; j<5;j++)
			{
				jMoon[j].move(jup.distance, jup.angle); 
			}
			
			for(int j=0; j<400;j++)
			{
				aBelt[j].move(sun.distance, sun.angle);
			}
			
		universe.finishedDrawing();
		} 
	}
}