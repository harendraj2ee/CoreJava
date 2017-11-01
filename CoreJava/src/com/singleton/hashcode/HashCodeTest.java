package com.singleton.hashcode;

public class HashCodeTest {
	private int id=0;
	
   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
final int price=5;
	public static void main(String[] args) {
		HashCodeTest hct=new HashCodeTest();
		hct.hashCode();
	}
	public int hashCode() {
	     final int result = 17;
	     int hascode=result;
	     hascode = 31 * result ;
	     //result = 31 * result + getQuantity();
	     return result;
	}
}
