package latihan;

public class DataMahasiswa {
    public DataMahasiswa(String nama, String nrp, String alamat) {
        this.nama = nama;
        this.nrp = nrp;
        this.alamat = alamat;
    }

    public DataMahasiswa() {
    }

    String nama;
    String nrp;
    String alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "DataMahasiswa{" +
                "nama='" + nama + '\'' +
                ", nrp='" + nrp + '\'' +
                ", alamat='" + alamat + '\'' +
                '}';
    }
}
