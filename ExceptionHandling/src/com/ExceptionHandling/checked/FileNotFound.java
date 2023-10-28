package com.ExceptionHandling.checked;
import java.io.*;
public class FileNotFound {

	public static void main(String[] args) 
	{
		String filename="myFile.txt";
		ReadFile.readFile(filename);
	}

}
