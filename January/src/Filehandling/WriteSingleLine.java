package Filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteSingleLine 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../January/noted_down_jan_batch_19_Feb.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Welcome!!");
		bw.close();
	}
}
