import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class LaporanProduksi {
    private ArrayList<Produksi> hasilProduksi = new ArrayList<>();
    private ArrayList<String> alamatPembeli = new ArrayList<>();

    public void tambahHasilProduksi(Produksi produksi) {
        hasilProduksi.add(produksi);
    }

    public void tambahAlamatPembeli(String alamat) {
        alamatPembeli.add(alamat);
    }

    public void tampilkanLaporan() {
        JFrame laporanFrame = new JFrame("Laporan Produksi");
        laporanFrame.setSize(300, 300);
        laporanFrame.setLayout(new GridLayout(hasilProduksi.size(), 1));
        laporanFrame.setLocationRelativeTo(null); // Center the frame

        if (hasilProduksi.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tidak ada hasil produksi");
        } else {
            for (int i = 0; i < hasilProduksi.size(); i++) {
                Produksi produksi = hasilProduksi.get(i);
                String alamat = alamatPembeli.get(i);
                JLabel lblProduksi = new JLabel("<html>Jenis Produksi: " + produksi.getJenisProduksi() +
                        "<br>Jumlah Produksi: " + produksi.getJumlahProduksi() +
                        "<br>Alamat Pembeli: " + alamat + "<br><br></html>");
                laporanFrame.add(lblProduksi);
            }
        }

        laporanFrame.setVisible(true);
    }
}
