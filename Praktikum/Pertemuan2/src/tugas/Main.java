package tugas;

import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        Hashtable<String, String> hash = new Hashtable<>();
        hash.put("Kediri", "Jalan Kediri");
        hash.put("Malang", "Jalan Malang");
        hash.put("Surabaya", "Jalan Surabaya");
        hash.put("Jombang", "Jalan Jombang");
        hash.put("Gresik", "Jalan Gresik");
        hash.put("Batu", "Jalan Batu");
        hash.put("Madiun", "Jalan Madiun");
        hash.put("Jakarta", "Jalan Jakarta");
        hash.put("Bandung", "Jalan Bandung");
        hash.put("Bali", "Jalan Bali");

        AtomicInteger index = new AtomicInteger();
        hash.forEach((key, value) -> {
            int currentIndex = index.getAndIncrement();
            if (currentIndex % 2 != 0) {
                System.out.printf("[%s]: %s - %s%n", currentIndex, key, value);
            }
        });

        hash.remove("Bali");
        hash.remove("Bandung");
        System.out.println("Semua");


        AtomicInteger index2 = new AtomicInteger();
        hash.forEach((key, value) -> {
            int currentIndex = index2.getAndIncrement();
            System.out.printf("[%s]: %s - %s%n", currentIndex, key, value);
        });
    }
}
