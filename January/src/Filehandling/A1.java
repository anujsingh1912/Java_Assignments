package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A1 
{
	public void ReadData(int a) throws IOException
	{
		File f=new File("../January/noted_down_api_jan_batch_19_Feb.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String s;
		int i=0;
		while ((s=br.readLine())!=null) 
		{
			i=i+1;
			if(i==a)
			{
				System.out.println("Text of the partiular row is: ");
				System.out.println(s);
				break;
			}
		}
	}
	public static void main(String[] args) throws IOException 
	{
		A1 obj=new A1();
		obj.ReadData(5);
	}
}
