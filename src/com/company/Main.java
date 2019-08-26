package com.company;

public class Main {

    public static void main(String[] args) {
	    EarthPoint point1 = new EarthPoint(46.7474625d,23.6353264d);
        EarthPoint point2 = new EarthPoint(44.41539d,26.0820488d);
        System.out.println(point1.distanceBetwenTwoPoints(point1,point2));
    }
}
