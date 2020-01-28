package com.company;

import sun.rmi.runtime.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
	//Task 1
        Scan scan1 = new Scan("The Three Little Pigs", 5);
        Scan scan2 = new Scan("The Wolf and the Seven Little Goats", 5);

        Thread thread1 = new Thread(scan1, "Scan 1");
        Thread thread2 = new Thread(scan2, "Scan 2");

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }

        System.out.println("Threads Started!!");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
        thread1.start();
        thread2.start();
        System.out.println("Thread " +Thread.currentThread().getName() + " state " + Thread.currentThread().getState());
    }
}
