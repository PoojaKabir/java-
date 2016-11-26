
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
 
 public class Unzip
 {             
	public static void main(String a[])
	{	
		FileInputStream fis = null;
        ZipInputStream zipIs = null;
        ZipEntry zEntry = null;
		
        try
		{
            fis = new FileInputStream("D:\\SEM3\\java\\zip\\pooja.zip");
            zipIs = new ZipInputStream(new BufferedInputStream(fis));
			
            while((zEntry = zipIs.getNextEntry()) != null)
			{	
                try
				{	
                    byte[] tmp = new byte[4*1024];
                    FileOutputStream fos = null;
                    String opFilePath = "D:/"+zEntry.getName();
                    System.out.println("Extracting file to "+opFilePath);
                    fos = new FileOutputStream(opFilePath);
                    int size = 0;
                    while((size = zipIs.read(tmp)) != -1)
					{
                        fos.write(tmp, 0 , size);
                    }
                    fos.flush();
                    fos.close();
                } 
				catch(Exception ex)
				{
                }
            }
            zipIs.close();
        }
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
        } 
		catch (IOException e)
		{            
            e.printStackTrace();
        }       
    }
}