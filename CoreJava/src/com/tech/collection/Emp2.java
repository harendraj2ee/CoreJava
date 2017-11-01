package com.tech.collection;

class Emp2 implements Comparable
{
	String name,job;
	int salary;
	public Emp2(String n, String j, int s)
	{
		name=n;
		job=j;
		salary=s;
	}
         public void display()
	{
		System.out.println(name+"\t"+job+"\t"+salary);
	}
        @Override
	public String toString(){
	
		
		return "Name:"+this.name+"Job"+ this.job +"Salary"+ this.salary;
	}

    @Override
    public int compareTo(Object o) {
        
   

     return 1; 
    }

       
        }
    
