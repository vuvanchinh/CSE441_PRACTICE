package com.example.vn.edu.tlu.m2151173753;

public class Beverage {
    private String tenMon;
    private String giaMon;
    private int hinhAnh;

    public Beverage(String tenMon, String giaMon, int hinhAnh) {
        this.tenMon = tenMon;
        this.giaMon = giaMon;
        this.hinhAnh = hinhAnh;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getGiaMon() {
        return giaMon;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }
}
