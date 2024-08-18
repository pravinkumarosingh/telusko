package org.example;

public class Dev {

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    private Laptop laptop;

    public Dev(){
        System.out.println("Dev Constructor");
    }

    public void build(){
        System.out.println("This is Dev Class");
    }
}
