package com.alibaba.Demo_01;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest{
    public static void main(String[] args) {
        Timer t = new Timer();

        String dd = "2018-06-15 09:31:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = null;
        try {
            d = sdf.parse(dd);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        t.schedule(new MyTask(), d);
    }
}

class MyTask extends TimerTask {
    @Override
    public void run() {
        File f = new File("src/com/alibaba/Demo_01/bbb");
        deleteFolder(f);
    }

    public void deleteFolder(File f) {
        System.out.println(f);
        File[] fs = f.listFiles();
        System.out.println(fs);
        if(fs != null) {
            for(File ff : fs) {
                if(ff.isDirectory()) {
                    deleteFolder(ff);
                } else {
                    ff.delete();
                    System.out.println("name:" + ff.getName());
                }
            }
        }

        f.delete();
        System.out.println("name:" + f.getName());
    }
}


