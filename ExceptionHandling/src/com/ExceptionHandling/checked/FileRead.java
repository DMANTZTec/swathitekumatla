package com.ExceptionHandling.checked;
import java.io.*;
public class FileRead 
{
void getFile() throws IOException
{
	throw new IOException("error in device");
}
void readFile() throws IOException
{
	getFile();
}
	public void writeFile()
	{
		try
		{
			readFile();
		}
		catch(Exception e)
		{
			System.out.println("handled exception");
		}
	}
}

