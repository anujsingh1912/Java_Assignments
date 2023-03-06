package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading_LinebyLine 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../January/noted_down_api_jan_batch_19_Feb.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
	}
}
