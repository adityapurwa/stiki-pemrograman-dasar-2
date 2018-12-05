package latihan;

import java.util.ArrayList;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        // Latihan 1
        ArrayList<DataMahasiswa> data = new ArrayList<>();
        data.add(new DataMahasiswa(
                "Asdikin", "171116000", "Malang"
        ));
        data.add(new DataMahasiswa(
                "Robby", "171116001", "Malang"
        ));
        data.add(new DataMahasiswa(
                "Tauhid", "171116002", "Malang"
        ));
        data.add(new DataMahasiswa(
                "Adit", "171116003", "Malang"
        ));
        data.add(new DataMahasiswa(
                "Sima", "171116004", "Malang"
        ));

        data.forEach(System.out::println);

        data.remove(3);
        System.out.println("Setelah dihapus");

        data.forEach(System.out::println);

        // Latihan 2

        Hashtable<String, MataKuliah> hash = new Hashtable<>();

        hash.put("M01", new MataKuliah("M01", "Database"));
        hash.put("M02", new MataKuliah("M02", "Matematika"));
        hash.put("M03", new MataKuliah("M03", "Pemrograman"));
        hash.put("M04", new MataKuliah("M04", "Sistem Informasi"));
        hash.put("M05", new MataKuliah("M05", "Algoritma"));

        hash.forEach((key, value) -> System.out.printf("%s - %s%n", key, value));
        hash.remove("M03");
        System.out.println("Setelah dihapus");
        hash.forEach((key, value) -> System.out.printf("%s - %s%n", key, value));



    }
}
