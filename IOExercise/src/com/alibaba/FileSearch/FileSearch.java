package com.alibaba.FileSearch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSearch{
	
	public static void main(String[] Args) throws IOException{
		String url = "E:\\";
		File Desturl = new File("E:\\jpgs");
		if(!Desturl.exists()) {
			Desturl.mkdirs();
		}
		TravelFolders(new File(url), 0);
		
	}
	
	public static void TravelFolders(File file, int dep)  throws IOException{

		File[] fl = file.listFiles();
		
		if(fl != null) {
			for(File ff : fl) {			
				if(ff.isDirectory()) {
					int nDep = dep + 1;
					TravelFolders(new File(file, ff.getName()), nDep);
				} else {
					String FileName = ff.getName();
					if(FileName.endsWith("jpg")) {
						CopyFile(ff, new File("E:\\jpgs", ff.getName()));
					}
				}
			}
		}
	}
	
	public static void CopyFile(File srcFile, File DestFile) throws IOException{
		FileInputStream fis = new FileInputStream(srcFile);
		
		FileOutputStream fos = new FileOutputStream(DestFile);
		
		byte[] b = new byte[1024];
		
		int n = 0;
		while((n = fis.read(b)) != -1) {
			fos.write(b, 0, n);
		}
		
		fis.close();
		fos.close();
	}
}
