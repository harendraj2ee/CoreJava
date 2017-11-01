package overridingMethodDemo;


public class ShapOverride {

	public void draw()
	{
		System.out.println("Drawing Shape");
	}
	public static void main(String[] args) {
		ShapOverride s=new Rectangle();
		s.draw();
		
		s=new Circle();
		s.draw();
	}

}
class Rectangle extends ShapOverride
{
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends ShapOverride
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
}
