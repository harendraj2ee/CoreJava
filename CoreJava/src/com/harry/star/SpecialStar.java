/*how to print n number of stars without using loop or condition [duplicate]

sol: Essentially you are creating a new string using a new char array with [n] indexes. When you create a new array 
without specifying values, default values are given. The default char is '\0' (the null character). So, by using replace()
 on the created string you can replace all instances of that character (the number of which you have already specified)
  with whatever char/String you like.
  */

package com.harry.star;

public class SpecialStar {
	public static void main(String args[]){
		withOutLoop();
	}
	public static void withOutLoop(){
		System.out.println(new String(new char[5]).replace("\0", "*"));
		System.out.println(new String(new char[4]).replace("\0", "*"));
		System.out.println(new String(new char[3]).replace("\0", "*"));
		System.out.println(new String(new char[2]).replace("\0", "*"));
		System.out.println(new String(new char[1]).replace("\0", "*"));
		System.out.println(new String(new char[1]).replace("\0", "*"));
		System.out.println(new String(new char[2]).replace("\0", "*"));
		System.out.println(new String(new char[3]).replace("\0", "*"));
		System.out.println(new String(new char[4]).replace("\0", "*"));
		System.out.println(new String(new char[5]).replace("\0", "*"));
		
		//System.out.println(new String(new char[5]).replace("\\s", "*"));
		

	}

}
