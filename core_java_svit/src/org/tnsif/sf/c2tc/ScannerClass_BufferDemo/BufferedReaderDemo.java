package org.tnsif.sf.c2tc.ScannerClass_BufferDemo;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class BufferedReaderDemo {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Admin\\Downloads\\niha folder\\demo.txt"));
		String data ="";
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
      br.close();
	}

}
