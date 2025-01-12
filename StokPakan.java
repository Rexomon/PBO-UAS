import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StokPakan implements Manajemen {
    Scanner input = new Scanner(System.in);

    protected ArrayList<StokPakan> stokPakan = new ArrayList<StokPakan>();
    private String JenisPakan;
    private int JumlahPakan;
    private Date TanggalKadaluarsa;

    public StokPakan(String JenisPakan, int JumlahPakan, Date TanggalKadaluarsa) {
        this.JenisPakan = JenisPakan;
        this.JumlahPakan = JumlahPakan;
        this.TanggalKadaluarsa = TanggalKadaluarsa;
    }

    @Override
    public void perbaruiData() {
        JFrame perbaruiDataFrame = new JFrame("Perbarui Data Stok Pakan");
        perbaruiDataFrame.setSize(300, 300);
        perbaruiDataFrame.setLayout(new GridLayout(4, 2));
        perbaruiDataFrame.setLocationRelativeTo(null); // Center the frame

        JLabel lblJenis = new JLabel("Jenis Pakan:");
        JTextField txtJenis = new JTextField();
        JLabel lblJumlah = new JLabel("Jumlah Pakan:");
        JTextField txtJumlah = new JTextField();
        JLabel lblTanggal = new JLabel("Tanggal Kadaluarsa (dd-MM-yyyy):");
        JTextField txtTanggal = new JTextField();
        JButton btnSubmit = new JButton("Submit");

        perbaruiDataFrame.add(lblJenis);
        perbaruiDataFrame.add(txtJenis);
        perbaruiDataFrame.add(lblJumlah);
        perbaruiDataFrame.add(txtJumlah);
        perbaruiDataFrame.add(lblTanggal);
        perbaruiDataFrame.add(txtTanggal);
        perbaruiDataFrame.add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String jenis = txtJenis.getText();
                int jumlah = Integer.parseInt(txtJumlah.getText());
                String tanggal = txtTanggal.getText();
                Date tanggalKadaluarsa = null;
                try {
                    tanggalKadaluarsa = new SimpleDateFormat("dd-MM-yyyy").parse(tanggal);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }

                boolean isFound = false;
                for (StokPakan stok : stokPakan) {
                    if (stok.getJenisPakan().equalsIgnoreCase(jenis)) {
                        isFound = true;
                        stok.setJumlahPakan(jumlah);
                        stok.setTanggalKadaluarsa(tanggalKadaluarsa);
                        JOptionPane.showMessageDialog(null, "Data stok pakan berhasil diperbarui.");
                        perbaruiDataFrame.dispose();
                        return;
                    }
                }

                if (!isFound) {
                    JOptionPane.showMessageDialog(null, "Stok pakan tidak ditemukan.");
                }
            }
        });

        perbaruiDataFrame.setVisible(true);
    }

    @Override
    public void tambahData() {
        JFrame tambahDataFrame = new JFrame("Tambah Data Stok Pakan");
        tambahDataFrame.setSize(650, 400);
        tambahDataFrame.setLayout(new GridLayout(4, 2));
        tambahDataFrame.setLocationRelativeTo(null); // Center the frame

        JLabel lblJenis = new JLabel("Jenis Pakan(Pakan Sapi/Pakan Ayam/Pakan Kambing):");
        JTextField txtJenis = new JTextField();
        JLabel lblJumlah = new JLabel("Jumlah Pakan:");
        JTextField txtJumlah = new JTextField();
        JLabel lblTanggal = new JLabel("Tanggal Kadaluarsa (dd-MM-yyyy):");
        JTextField txtTanggal = new JTextField();
        JButton btnSubmit = new JButton("Submit");

        tambahDataFrame.add(lblJenis);
        tambahDataFrame.add(txtJenis);
        tambahDataFrame.add(lblJumlah);
        tambahDataFrame.add(txtJumlah);
        tambahDataFrame.add(lblTanggal);
        tambahDataFrame.add(txtTanggal);
        tambahDataFrame.add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String jenis = txtJenis.getText();
                int jumlah = Integer.parseInt(txtJumlah.getText());
                String tanggal = txtTanggal.getText();
                Date tanggalKadaluarsa = null;
                try {
                    tanggalKadaluarsa = new SimpleDateFormat("dd-MM-yyyy").parse(tanggal);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }

                stokPakan.add(new StokPakan(jenis, jumlah, tanggalKadaluarsa));
                tambahDataFrame.dispose();
            }
        });

        tambahDataFrame.setVisible(true);
    }

    public boolean kurangiPakan(int jumlah) {
        if (JumlahPakan >= jumlah) {
            JumlahPakan -= jumlah;
            return true;
        } else {
            return false;
        }
    }

    public void laporanStokPakan() {
        JFrame laporanFrame = new JFrame("Laporan Stok Pakan");
        laporanFrame.setSize(300, 300);
        laporanFrame.setLayout(new GridLayout(stokPakan.size(), 1));
        laporanFrame.setLocationRelativeTo(null); // Center the frame

        if (stokPakan.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Stok pakan kosong");
        } else {
            for (StokPakan stok : stokPakan) {
                JLabel lblStok = new JLabel("<html>Jenis Pakan: " + stok.getJenisPakan() +
                        "<br>Jumlah Pakan: " + stok.getJumlahPakan() +
                        "<br>Tanggal Kadaluarsa: "
                        + new SimpleDateFormat("dd-MM-yyyy").format(stok.getTanggalKadaluasa()) + "<br><br></html>");
                laporanFrame.add(lblStok);
            }
        }

        laporanFrame.setVisible(true);
    }

    public String getJenisPakan() {
        return JenisPakan;
    }

    public int getJumlahPakan() {
        return JumlahPakan;
    }

    public void setJumlahPakan(int jumlahPakan) {
        this.JumlahPakan = jumlahPakan;
    }

    public Date getTanggalKadaluasa() {
        return TanggalKadaluarsa;
    }

    public void setTanggalKadaluarsa(Date tanggalKadaluarsa) {
        this.TanggalKadaluarsa = tanggalKadaluarsa;
    }
}
