import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue2 {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();
        antrian.add("Addin");
        antrian.add("Johny");
        antrian.add("Evan");
        antrian.add("David");
        antrian.add("Jeremy");

        System.out.println("Antrian pendaftaran peserta: " + antrian);

        String nama = antrian.remove();
    }
}
