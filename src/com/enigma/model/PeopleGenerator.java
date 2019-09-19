package com.enigma.model;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeopleGenerator {
    String [] nama = new String[3] ;
    String [] umur = new String[3] ;
    String [] gender = new String[3] ;

    public void ReadFile(){
        File file = new File("E://first.txt");
        List<String> texts = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            while (true){
                String txt =br.readLine();
                if (txt==null){
                    break;
                }
                texts.add(txt);
            }
            System.out.print("Jumlah teman = ");
            System.out.println(texts.size());

            for (int i = 0; i < texts.size() ; i++) {
                nama[i] = texts.get(i).substring(0,30).trim();
                umur[i] = texts.get(i).substring(30,33).trim();
                gender[i] = texts.get(i).substring(33,34).trim();
                System.out.println(nama[i]);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }


//            for (String str:texts) {
//                String getName = str.substring(0,30);
//                String getUmur = str.substring(30,33);
//                String getGender = str.substring(33,34);
//                System.out.println(getName);
//                System.out.println(getUmur);
//            }


    public String print() {
        return "PeopleGenerator{" +
                "nama=" + Arrays.toString(nama) +
                ", umur=" + Arrays.toString(umur) +
                ", gender=" + Arrays.toString(gender) +
                '}';
    }
}
