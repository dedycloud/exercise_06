import com.enigma.model.PeopleGenerator;

public class MainTugasRead {
    public static void main(String[] args) {
        PeopleGenerator peopleGenerator = new PeopleGenerator();
        peopleGenerator.ReadFile();

        System.out.println(peopleGenerator.print());
    }
}
