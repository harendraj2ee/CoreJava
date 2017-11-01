/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;


/*Problem Statement

Adding to the previous problem, Modify the class TestResult. 
* Add to it a function bestResult(Result[] results), which returns the best Result. 
* The best result is defined as the result with the highest average marks. 
* Note that while calculating average marks, you have to use the method defined in the Result class. 
* Also, you can assume that no two results have the same average marks.
 */
class Result2
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


public class TestResult2 {
    public static void main(String[] args) {
        TestResult2 test=new TestResult2();
        Result2 result1= new Result2();
        result1.marks=new int[]{67,98,92,48,77};
        Result2 result2= new Result2();
        result2.marks= new int[]{65,69,90,87,88};
        Result2[] result3= new Result2[2];
        result3[0].marks=result1.marks;
        result3[0].marks=result2.marks;
        /*Result2[] result1= new Result2[4];
        result1[0].marks= new int[4];
        int[] m1={34,76,77,88};
        for(int i=0;i<4;i++)
        {
            result1[0].marks[i]=m1[i];
        }
        result1[1].marks=new int[4];
        int[] m2={34,76,77,88};
        for(int i=0;i<4;i++)
        {
            result1[1].marks[i]=m2[i];
        }
        result1[2].marks=new int[4];
        int[] m3={34,76,77,88};
        for(int i=0;i<4;i++)
        {
            result1[2].marks[i]=m3[i];
        }
        
        int[] m4={34,76,77,88};
        result1[3].marks=new int[4];
        for(int i=0;i<4;i++)
        {
            result1[3].marks[i]=m4[i];
        }*/
        
        
        Result2 r=test.bestResult(result3) ;
        System.out.println(r.avgMarks());
        
       
    }
    public Result2 bestResult(Result2[] result)
    {
        Result2 res=null;
        double maxAvg=0;
        if(result!=null && result.length!=0)
        {
            res=result[0];
            maxAvg=res.avgMarks();
            for(int i=1; i<result.length; i++)
            {
                if(result[i].avgMarks()>maxAvg)
                {
                    res=result[i];
                    maxAvg=result[i].avgMarks();
                }
            }
        }
        return res;
    }
    
}
