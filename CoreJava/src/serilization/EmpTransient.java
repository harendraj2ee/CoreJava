package serilization;
import java.io.*;
class EmpTransient implements Serializable
{
	private String name;
	private transient String job;
	//private int salary;
	private transient int salary; //Make data member as transient so that should not serilize to it.
	public EmpTransient(String n,String j,int s)
	{
		name=n;
		job=j;
		salary=s;
	}
	public void display()
	{
		System.out.println(name+" "+job+" "+salary );
	}
} 