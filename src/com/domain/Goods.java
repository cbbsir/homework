package com.domain;

public class Goods {
    private int goodid;
    private String name;
    private double price;

    public int getGoodid() {
        return goodid;
    }

    public void setGoodid(int goodid) {
        this.goodid = goodid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Goods(int goodid, String name, double price) {
        this.goodid = goodid;
        this.name = name;
        this.price = price;
    }
    public Goods() {}

    @Override
    public String toString() {
        return "Goods{" +
                "goodid=" + goodid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
