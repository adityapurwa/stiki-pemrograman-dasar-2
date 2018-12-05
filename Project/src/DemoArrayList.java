import java.util.ArrayList;

class DemoArrayList {
    public static void main(String[] args) {
        //deklarasi array
        ArrayList<Integer> deret = new ArrayList<Integer>();
        //periksa ukuran array awal
        System.out.println("Panjang deret awal: " + deret.size());
        //menambah elemen
        for (int i = 0; i < 10; i++) {
            deret.add(i * 10);
        }
        //periksa ukuran array lagi
        System.out.println("\nPanjang deret setelah ditambah elemen: " + deret.size());
        //mendapatkan elemen array tertentu
        for (int i = 0; i < deret.size(); i++) {
            System.out.println("elemen ke - " + i + " : "
                    + deret.get(i));
        }
        //apakah array list kosong?
        System.out.println("\nMemeriksa apakah array list kosong: ");
        System.out.println(deret.isEmpty());
        //mencari index tertentu
        System.out.println("\nMencari indeks dari suatu nilai di dalam array list: ");
        System.out.println(deret.indexOf(60));
        System.out.println(deret.indexOf(70));
        System.out.println(deret.indexOf(80));
        //periksa keberadaan elemen
        System.out.println("\nMemeriksa keberadaan suatu nilai di dalam array list: ");
        System.out.println(deret.contains(60));
        System.out.println(deret.contains(89));
        System.out.println(deret.contains(80));
        //update elemen
        System.out.println("\nUpdate suatu nilai di dalam array list: ");
        deret.set(1, 600);
        deret.set(7, 700);
        deret.set(8, 800);

        System.out.println(deret.get(6));
        System.out.println(deret.get(7));
        System.out.println(deret.get(8));
        //hapus elemen
        System.out.println("\nMenghapus suatu nilai di dalam array list: ");
        deret.remove(6);
        deret.remove(6);
        deret.remove(6);

        System.out.println("\nPanjang deret setelah menghapus beberapa elemen: " + deret.size());

        for (int i = 0; i < deret.size(); i++) {
            System.out.println("elemen ke - " + i + " : " + deret.get(i));
        }
    }
}