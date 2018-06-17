package com.alibaba.Demo_07;

import java.io.*;
import java.net.Socket;

public class UploadClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.88.235.50", 12345);
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        s.close();
    }
}
