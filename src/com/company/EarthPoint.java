package com.company;

public class EarthPoint {
    double latitudeCoordinate;
    double longitudeCoordinate;
    final double radiusOfTheEarth = 6371.01;
    public EarthPoint(){
        latitudeCoordinate=0.0d;
        longitudeCoordinate=0.0d;
    }

    public double getLatitudeCoordinate() {
        return Math.toRadians(latitudeCoordinate);
    }

    public double getLongitudeCoordinate() {
        return Math.toRadians(longitudeCoordinate);
    }

    public void setLatitudeCoordinate(double latitudeCoordinate) {
        this.latitudeCoordinate = latitudeCoordinate;
    }

    public void setLongitudeCoordinate(double longitudeCoordinate) {
        this.longitudeCoordinate = longitudeCoordinate;
    }

    public EarthPoint(double latitudeCoordinate, double longitudeCoordinate){
        this.latitudeCoordinate = latitudeCoordinate;
        this.longitudeCoordinate = longitudeCoordinate;
    }
    public double distanceBetwenTwoPoints(EarthPoint point1, EarthPoint point2){
        double arcCos = Math.acos((Math.sin(point1.getLatitudeCoordinate())*Math.sin(point2.getLatitudeCoordinate())) + (Math.cos(point1.getLatitudeCoordinate())*Math.cos(point2.getLatitudeCoordinate())*Math.cos(point1.getLongitudeCoordinate()-point2.getLongitudeCoordinate())));
        return radiusOfTheEarth * arcCos;
    }



}
