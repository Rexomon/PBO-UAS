import java.util.ArrayList;
import java.util.List;

public class LaporanProduksi implements Pengiriman {
    private List<Produksi> laporanProduksi;
    private String alamatPembeli;

    public LaporanProduksi() {
        laporanProduksi = new ArrayList<>();
    }

    @Override
    public void tambahAlamatPembeli(String alamat) {
        this.alamatPembeli = alamat;
    }

    public void tambahHasilProduksi(Produksi produksi) {
        laporanProduksi.add(produksi);
        System.out.println(
                "Hasil Produksi telah ditambahkan: " + produksi.getJenisHasil() + ", Jumlah: " + produksi.getJumlah());
    }

    public void tampilkanLaporan() {
        if (laporanProduksi.isEmpty()) {
            System.out.println("Tidak ada laporan hasil produksi.");
        } else {
            System.out.println("Laporan Hasil Produksi:");
            for (Produksi p : laporanProduksi) {
                p.catatHasilProduksi();
            }
            if (alamatPembeli != null) {
                System.out.println("Alamat Pembeli: " + alamatPembeli + "\n");
            } else {
                System.out.println("Alamat Pembeli belum diatur.");
            }
        }
    }
}
