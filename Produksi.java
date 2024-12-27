import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class Produksi {
    private String jenisProduksi;
    private int jumlahProduksi;

    public Produksi(String jenisProduksi, int jumlahProduksi) {
        this.jenisProduksi = jenisProduksi;
        this.jumlahProduksi = jumlahProduksi;
    }

    public String getJenisProduksi() {
        return jenisProduksi;
    }

    public void setJenisProduksi(String jenisProduksi) {
        this.jenisProduksi = jenisProduksi;
    }

    public int getJumlahProduksi() {
        return jumlahProduksi;
    }

    public void setJumlahProduksi(int jumlahProduksi) {
        this.jumlahProduksi = jumlahProduksi;
    }

    public void catatHasilProduksi() {
        JFrame produksiFrame = new JFrame("Catat Hasil Produksi");
        produksiFrame.setSize(300, 200);
        produksiFrame.setLayout(new GridLayout(3, 1));
        produksiFrame.setLocationRelativeTo(null); // Center the frame

        JLabel lblJenis = new JLabel("Jenis Produksi: " + jenisProduksi);
        JLabel lblJumlah = new JLabel("Jumlah Produksi: " + jumlahProduksi);
        JButton btnClose = new JButton("Tutup");

        produksiFrame.add(lblJenis);
        produksiFrame.add(lblJumlah);
        produksiFrame.add(btnClose);

        btnClose.addActionListener(e -> produksiFrame.dispose());

        produksiFrame.setVisible(true);
    }
}
