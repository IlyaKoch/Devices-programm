package com.kochetkov;

public class iPad extends Device {

    private static final String DEVICENAME = "iPad";

    public iPad(String owner, String imei, String color, int weight, String status) {
        super(owner, imei, color, weight, status);
    }

    public void watch(){
        System.out.println("Открываю YouTube");

    }

    public static String getDeviceName() {
        return DEVICENAME;
    }

    @Override
    public String toString() {
        return "_________________________" + '\n' +
                "deviceName= " + DEVICENAME + '\n' +
                "owner= " + owner + '\n' +
                ", imei= " + imei + '\n' +
                ", color= " + color + '\n' +
                ", weight= " + weight + '\n' +
                ", status= " + status + '\n' +
                ", Producing Company= " + PRODUCINGCOMPANY;
    }
}