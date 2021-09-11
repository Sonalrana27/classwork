package com.sonal.classmodeling;
public class House
{

private int housenumber;
private String mainintersection;
private double squareft;
private int numberofstorey;
private String colorofhouse;

    public int getHousenumber() {
        return housenumber;
    }

    public String getMainintersection() {
        return mainintersection;
    }

    public double getSquareft() {
        return squareft;
    }

    public int getNumberofstorey() {
        return numberofstorey;
    }

    public String getColorofhouse() {
        return colorofhouse;
    }

    public void setHousenumber(int housenumber) {
        this.housenumber = housenumber;
    }

    public void setMainintersection(String mainintersection) {
        this.mainintersection = mainintersection;
    }

    public void setSquareft(double squareft) {
        this.squareft = squareft;
    }

    public void setNumberofstorey(int numberofstorey) {
        this.numberofstorey = numberofstorey;
    }

    public void setColorofhouse(String colorofhouse) {
        this.colorofhouse = colorofhouse;
    }
}