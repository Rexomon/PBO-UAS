import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kambing extends Hewan {
    Scanner input = new Scanner(System.in);

    public void beriMakan() {
        beriMakan(1);
    }

    public Kambing(String namaHewan, String jenisHewan, String statusKesehatan, int umurHewan) {
        super(namaHewan, jenisHewan, statusKesehatan, umurHewan);
    }

    public void tambahDataHewan() {
        JFrame tambahDataFrame = new JFrame("Tambah Data Kambing");
        tambahDataFrame.setSize(300, 300);
        tambahDataFrame.setLayout(new GridLayout(5, 2));
        tambahDataFrame.setLocationRelativeTo(null); // Center the frame

        JLabel lblNama = new JLabel("Nama Hewan:");
        JTextField txtNama = new JTextField();
        JLabel lblJenis = new JLabel("Jenis Hewan:");
        JTextField txtJenis = new JTextField();
        JLabel lblStatus = new JLabel("Status Kesehatan:");
        JTextField txtStatus = new JTextField();
        JLabel lblUmur = new JLabel("Umur Hewan:");
        JTextField txtUmur = new JTextField();
        JButton btnSubmit = new JButton("Submit");

        tambahDataFrame.add(lblNama);
        tambahDataFrame.add(txtNama);
        tambahDataFrame.add(lblJenis);
        tambahDataFrame.add(txtJenis);
        tambahDataFrame.add(lblStatus);
        tambahDataFrame.add(txtStatus);
        tambahDataFrame.add(lblUmur);
        tambahDataFrame.add(txtUmur);
        tambahDataFrame.add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String namaHewan = txtNama.getText();
                String jenisHewan = txtJenis.getText();
                String statusKesehatan = txtStatus.getText();
                int umurHewan = Integer.parseInt(txtUmur.getText());

                dataHewan.add(new Kambing(namaHewan, jenisHewan, statusKesehatan, umurHewan));
                tambahDataFrame.dispose();
            }
        });

        tambahDataFrame.setVisible(true);
    }

    public void ubahDataHewan() {
        JFrame ubahDataFrame = new JFrame("Ubah Data Kambing");
        ubahDataFrame.setSize(300, 300);
        ubahDataFrame.setLayout(new GridLayout(4, 2));
        ubahDataFrame.setLocationRelativeTo(null); // Center the frame

        JLabel lblNama = new JLabel("Nama Hewan:");
        JTextField txtNama = new JTextField();
        JLabel lblStatus = new JLabel("Status Kesehatan Baru:");
        JTextField txtStatus = new JTextField();
        JLabel lblUmur = new JLabel("Umur Hewan Baru:");
        JTextField txtUmur = new JTextField();
        JButton btnSubmit = new JButton("Submit");

        ubahDataFrame.add(lblNama);
        ubahDataFrame.add(txtNama);
        ubahDataFrame.add(lblStatus);
        ubahDataFrame.add(txtStatus);
        ubahDataFrame.add(lblUmur);
        ubahDataFrame.add(txtUmur);
        ubahDataFrame.add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String namaHewan = txtNama.getText();
                String statusKesehatan = txtStatus.getText();
                int umurHewan = Integer.parseInt(txtUmur.getText());

                boolean isFound = false;
                for (Hewan hewan : dataHewan) {
                    if (hewan.getNamaHewan().equalsIgnoreCase(namaHewan)) {
                        isFound = true;
                        hewan.setUmurHewan(umurHewan);
                        hewan.setStatusKesehatan(statusKesehatan);
                        JOptionPane.showMessageDialog(null, "Status kesehatan hewan berhasil diubah.");
                        ubahDataFrame.dispose();
                        return;
                    }
                }

                if (!isFound) {
                    JOptionPane.showMessageDialog(null, "Hewan tidak ditemukan.");
                }
            }
        });

        ubahDataFrame.setVisible(true);
    }

    public void beriMakan(int jumlahMakanan) {
        JFrame beriMakanFrame = new JFrame("Beri Makan Kambing");
        beriMakanFrame.setSize(300, 200);
        beriMakanFrame.setLayout(new GridLayout(2, 1));
        beriMakanFrame.setLocationRelativeTo(null); // Center the frame

        JLabel lblJumlah = new JLabel("Jumlah Makanan (kg): " + jumlahMakanan);
        JButton btnSubmit = new JButton("OK");

        beriMakanFrame.add(lblJumlah);
        beriMakanFrame.add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Kambing diberi makan " + jumlahMakanan + " kg rumput");
                beriMakanFrame.dispose();
            }
        });

        beriMakanFrame.setVisible(true);
    }

    public String dataHewan() {
        StringBuilder data = new StringBuilder();
        for (Hewan hewan : dataHewan) {
            data.append("Nama Hewan: ").append(hewan.getNamaHewan())
                .append("\nJenis Hewan: ").append(hewan.getJenisHewan())
                .append("\nUmur Hewan: ").append(hewan.getUmurHewan()).append(" Tahun")
                .append("\nStatus Kesehatan: ").append(hewan.getStatusKesehatan()).append("\n\n");
        }
        return data.toString();
    }

    public void produksiKambing(LaporanProduksi laporanProduksi) {
        JFrame produksiFrame = new JFrame("Produksi Kambing");
        produksiFrame.setSize(400, 300);
        produksiFrame.setLayout(new GridLayout(5, 2));
        produksiFrame.setLocationRelativeTo(null); // Center the frame

        JLabel lblNama = new JLabel("Nama Kambing:");
        JTextField txtNama = new JTextField();
        JLabel lblJenis = new JLabel("Jenis Produksi (Susu/Daging):");
        JTextField txtJenis = new JTextField();
        JLabel lblJumlah = new JLabel("Jumlah Produksi:");
        JTextField txtJumlah = new JTextField();
        JLabel lblAlamat = new JLabel("Alamat Pembeli:");
        JTextField txtAlamat = new JTextField();
        JButton btnSubmit = new JButton("Submit");

        produksiFrame.add(lblNama);
        produksiFrame.add(txtNama);
        produksiFrame.add(lblJenis);
        produksiFrame.add(txtJenis);
        produksiFrame.add(lblJumlah);
        produksiFrame.add(txtJumlah);
        produksiFrame.add(lblAlamat);
        produksiFrame.add(txtAlamat);
        produksiFrame.add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String namaHewan = txtNama.getText();
                String jenisProduksi = txtJenis.getText();
                int jumlahProduksi = Integer.parseInt(txtJumlah.getText());
                String alamat = txtAlamat.getText();

                boolean isFound = false;
                for (Hewan hewan : dataHewan) {
                    if (hewan.getNamaHewan().equalsIgnoreCase(namaHewan)) {
                        isFound = true;
                        Produksi produksi = new Produksi(jenisProduksi, jumlahProduksi);
                        laporanProduksi.tambahHasilProduksi(produksi);
                        laporanProduksi.tambahAlamatPembeli(alamat);
                        laporanProduksi.tampilkanLaporan();
                        produksiFrame.dispose();
                        return;
                    }
                }

                if (!isFound) {
                    JOptionPane.showMessageDialog(null, "Nama hewan tersebut tidak ditemukan.");
                }
            }
        });

        produksiFrame.setVisible(true);
    }
}
