package com.Arrays.Student;

public class Marks 
{
	
  public static void getMarks()
  
  {
	  int[] marks= {80,60,76,66,89};
	  int sum=0;
	  int product=1;
	  double average;
	  
	  for(int i=0;i<marks.length;i++)
	  {
		  sum+=marks[i];
		  product*=marks[i];
		  
	  }
	  average=(double)sum/marks.length;
	  System.out.println("sum="+sum+" "+"product="+product+" "+"average="+average);
  }
}
