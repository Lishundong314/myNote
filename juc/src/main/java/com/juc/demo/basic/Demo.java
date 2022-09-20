package com.juc.demo.basic;

import java.util.function.BiFunction;

public class Demo {

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
    }
}
class MyThread extends Thread{

}