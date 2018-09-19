package com.alibaba.MultiDown;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

class DownThread extends Thread {

    //定义字节数组的长度
    private final int BUFF_LEN = 32;
    //定义下载的起始点
    private long start;
    //定义下载的结束点
    private long end;
    //下载资源对应的输入流
    private InputStream is;
    //下载到的资源输出到raf中
    private RandomAccessFile raf;

    public DownThread(long start, long end, InputStream is, RandomAccessFile raf) {
        System.out.println(start + " -------> " + end);
        this.start = start;
        this.end = end;
        this.is = is;
        this.raf = raf;
    }

    @Override
    public void run() {
        try {
            is.skip(start);
            raf.seek(start);
            // 定义读取输入流的缓冲数组
            byte[] buff = new byte[BUFF_LEN];
            // 本线程负责下载资源的大小
            long contentLen = end - start;
            // 定义最多需要读取几次就可以完成本线程的下载
            long times = contentLen / BUFF_LEN + 4;
            // 实际读取的字节数
            int hasRead = 0;

            for(int i = 0; i < times; i ++) {
                hasRead = is.read(buff);
                if(hasRead < 0) {
                    break;
                }
                raf.write(buff, 0, hasRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(is != null) {
                    is.close();
                }
                if(raf != null) {
                    raf.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiDown {
    public static void main(String[] args) {
        final int DOWN_THREAD_NUM = 4;
        final String OUT_FILE_NAME = "down.jpg";
        InputStream[] isArr = new InputStream[DOWN_THREAD_NUM];
        RandomAccessFile[] outArr = new RandomAccessFile[DOWN_THREAD_NUM];
        try{
            //创建一个URL对象
            URL url = new URL("http://images.china-pub.com/" + "ebook35001-40000/35850/shupi.jpg");
            //以此URL对象打开第一个输入流
            isArr[0] = url.openStream();
            long fileLen = getFileLength(url);
            System.out.println("网络资源的大小" + fileLen);
            //以输出文件名创建第一个RandomAccessFile输出流
            outArr[0] = new RandomAccessFile(OUT_FILE_NAME, "rw");
            //创建一个与下载资源相同大小的空文件
            for(int i = 0; i < fileLen; i ++) {
                outArr[0].write(0);
            }
            //每个线程应该下载的字节数
            long numPerThread = fileLen / DOWN_THREAD_NUM;
            //整个下载资源除剩下的余数
            long left = fileLen % DOWN_THREAD_NUM;
            for(int i = 0; i < DOWN_THREAD_NUM; i ++) {
                //为每一个线程打开一个输入流、一个RandomAccessFile对象
                //让每个线程下载资源的不同部分
                if(i != 0) {
                    //以URL打开多个输入流
                    isArr[i] = url.openStream();
                    //以指定输出文件创建多个RandomAccessFile对象
                    outArr[i] = new RandomAccessFile(OUT_FILE_NAME, "rw");
                }
                if(i == DOWN_THREAD_NUM - 1) {
                    //最后一个线程下载指定的numPerThread+left个字节
                    new DownThread(i * numPerThread, (i + 1) * numPerThread + left, isArr[i], outArr[i]).start();
                } else {
                    //每个线程负责下载一定的numPerThread个字节
                    new DownThread(i * numPerThread, (i + 1) * numPerThread, isArr[i], outArr[i]).start();
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static long getFileLength(URL url) throws IOException {
        long length = 0;
        //打开该Url对应的URL Connection
        URLConnection con = url.openConnection();
        //获取链接URL资源的长度
        long size = con.getContentLength();
        length = size;
        return length;
    }
}
