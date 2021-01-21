package main.singleton;


import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println(A.getInstance().hashCode()));
        Thread thread1 = new Thread(() -> System.out.println(A.getInstance().hashCode()));
        thread.start();
        thread1.start();
    }
}