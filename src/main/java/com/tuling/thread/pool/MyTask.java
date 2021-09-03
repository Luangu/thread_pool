package com.tuling.thread.pool;

public class MyTask implements Runnable {
    int i = 0;


    public MyTask(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "做第 " + i + " 项目");
        try {
            //业务逻辑，休眠时间，访问数据库啥的 3秒 L
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
