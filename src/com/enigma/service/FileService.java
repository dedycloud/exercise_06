package com.enigma.service;

import java.io.FileWriter;

public class FileService {
    Integer umur;
    String nama;
    String gender;
    public FileService(String nama, String gender, Integer umur) {
        this.nama = nama;
        this.umur=umur;
        this.gender=gender;
    }
    public void writeText() {

        try {
            FileWriter fileWriter = new FileWriter("E:\\dedy.txt",true);
            fileWriter.write(print());
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String print() {
        return "FileService{" +
                "umur=" + umur +
                ", nama='" + nama + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
