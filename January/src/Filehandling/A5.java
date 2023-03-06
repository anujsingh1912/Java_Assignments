package Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A5 
{
	public void read() throws IOException
	{
		File f1=new File("../January/noted_down_jan_batch_19_Feb.txt");
		File f2=new File("../January/WriteFile.txt");
		FileReader fr=new FileReader(f1);
		FileWriter fw=new FileWriter(f2);
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String s;
		while((s=br.readLine())!=null)
		{
			bw.write(s);
			bw.newLine();
		}
		bw.close();
		br.close();
	}
	public static void main(String[] args) throws IOException 
	{
		A5 obj=new A5();
		obj.read();
	}
}
