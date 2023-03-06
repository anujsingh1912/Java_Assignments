package Filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A3 
{
	public void writeData(int a) throws IOException
	{
		File f=new File("../January/noted_down_jan_batch_19_Feb.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your data till mentioned row: ");
		String s;
		for(int i=1;i<=a;i++)
		{
			s=scan.next();
			bw.write(s);
			bw.newLine();
		}
		bw.close();
	}
	public static void main(String[] args) throws IOException 
	{
		A3 obj=new A3();
		obj.writeData(5);
	}
}
