package latihan;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static final String[] authors = {
            "James Wyatt",
            "Marionette",
            "Antigya",
            "Herakles",
            "Daemon",
            "Lucent",
            "Pterya",
            "Coura",
            "Bear Tern",
            "Mack Alger",
    };
    static final String[] titles = {
            "The King of Avaga",
            "The Destiny of Shivron",
            "The Dead King",
            "Bitter Dream",
            "Locust of The Northwind",
            "Saturn",
            "Coming to Visor",
            "Dear Magenta",
            "Avatar",
            "Astral Schianova"
    };

    public static void main(String[] args) {
        ArrayList<Buku> books = generateBooks();
        books.forEach(book -> {
            System.out.println(book.toString());
            System.out.println("----------");
        });
    }

    static ArrayList<Buku> generateBooks() {
        ArrayList<Buku> books = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            books.add(new Buku(
                    authors[i],
                    titles[i],
                    1990 + (i * 3),
                    i % 4,
                    12500 + new Random(i).nextInt(100) * 1000
            ));
        }
        return books;
    }
}
