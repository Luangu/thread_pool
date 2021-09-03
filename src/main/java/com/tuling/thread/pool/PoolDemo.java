package com.tuling.thread.pool;
import java.util.concurrent.*;

public class PoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.newCachedThreadPool();//快
        ExecutorService executorService2 = Executors.newFixedThreadPool(10);//慢
        ExecutorService executorService3 = Executors.newSingleThreadExecutor();//最慢

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,
                20,
                0L,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(10));
        //模拟3个外包公司接项目，看哪个公司先干完
        for (int i = 1; i < 100; i++) {
            threadPoolExecutor.execute(new MyTask(i));
        }
    }
}

