package com.demo.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from Thread1");
        System.out.println(Thread.currentThread() + " : " + Thread.currentThread().getState());
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        //0-10
        System.out.println(Thread.currentThread());
        AtomicInteger integer = new AtomicInteger(0);


        Thread t0 = new Thread(() -> {
            while (true){
                System.out.println(Thread.currentThread() + " : " + integer.getAndIncrement());
                if (integer.get() > 10) {
                    return;
                }
            }
        });

        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println(Thread.currentThread() + " : " + integer.getAndIncrement());//1
                if (integer.get() > 10) {
                    return;
                }
            }
        });

        Runnable r = () -> {
            while (true) {
                if (integer.get() <= 20) {
                    System.out.println(Thread.currentThread() + " : " + integer.getAndIncrement());
                } else {
                    return;
                }
            }
        };

        t0.start();
        t1.start();
        r.run();

        System.out.println(t0.getState());
        System.out.println(t1.getState());

//        t2.join();
//        System.out.println(t1.getState());
//        System.out.println(t2.getState());
//
//        ExecutorService service = Executors.newFixedThreadPool(5);
//        integer.set(0);
//        service.submit(r);
//        service.shutdown();
    }
}