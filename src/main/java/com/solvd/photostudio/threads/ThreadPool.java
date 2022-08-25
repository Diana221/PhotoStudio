package com.solvd.photostudio.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPool
{
    // Maximum number of threads in thread pool
    static final int MAX_T = 2;

    public static void main(String[] args)
    {
        Runnable r1 = new MyThread("task 1");
        Runnable r2 = new MyThread("task 2");

        // creates a thread pool
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        pool.execute(r1);
        pool.execute(r2);

        pool.shutdown();
    }
}