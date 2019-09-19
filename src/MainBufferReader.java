import java.io.*;

public class MainBufferReader {
    public static void main(String[] args) {
        File file = new File("E://first.txt");
        String [] texts = new String[3];
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            int i = 0;
            while (true){
                texts[i]=br.readLine();
                System.out.println(texts[i]);
                if (texts[i]==null){
                    break;
                }
                i++;
            }
            for (int j = 0; j <texts.length ; j++) {
                System.out.println(texts[j]);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
