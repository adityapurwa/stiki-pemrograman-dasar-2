import java.util.*;

/**
 * Soal 2
 * 
 * <hr/>
 * 10 15 4 2 3 7 88 54
 * <hr/>
 * <p>
 * Berdasarkan data angka dari nomor 1:
 * a. Buatlah tumpukan dari data nomor 1
 * b. Periksa apakah tumpukan kosong / penuh
 * c. Masukkan angka ’11’
 * d. Masukkan angka ‘14’
 * e. Hapus ‘7’
 * f. Temukan lokasi stack pada nilai ‘15’
 * g. Tampilkan stack saat ini
 */
public class Soal_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        System.out.println("Soal 2: (masukkan selain angka untuk mengakhiri input)");

        int index = 0;
        while (true) {
            System.out.printf("Input-%d: ", index++);
            try {
                int entry = Integer.parseInt(scanner.nextLine());
                stack.push(entry);
            } catch (NumberFormatException ex) {
                break;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Stack Kosong");
        } else {
            // Virtually, our stack is infinite
            // But lets assume if the size is >= 10, it is full
            if (stack.size() >= 10) {
                System.out.println("Stack Penuh");
            }else{
                System.out.println("Stack tidak penuh dan tidak kosong");
            }
        }

        while (true) {
            System.out.print("Input '11': ");

            try {
                int entry = Integer.parseInt(scanner.nextLine());
                if (entry != 11) {
                    throw new NumberFormatException();
                }
                stack.push(entry);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Coba lagi sesuai dengan input yang diminta");
            }
        }

        while (true) {
            System.out.print("Input '14': ");

            try {
                int entry = Integer.parseInt(scanner.nextLine());
                if (entry != 14) {
                    throw new NumberFormatException();
                }
                stack.push(entry);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Coba lagi sesuai dengan input yang diminta");
            }
        }

        while (true) {
            System.out.print("Hapus '7': ");

            try {
                int entry = Integer.parseInt(scanner.nextLine());
                if (entry != 7) {
                    throw new NumberFormatException();
                }
                // We box the entry to avoid remove stack on entry as index.
                stack.remove(Integer.valueOf(entry));
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Coba lagi sesuai dengan input yang diminta");
            }
        }


        while (true) {
            System.out.print("Mencari data '15': ");

            try {
                int entry = Integer.parseInt(scanner.nextLine());
                if (entry != 15) {
                    throw new NumberFormatException();
                }
                int indexSearch = stack.indexOf(15);
                if (indexSearch == -1) {
                    System.out.println("Tidak ada data '15'");
                } else {
                    System.out.printf("Data '15' ada di index %d%n", indexSearch);
                }
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Coba lagi sesuai dengan input yang diminta");
            }
        }

        System.out.println("Isi Stack");
        System.out.println(stack);



    }
}
