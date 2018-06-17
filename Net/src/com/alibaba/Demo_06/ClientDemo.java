package com.alibaba.Demo_06;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.88.235.50", 12345);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while((line = br.readLine()) != null) {
            if(line.equals("bye")) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }
}
