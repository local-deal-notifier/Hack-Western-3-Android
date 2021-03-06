package com.example.jason.localdealsnotifier;

/**
 * Created by tim on 15/10/16.
 */

public class Promotion {
    //name and address string
    private String company;
    private String message;
    private double distance;

    public Promotion () {
        //Empty Constructor
    }


    public Promotion(String company, String message, double distance) {
      /*Blank default constructor essential for Firebase*/
        this.company = company;
        this.message = message;
        this.distance = distance;
    }
    //Getters and setters
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}