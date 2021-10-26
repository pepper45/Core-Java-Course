package com.demo;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");
        System.out.println("Done!!!");
    }
}


//System.out.println(Stream.builder()
//        .add(Collections.emptyList())
//        .add("1")
//        .build()
//        .collect(Collectors.toList()));
//        abc a = new abc() {
//@Override
//public int add(int a, int b) {
//        return a+b;
//        }
//        };
//
//final abc x = (a1,b1) -> {return a1+b1+50;};
//final Object y = new Object();
//        Object yy = y;
//        yy = new Object();
//        System.out.println(x.add(5,7));
//        System.out.println(a.add(5,7));
//interface abc{
//    int add(int a,int b);
//}
//
//class Demo {
//
//    Integer i = 0;
//    Thread t1 = new Thread(() -> {
//        synchronized (i) {
//            while (i < 10) {
//                try {
//                    if (i % 2 == 0)
//                        i.wait();
//                    else {
//                        System.out.println("Job done by t-1 : " + ++i);
//                        i.notify();
//                    }
//                } catch (InterruptedException e) {
//                    System.out.println("GG");
//                    e.printStackTrace();
//                }
//                System.out.println("Received!!");
//            }
//        }
//    });
//
//    Thread t2 = new Thread(() -> {
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        synchronized (i) {
//            if (i < 10) {
//                try {
//                    if (i % 2 != 0)
//                        i.wait();
//                    else {
//                        System.out.println("Job done by t-2 : " + ++i);
//                        i.notify();
//                    }
//                } catch (InterruptedException e) {
//                    System.out.println("WP");
//                    e.printStackTrace();
//                }
//            }
//        }
//    });
//
//    public void k() throws InterruptedException {
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//    }
//}
