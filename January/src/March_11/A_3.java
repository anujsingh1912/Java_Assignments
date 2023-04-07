package March_11;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class A_3 
{
	public void ReadDataBasedUponRange() throws BiffException, IOException
	{
		File f=new File("../January/XLS_JXL.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet(0);
		int row=s.getRows();
		int column=s.getColumns();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				Cell c=s.getCell(j, i);
				System.out.println(c.getContents());
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException 
	{
		A_3 ob=new A_3();
		ob.ReadDataBasedUponRange();
	}
}
