package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

package javafoundation.online_sem_2;

public class MyClassThread extends Thread {
    @Override
    public void run() {
        System.out.println("Поток " + getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            MyClassThread thread = new MyClassThread();
            thread.start();
        }
    }
}
