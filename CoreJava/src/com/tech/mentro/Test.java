package com.tech.mentro;
class Common
{
	int l,b;	//Data Member
	public Common(int x,int y)
	{
		l=x;
		b=y;
	}
	public void display()
	{
		System.out.println("Length = "+l);
		System.out.println("Breadth = "+b);
	}
}
class Rectangle extends Common
{
	public Rectangle(int x,int y)
	{
		super(x,y);
	}
	//Additional Behaviour
	public int area()
	{
		return l*b;
	}
	public int perimeter()
	{
		return 2*(l+b);
	}
}
class Cuboid extends Common
{
	//Additional attribute
	int h;
	public Cuboid(int x,int y,int z)
	{
		super(x,y);
		h=z;
	}
	//Additional Behaviour
	public void display()
	{
		super.display();
		System.out.println("Height = "+h);
	}
	public int volume()
	{
		return l*b*h;
	}
}
class Test
{
	public static void main(String arr[])
	{
		Rectangle r=new Rectangle(5,6);
		Cuboid c=new Cuboid(2,3,10);
		
		System.out.println("Dimension of Rectangle :");
		r.display();
		System.out.println("Area of Rectangle is : " +r.area());
		System.out.println("Perimeter of Rectangle is : "+r.perimeter());
		
		System.out.println("Dimension of Cuboid :");
		c.display();
		System.out.println("Volume of Cuboid is : "+c.volume());
	}
}