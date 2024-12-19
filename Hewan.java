import java.util.ArrayList;

public abstract class Hewan {

    protected ArrayList<Hewan> dataHewan = new ArrayList<Hewan>();
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

    public int getUmurHewan() {
        return umurHewan;
    }

}
