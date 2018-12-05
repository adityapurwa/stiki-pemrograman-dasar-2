import java.util.Scanner;

class DataNim {
    DataNim(String angkatan, String jenjang, String prodi, String urutan) {
        this.angkatan = angkatan;
        this.jenjang = jenjang;
        this.prodi = prodi;
        this.urutan = urutan;
    }

    private String angkatan;
    private String jenjang;
    private String prodi;
    private String urutan;

    String getTahunAngkatan() {
        return "20" + angkatan;
    }

    String getJenjang() {
        if (jenjang.equals("11")) {
            return "S1";
        }
        if (jenjang.equals("22")) {
            return "D3";
        }
        return "Jenjang Tidak Diketahui";
    }

    String getProdi() {
        if (this.prodi.equals("16")) {
            return "TI";
        }
        if (prodi.equals("17")) {
            return "MI";
        }
        return "Prodi Tidak Diketahui";
    }

    String getUrutan() {
        return urutan;
    }
}

public class TugasString_1_2 {

    public static void main(String[] args) {
        System.out.println("Masukkan NIM: ");
        String nim = new Scanner(System.in).nextLine();

        try {
            DataNim data = soal(nim);

            System.out.println("Mahasiswa Terdaftar");
            System.out.println("Tahun Angkatan: " + data.getTahunAngkatan());
            System.out.println("Jenjang: " + data.getJenjang());
            System.out.println("Prodi: " + data.getProdi());
            System.out.println("Nomor Urut: " + data.getUrutan());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static DataNim soal(String nim) {
        if (nim.length() != 9) {
            throw new RuntimeException("NIM tidak sesuai format");
        }

        return new DataNim(
                nim.substring(0, 2),
                nim.substring(2, 4),
                nim.substring(4, 6),
                nim.substring(6, 9)
        );


    }

}
