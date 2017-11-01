/*
 To Write a program a Character search 
 */
package harendra;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CharacterSearch 
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter  String : ");
        String data = reader.readLine();
       // int x=System.in.read();
        //System.out.println(x);
        System.out.println("Enter Character : ");
        char ch=(char)System.in.read();
        int noOfTimesChWasFound=0;
        for(int i=0;i<data.length(); i++)
        {
            char c=data.charAt(i);
            if(c==ch)
            {
                noOfTimesChWasFound++;
            }
        }
        System.out.println(noOfTimesChWasFound);
    }
    
}
