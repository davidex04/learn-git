import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Counter {
    private int count = 0;
    //მასჰაა

    // synchronized ensures only one thread updates at a time
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterThread implements Runnable {
    private Counter counter;
    private String name;

    public CounterThread(Counter counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            System.out.println(name + " incremented count to: " + counter.getCount());
            try {
                Thread.sleep(100); // simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(new CounterThread(counter, "Thread-1"));
        Thread t2 = new Thread(new CounterThread(counter, "Thread-2"));
        Thread t3 = new Thread(new CounterThread(counter, "Thread-3"));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
