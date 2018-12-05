import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Soal 1
 * <p>
 * Diketahui sebuah antrian angka dengan Panjang 10 elemen sebagai berikut: (masukkan
 * nilai dengan Scanner atau BufferedReader)
 * <p>
 * <hr/>
 * 10 15 4 2 3 7 88 54
 * <hr/>
 * <p>
 * <p>
 * Berdasarkan antrian di atas, kerjakan:
 * a. Periksa apakah antrian kosong / penuh
 * b. Masukkan angka ‘60’
 * c. Hapus angka ‘3’
 * d. Masukkan angka ‘33’
 * e. Tampilkan antrian saat ini
 * f. Cari angka ‘44’ pada antrian
 */
public class Soal_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Soal 1: (masukkan selain angka untuk mengakhiri input)");

        int index = 0;
        while (true) {
            System.out.printf("Input-%d: ", index++);
            try {
                int input = Integer.parseInt(scanner.nextLine());
                queue.add(input);
            } catch (NumberFormatException ex) {
                break;
            }
        }

        if (queue.isEmpty()) {
            System.out.println("Queue Kosong");
        } else {
            // Virtually, our queue is infinite as it is implemented using linked list
            // But lets assume if the size is >= 10, it is full
            if (queue.size() >= 10) {
                System.out.println("Queue Penuh");
            }else{
                System.out.println("Queue tidak penuh dan tidak kosong");
            }
        }

        while (true) {
            System.out.print("Input '60': ");

            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input != 60) {
                    throw new NumberFormatException();
                }
                queue.add(input);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Coba lagi sesuai dengan input yang diminta");
            }
        }

        while (true) {
            System.out.print("Hapus '3': ");

            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input != 3) {
                    throw new NumberFormatException();
                }
                // We box the input to avoid remove queue on input as index.
                queue.remove(Integer.valueOf(input));
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Coba lagi sesuai dengan input yang diminta");
            }
        }

        while (true) {
            System.out.print("Input '33': ");

            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input != 33) {
                    throw new NumberFormatException();
                }
                // We box the input to avoid remove queue on input as index.
                queue.add(input);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Coba lagi sesuai dengan input yang diminta");
            }
        }

        System.out.println("Isi Queue");
        System.out.println(queue);

        while (true) {
            System.out.print("Mencari data '44': ");

            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input != 44) {
                    throw new NumberFormatException();
                }
                int indexSearch = ((LinkedList<Integer>) queue).indexOf(input);
                if (indexSearch == -1) {
                    System.out.println("Tidak ada data '44'");
                } else {
                    System.out.printf("Data '44' ada di index %d%n", indexSearch);
                }
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Coba lagi sesuai dengan input yang diminta");
            }
        }



    }
}
