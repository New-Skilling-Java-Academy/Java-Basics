package com.dtag.prestudies.week1;

public class Cylinder {

    public static void main(String[] args) {

        // TODO: ask the user for input later
        int circumference = 32;
        int height = 10;


        double diameter = circumference / Math.PI;
        double areaLid = Math.PI * (diameter / 2) * (diameter / 2);
        double areaCasing = circumference * height;
        double areaTotal = 2 * areaLid + areaCasing;

        System.out.println(areaLid);
        System.out.println(areaTotal);
    }

}
