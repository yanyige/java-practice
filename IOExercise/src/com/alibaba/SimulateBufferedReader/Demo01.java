package com.alibaba.SimulateBufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] Args) throws IOException {
		MyBufferedReader mbr = new MyBufferedReader(new FileReader("a.txt"));
		String str = null;
		while((str = mbr.readLine()) != null) {
			System.out.println(str);
		}
		mbr.close();
	}
}
