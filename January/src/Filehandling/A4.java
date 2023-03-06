package Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A4 
{
	public void WriteDataInarange(int init, int end) throws IOException
	{
		File f=new File("../January/noted_down_jan_batch_19_Feb.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		Scanner scan=new Scanner(System.in);
		System.out.println("Type your data between the mentioned range: ");
		String s;
		for(int i=1;i<=end;i++)
		{
			if((i>=init)&&(i<=end))
			{
				s=scan.next();
				bw.write(s);
				bw.newLine();
			}
			else
			{
				bw.newLine();
			}
		}
		bw.close();
	}
	public static void main(String[] args) throws IOException 
	{
		A4 obj=new A4();
		obj.WriteDataInarange(5, 10);
	}
}
