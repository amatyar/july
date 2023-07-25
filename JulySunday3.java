package July;
//Abstraction 
public class JulySunday3 
{
	public static void main(String[] args) 
	{
		circle cr = new circle("Blue", 3.54);
		System.out.println(cr.Display());
		Rectangle rt= new Rectangle("Green", 3.5, 2.8);
		System.out.println(rt.Display());
	}

}
abstract class Shape
{
	private String color;
	//abstract method
	abstract double area();
	public abstract String Display();	
	// construction
	public Shape(String cl) 
	{
		System.out.println("calling from abstract constuctor");
		this.color = cl;
	}
	// concrete method
	public String getColor()
	{
		return color;
	}
}
class circle extends Shape
{
	double radius;
	public circle(String cl, double rd) {
		super(cl);
		this.radius = rd;
		System.out.println("calling from circle");
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String Display() {
		
		return "Circle's Colour: "+super.getColor()+" Area is: "+this.area();
	}
	
}
class Rectangle extends Shape
{
	double length, width;
	public Rectangle(String cl,double l, double w) {
		super(cl);
		System.out.println("calling from Rectange");
		this.length = l;
		this.width = w;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public String Display() {
		
		return "area is :" +this.area() + " Color of Rectangel:"+super.getColor();
	}
	
}