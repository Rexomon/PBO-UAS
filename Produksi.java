public class Produksi {
    private String JenisHasil;
    private int Jumlah;

    public Produksi(String JenisHasil, int Jumlah) {
        this.JenisHasil = JenisHasil;
        this.Jumlah = Jumlah;
    }

    // Getter & Setter
    public String getJenisHasil() {
        return JenisHasil;
    }

    public void setJenisHasil(String jenisHasil) {
        this.JenisHasil = jenisHasil;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int jumlah) {
        this.Jumlah = jumlah;
    }

    public void catatHasilProduksi() {
        System.out.println("Jenis Hasil: " + JenisHasil + ", Jumlah: " + Jumlah);
    }
}
