package com.company;

public class Ractangle {
    private double width, height;

    public Ractangle() {
    }

    public Ractangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter()
    {
        return (this.width+this.height)*2;
    }
    public String display()
    {
        return "Hình chữ nhật có diện tích là: "+getArea()+", chu vi là: "+getPerimeter();
    }
}
