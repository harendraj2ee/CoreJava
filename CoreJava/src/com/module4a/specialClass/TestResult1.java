/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/*Result2

Problem Statement

Adding to the previous problem, Modify the class TestResult. 
* Add to it a function betterResult(Result res1, Result res2), which returns the better Result. 
* Better result is defined as the result the higher total marks. 
* If total marks are the same, then it is the one with the higher maximum marks. 
* Note that while calculating total marks, you have to use the method defined in the Result class.
 */
class Result1
{
    int[] marks;
    
    public int maxMarks()
    {
        int max=0;
        for(int i=0; i<marks.length; i++)
        {
            if(max<marks[i])
                max=marks[i];
        }
        return max;
    }
    
    public double avgMarks()
    {
        double avg=0;
        int sum=0;
        if(marks!=null && marks.length!=0)
        {
            for(int i=0; i<marks.length; i++)
            {
                sum+=marks[i];
            }
            avg=sum/marks.length;
        }
        return avg;
    }
    
    public int totalMarks()
    {
        int total=0;
        for(int i=0; i<marks.length; i++)
        {
            total+=marks[i];
        }
        return total;
    }
    
}


public class TestResult1 {
    
    public static void main(String[] args) {
        
        Result1 result1= new Result1();
        result1.marks=new int[]{67,98,92,48,77};
        Result1 result2= new Result1();
        result2.marks= new int[]{65,69,90,87,88};
        
        TestResult1 test= new TestResult1();
        Result1 re=test.betterResult(result1, result2);
        System.out.println("better result="+re.totalMarks());
        
    }
    
   public Result1 betterResult(Result1 res1, Result1 res2)
    {
        if(res1!=null && res2!=null)
        {
            if(res1.totalMarks()>res2.totalMarks())
            {
                return res1;
            }
            else if(res1.totalMarks()<res2.totalMarks())
            {
                return res2;
            }
            else
            {
                return(res1.maxMarks()>res2.maxMarks()?res1:res2);
            }
        }
        else
        {
            if(res1!=null && res2==null)
                return res1;
            else
                return res2;
        }
        
    }
}
