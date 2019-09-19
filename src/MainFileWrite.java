import com.enigma.model.Circle;

import java.io.FileWriter;

public class MainFileWrite {
    public static void main(String[] args) {
            try {
                FileWriter fileWriter = new FileWriter("E:\\first.txt");
                Circle circle = new Circle(2);
                fileWriter.write(circle.print());
                fileWriter.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

}
