import com.enigma.model.service;
import com.enigma.model.People;
import com.enigma.service.FileService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class MainTugasInput {
    public static void main(String[] args) throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        System.out.print("Input Jumlah teman : ");
        String jumData = dataIn.readLine();
        int jumlahTeman = Integer.parseInt(jumData);
        int numb = 1;
        for (int i = 0; i < jumlahTeman ; i++) {
            System.out.println("Masukan data ke "+ numb++);
            System.out.print("Nama  :");
            String nama = dataIn.readLine();
            System.out.print("Umur :");
            String umur = dataIn.readLine();
            int Age = Integer.parseInt(umur);
            System.out.print("Gender :");
            String gender = dataIn.readLine();

            Set<People> people = new HashSet<>();
            people.add(new People(nama, gender, Age));

            People fileService = new People(nama,gender,Age);
            fileService.writeText();
        }
        }
}


