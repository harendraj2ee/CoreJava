/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package module_2;

/**
 *
 * @author Home
 */
     public class Student {
		String fName,lName;
		Student(String s){
			this(s.substring(0, s.indexOf(" ")),s.substring(s.indexOf(" ")+1));
                        System.out.println(fName+" "+lName);
		}
		public Student(String s1,String s2) {
			fName=s1;lName=s2;
		}
		public static void main(String[] args) {
			Student stud=new Student("Jennifer Lopez");
		}
	}