
class Planet{
	String name; 
	double surface_area;
	int axial_tilt;
	double rotating_speed;
	double dist_frm_sun;
    double orbital_speed; 
	double surface_gravity ;
	double i;
	Planet()
	{ 
	name = "Jupiter";
	surface_area = 61.42;
	axial_tilt =  3;
	}
	Planet(double x, double y)
	{
	this(28000);
	this.dist_frm_sun = x;
    this.orbital_speed = y;
	}
	Planet(int z)
	{
		this.rotating_speed=z;
		System.out.println("  Rotating speed = "+rotating_speed+" miles per hour");
	}
	double Planet(double i)
	{
		this.surface_gravity=i;
		return surface_gravity;
	}
	void display()
	{
		System.out.println("  Planet name = "+name + " \n " +" Surface Area = " +surface_area +" billion km2"+" \n "+" Axial Tilt = "+axial_tilt +" degrees");
	}
	void show()
	{
		System.out.println("  Distance from sun = "+dist_frm_sun+" million km" +"\n"+"  Orbital speed = "+orbital_speed+" km/s");
	}
	public static void main(String args[])
	{
		Planet P1 = new Planet();
		P1.display();
		Planet P2 = new Planet(750.76,13.72);
		P2.show();
		double j = P1.Planet(24.79);
		System.out.println("  Surface gravity = "+j+"m/s2");
	}
}
		
		