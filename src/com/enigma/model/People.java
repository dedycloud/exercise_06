package com.enigma.model;

import java.io.FileWriter;

public class People {
    Integer umur;
    String nama;
    String gender;
    public People(String nama, String gender, Integer umur) {
        this.nama = nama;
        this.umur=umur;
        this.gender=gender;
    }

    public void writeText() {
        try {
            FileWriter fileWriter = new FileWriter("E:\\first.txt",true);
            fileWriter.write(print());
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public String print() {
        return  String.format("%1$-30s", nama) +
                String.format("%1$-3s", umur) +
                String.format("%1$-1s", gender) + '\n';
    }
}

