package com.tuling.thread;

public class ThreadDemo extends Thread {

    private String name;

    public ThreadDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        //方法级别调用
        //new ThreadDemo("tuling monkey").run();
        //线程级别调用
        new ThreadDemo("tuling monkey").start();

    }
}
