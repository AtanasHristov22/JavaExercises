package com.company;

public class Scan implements Runnable {
    private String documentName;
    private int numberOfTimesToScan;

    public Scan(String documentName, int numberOfTimesToScan){
        this.documentName = documentName;
        this.numberOfTimesToScan = numberOfTimesToScan;
    }

    @Override
    public void run() {
        for (int i = 1; i <= numberOfTimesToScan; i++){
            System.out.println(Thread.currentThread().getName() + ": " + "priority: " + Thread.currentThread().getPriority() + " "
                    + documentName + " scanned"  + i + " number of times." );

        }
    }
}
