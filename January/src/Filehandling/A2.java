package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A2 
{
	public void ReadDataOfRange(int init, int end) throws IOException
	{
		File f=new File("../January/noted_down_api_jan_batch_19_Feb.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;
		int i=0;
		while ((s=br.readLine())!=null)
		{
			i=i+1;
			if((i>=init)&&(i<=end))
			{
				System.out.println("Your Text in the given Range is: " +s);
			}
		}
	}
	public static void main(String[] args) throws IOException 
	{
		A2 obj=new A2();
		obj.ReadDataOfRange(5, 9);
/*		Scanner s=new Scanner(System.in);
		System.out.println("Enter initial row number: ");
		init=s.nextInt();
		System.out.println("Enter ending row number: ");
		ends.nextInt();
*/	}
}
