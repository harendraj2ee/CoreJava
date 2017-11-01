package com.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	static int count=0;
	public static void main(String args[]){
		regexFirst();
	}
	public static void regexFirst(){
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abcdefkbcabd");
		while(m.find()){
			count++;
			System.out.println("start is : "+m.start()+", end is : "+m.end()+", group is : "+m.group());
		}
		System.out.println("count is : >> "+count);
	}
}
