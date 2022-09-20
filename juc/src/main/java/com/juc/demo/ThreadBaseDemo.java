package com.juc.demo;

import com.sun.xml.internal.ws.util.CompletedFuture;

import java.util.concurrent.*;

public class ThreadBaseDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(()->{
            System.out.println(Thread.currentThread().getName());
            try {TimeUnit.SECONDS.sleep(1);} catch (InterruptedException e) {throw new RuntimeException(e);}
            return 123;
        },threadPool);
        System.out.println(completableFuture.get());
    }
}
