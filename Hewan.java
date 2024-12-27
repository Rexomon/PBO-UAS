import java.util.ArrayList;

public abstract class Hewan {
    protected ArrayList<Hewan> dataHewan = new ArrayList<>();
    private String namaHewan, jenisHewan, statusKesehatan;
    private int umurHewan;

    public Hewan(String namaHewan, String jenisHewan, String statusKesehatan, int umurHewan) {
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.statusKesehatan = statusKesehatan;
        this.umurHewan = umurHewan;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public String getStatusKesehatan() {
        return statusKesehatan;
    }

    public void setStatusKesehatan(String statusKesehatan) {
        this.statusKesehatan = statusKesehatan;
    }

    public int getUmurHewan() {
        return umurHewan;
    }

    public void setUmurHewan(int umurHewan) {
        this.umurHewan = umurHewan;
    }

    @Override
    public String toString() {
        return "Nama: " + namaHewan + ", Jenis: " + jenisHewan +
               ", Umur: " + umurHewan + ", Status Kesehatan: " + statusKesehatan;
    }
}
