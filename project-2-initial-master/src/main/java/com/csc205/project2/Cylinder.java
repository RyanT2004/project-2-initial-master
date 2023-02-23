package com.csc205.project2;



public class Cylinder extends Shape {

    private double height;
    private double radius;

    public Cylinder() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double h, double r) {
        super();
        this.height = h;
        this.radius = r;
    }

    public double getHeight() {
        return height;
    }
    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public double surfaceArea() {
        return (2.0 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("Height=").append(height);
        sb.append("Radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }


}
