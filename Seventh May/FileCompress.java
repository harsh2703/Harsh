package com.c2.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileCompress {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String sourceFile = "D:/movie1.mp4";

		  // compressed file name
		  FileOutputStream fos = new FileOutputStream("D:/movie1.zip");

		  System.out.println("File compression started.");
		  // output zip file stream.
		  ZipOutputStream zipOut = new ZipOutputStream(fos);
		  File fileToZip = new File(sourceFile);
		  FileInputStream fis = new FileInputStream(fileToZip);

		  // Creating zip file name.
		  ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
		  zipOut.putNextEntry(zipEntry);

		  byte[] bytes = new byte[1024];
		  int length;

		  // writing content into zip or archieve file.
		  while ((length = fis.read(bytes)) >= 0) {
		   zipOut.write(bytes, 0, length);
		  }
		  zipOut.close();
		  fis.close();
		  fos.close();
		  System.out.println("Done");
	}

}
