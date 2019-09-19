package com.enigma.model;

import java.io.FileWriter;

public class service {
    Integer number;

    public service(Integer number){
        this.number=number;
    }
    public void writeText() {
        try {
        FileWriter fileWriter = new FileWriter("E:\\first.txt");
        fileWriter.write("dey");
        fileWriter.close();
        }catch (Exception e){
        e.printStackTrace();
        }
    }

    public String print() {
        return "FileService{" +
                "number=" + number +
                '}';
    }
}
