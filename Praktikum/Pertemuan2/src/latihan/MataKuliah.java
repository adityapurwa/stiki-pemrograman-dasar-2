package latihan;

public class MataKuliah {
    String id;
    String nama;

    public MataKuliah() {
    }

    @Override
    public String toString() {
        return "MataKuliah{" +
                "id='" + id + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }

    public MataKuliah(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
