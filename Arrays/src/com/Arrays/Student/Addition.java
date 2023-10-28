package com.Arrays.Student;

public class Addition 
{
	 int num[][]= {{1,2,3},{4,5,6},{2,3,4}};
		int num1[][]= {{9,6,5},{3,4,5},{2,9,4}};
		int sum[][]=new int[3][3];
public void printAddition()
{
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			sum[i][j]=num[i][j]+num1[i][j];
			System.out.print(sum[i][j]+" ");
		}
System.out.println();
	}
}
}
