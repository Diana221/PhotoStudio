package com.solvd.photostudio.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;


class MyThread implements Runnable {
    private static final Logger logger = LogManager.getLogger(MyThread.class.getName());
    private final String name;

    public MyThread(String s) {
        name = s;
    }

    public void run() {
        try {
            Date d = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");

            logger.info("Initialization Time for"
                    + " task name - " + name + " = " + ft.format(d));

            logger.info("Executing Time for task name - " +
                    name + " = " + ft.format(d));

            Thread.sleep(1000);

            System.out.println(name + " complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
