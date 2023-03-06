package Filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Appending 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../January/noted_down_jan_batch_19_Feb.txt");
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("this is third line");
		bw.newLine();
		bw.write("This is forth line");
		bw.close();
	}
}
