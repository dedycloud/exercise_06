import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainReader {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        try {
            File file = new File("E://first.txt");
            FileReader fileReader=new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            while (true) {
                String txt = br.readLine();
                if (txt == null) {
                    break;
                }
                text.add(txt);
            }
            for (String Read:text) {
                System.out.println(Read);

            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
