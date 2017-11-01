package com.tech.collection;
class Emp 
{
	String name,job;
	int salary;
	public Emp(String n, String j, int s)
	{
		name=n;
		job=j;
		salary=s;
	}
	public void display()
	{
		System.out.println(name+"\t"+job+"\t"+salary);
	}
	//To Facilitate searching of Emp Objects in collections
	public boolean equals(Object o)
	{
		Emp e=(Emp)o;
		return this.name.equals(e.name) && this.job.equals(e.job) && this.salary==e.salary;
	}
	
}