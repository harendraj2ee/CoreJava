/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package module_2;

/**
 *
 * @author Home
 */
public class ArrayNumCount {
    public static void main(String[] args) {
     
        int[] arr={1, 11, 0, -11, 21};
        
        ArrayNumCount ob= new ArrayNumCount();
        int x=ob.count1S(arr);
        System.out.println(x);
    }
    
    public int count1S(int[] arr1)
    {
        int count=0;
        int len=arr1.length;
        for(int i=0; i<len; i++)
        {
            count=count+count1Num(arr1[i]);
        }
        return count;
    }
    public int count1Num(int num)
    {
        int cunt=0;
        while(num!=0)
        {
            int a=num%10;
            if(a==1)
            {
                cunt++;
            }
            num=num/10;
        }
        return cunt;
    }
    
}
