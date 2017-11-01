
package module_2;


public class CountCharInString {
    public static void main(String[] args) {
        String word="Hello World";
        int len=word.length();
        char ch='l';
	    //char[] charA= new char[len];
	    int count1=0;
	    for(int i=0; i<len; i++)
	    {
	        if(word.charAt(i)==ch)
	        count1++;
	    }
	       System.out.println(count1);
    }
    
}
