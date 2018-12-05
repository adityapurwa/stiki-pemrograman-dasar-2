import java.util.ArrayList;
import java.util.Arrays;

public class TugasArrayList {
    public static void main(String[] args) {

        // No. 1
        ArrayList<String> names = new ArrayList<>(
                Arrays.asList(
                        "Addin",
                        "Danny",
                        "Chris",
                        "Renny",
                        "Marco",
                        "Teddy",
                        "Lunna"
                )
        );

        // No. 2
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(4));

        System.out.println();

        // No. 3
        System.out.println(names.contains("Ronny"));

        System.out.println();

        // No. 4
        names.set(names.indexOf("Chris"), "Harry");

        // No. 5
        names.remove("Teddy");

        // No. 6
        names.remove("Lunna");

        // No. 7
        names.forEach(System.out::println);
    }
}
