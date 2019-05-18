package com.yura.pav;

public class Ships implements Runnable {
    private int freight;
    private String laynerName;

    public Ships(int freight, String laynerName) {
        super();
        this.freight = freight;
        this.laynerName = laynerName;
    }

    public Ships() {
        super();
    }

    public int getFreight() {
        return freight;
    }

    public void setFreight(int freight) {
        this.freight = freight;
    }

    public String getLaynerName() {
        return laynerName;
    }

    public void setLaynerName(String laynerName) {
        this.laynerName = laynerName;
    }

    @Override
    public void run() {

        System.out.println("Thread " + laynerName + " is starting");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "Ships{" +
                "freight=" + freight +
                ", port='" + laynerName + '\'' +
                '}';
    }
}
