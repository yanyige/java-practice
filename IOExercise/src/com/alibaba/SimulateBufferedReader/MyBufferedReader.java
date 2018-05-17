package com.alibaba.SimulateBufferedReader;

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {
	
	private Reader r;
	private int lineNumber = 0;
	
	MyBufferedReader(Reader r) {
		this.r = r;
	}
	
	public String readLine() throws IOException {
		
		int n = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(lineNumber + ":");
		while((n = r.read()) != -1) {
			if(n == '\r') {
				lineNumber ++;
				continue;
			}
			if(n == '\n') {
				return lineNumber + ":" + sb.toString();
			} else {
				sb.append((char) n);
			}
		}
		if(sb.length() > 2) {
			return sb.toString();
		}
		return null;
	}
	
	public void close() throws IOException {
		this.r.close();
	}
	
}
