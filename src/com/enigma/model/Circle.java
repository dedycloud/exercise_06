package com.enigma.model;

import java.io.FileWriter;
import java.util.Objects;

public class Circle {
    protected final Double pi=3.14;
    protected   Integer r;

    public   Circle(Integer r){
        this.r = r;
    }
    Double getSurface(){
        return pi*r*r;
    }
    Double getRound(){
        return pi*r*2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return r.equals(circle.r);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public String print() {
        return "Circle {" +
                " Round=" + getRound() +
                ", Surface=" + getSurface() +
                '}';
    }
}
