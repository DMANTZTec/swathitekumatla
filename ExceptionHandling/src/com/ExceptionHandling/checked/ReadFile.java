package com.ExceptionHandling.checked;
import java.io.*;
public class ReadFile 
{
public static void readFile(String filename)
{
try
{
	FileReader reader=new FileReader(filename);
}
catch(FileNotFoundException e)
{
	System.out.println("file not found");
}
System.out.println("file created now");
}
}
