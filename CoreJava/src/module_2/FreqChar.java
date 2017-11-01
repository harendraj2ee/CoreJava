/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package module_2;

/**
 *
 * @author Home
 */
public class FreqChar {
    public static void main(String[] args) {
        String str="tittitttioa";
         char result=' ';
      int count=0;
      int max=0;
      int i;
      for(i=0; i<str.length(); i++)
      {
          
          String ch=""+str.charAt(i);
          //System.out.println(ch);
          int index=str.indexOf(ch);
          //System.out.println(index);
          while(index!=-1)
          {
              index=str.indexOf(ch, index+1);
              count++;
              
          }
          if(count>=max)
          {
              //System.out.println(max);
          max=count;
          result=str.charAt(i);
          
              //System.out.println(result);
          }
          count=0;
      }
        System.out.println("r:"+result);
    }
    
}
