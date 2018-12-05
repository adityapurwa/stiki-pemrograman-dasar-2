import java.util.LinkedList;
import java.util.Scanner;

/**
 * Soal 3
 * 
 * <hr/>
 * 10 15 4 2 3 7 88 54
 * <hr/>
 * <p>
 * Berdasarkan data nomor 1:
 * a. Buatlah menjadi sebuah linked-list
 * b. Periksa apakah linked-list kosong atau tidak
 * c. Masukkan angka ‘34’
 * d. Masukkan angka ‘55’
 * e. Hapus angka ‘34’
 * f. Hapus angka ‘15’
 * g. Tampilkan isi linked-list sekarang
 */
public class Soal_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Soal 3: (masukkan selain angka untuk mengakhiri input)");

        int index = 0;
        while (true) {
            System.out.printf("Input-%d: ", index++);
            try {
                int entry = Integer.parseInt(scanner.nextLine());
                list.add(entry);
            } catch (NumberFormatException ex) {
                break;
            }
        }

        if (list.isEmpty()) {
            System.out.println("List Kosong");
        } else {
            // Virtually, our list is infinite
            // But lets assume if the size is >= 10, it is full
            if (list.size() >= 10) {
                System.out.println("List Penuh");
            }else{
                System.out.println("List tidak penuh dan tidak kosong");
            }
        }

        while (true) {
            System.out.print("Input '34': ");

            try {
                int entry = Integer.parseInt(scanner.nextLine());
                if (entry != 34) {
                    throw new NumberFormatException();
                }
                list.add(entry);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Coba lagi sesuai dengan input yang diminta");
            }
        }

        while (true) {
            System.out.print("Input '55': ");

            try {
                int entry = Integer.parseInt(scanner.nextLine());
                if (entry != 55) {
                    throw new NumberFormatException();
                }
                list.add(entry);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Coba lagi sesuai dengan input yang diminta");
            }
        }

        while (true) {
            System.out.print("Hapus '34': ");

            try {
                int entry = Integer.parseInt(scanner.nextLine());
                if (entry != 34) {
                    throw new NumberFormatException();
                }
                // We box the entry to avoid remove list on entry as index.
                list.remove(Integer.valueOf(entry));
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Coba lagi sesuai dengan input yang diminta");
            }
        }

        while (true) {
            System.out.print("Hapus '15': ");

            try {
                int entry = Integer.parseInt(scanner.nextLine());
                if (entry != 15) {
                    throw new NumberFormatException();
                }
                // We box the entry to avoid remove list on entry as index.
                list.remove(Integer.valueOf(entry));
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Coba lagi sesuai dengan input yang diminta");
            }
        }


        System.out.println("Isi List");
        System.out.println(list);



    }
}
