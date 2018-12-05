import java.util.Scanner;

public class TableArray {
    public static void main(String[] args) {
        String[][] table = new String[4][5];
        String kols[] = {"NRP", "Nama", "Alamat", "Telp", "Email"};
        Scanner scan = new Scanner(System.in);

        for (int bar = 0; bar < table.length; bar++) {
            for (int kol = 0; kol < table[bar].length; kol++) {
                System.out.format("Data %d - [%s]: ", bar, kols[kol]);
                table[bar][kol] = scan.nextLine();
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < kols.length; i++) {
            String kol = kols[i];
            System.out.format("| %10s ", kol);
            if (i == kols.length - 1) {
                System.out.print("|");
            }
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------");

        for (int bar = 0; bar < table.length; bar++) {
            for (int kol = 0; kol < table[bar].length; kol++) {
                System.out.format("| %10s ", table[bar][kol]);
                if (kol == table[bar].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------");


    }
}
