package Filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../January/noted_down_api_jan_batch_19_Feb.txt");
		FileReader fr= new FileReader(f);
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.println((char) a);
		}
	}
}
