package com.singleton.hashcode;

public class SingletonTest {
	private static SingletonTest singletonInstance=null;
	private static SingletonTest getSingletonInstance(){
		System.out.println("SingleTon Const");
		if(singletonInstance==null){
			singletonInstance=new SingletonTest();
		}
		return singletonInstance;
	}
	public void singletonMethod(){
		System.out.println("Print here is >>> ");
	}
	
	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++){
			singletonInstance= getSingletonInstance();
			System.out.println(singletonInstance.hashCode());
		}	
	}
	//hashcode value
	@Override
	public int hashCode(){
		final int hash=5;
		int h=0;
		h=hash*4;
		return h;
		
	}

}
