package March_11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class A_4 
{
	public void WriteData() throws IOException, RowsExceededException, WriteException
	{
		File f=new File("../January/XLS2_JXL.xls");
		WritableWorkbook ww=Workbook.createWorkbook(f);
		WritableSheet ws=ww.createSheet("JAVA", 0);
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				Scanner s=new Scanner(System.in);
				String s1=s.next();
				Label L=new Label(j, i, s1);
				ws.addCell(L);
			}
		}
		ww.write();
		ww.close();
	}
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException 
	{
		A_4 ob=new A_4();
		System.out.println("Add your data: "+s1);
		ob.WriteData();
	}
}
