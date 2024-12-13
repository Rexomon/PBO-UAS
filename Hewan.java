public abstract class Hewan {
    private String namaHewan, jenisHewan;
    private int umurHewan;

    public Hewan(String namaHewan, String jenisHewan, int umurHewan) {
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.umurHewan = umurHewan;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public int getUmurHewan() {
        return umurHewan;
    }
}
