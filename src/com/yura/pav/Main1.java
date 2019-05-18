package com.yura.pav;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            exec.execute(new Ships(3, "Victoria"));
            exec.execute(new Ships(3, "Laynara"));
            exec.execute(new Ships(3, "Kruisna"));
        }
        System.out.println();

    }
}
