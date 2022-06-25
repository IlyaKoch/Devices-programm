package com.kochetkov;

public class iPhone extends Device {

    private static final String DEVICENAME = "iPhone";

    public iPhone(String owner, String imei, String color, int weight, String status) {
        super(owner, imei, color, weight, status);
    }

    public void call(){
        System.out.println("Звоню контакту");

    }

    public static String getDeviceName() {
        return DEVICENAME;
    }

    @Override
    public String toString() {
        return "_________________________" + '\n' +
                "deviceName= " + DEVICENAME + '\n' +
                ", owner= " + owner + '\n' +
                ", imei= " + imei + '\n' +
                ", color= " + color + '\n' +
                ", weight= " + weight + '\n' +
                ", status= " + status + '\n' +
                ", Producing Company= " + PRODUCINGCOMPANY;
    }
}