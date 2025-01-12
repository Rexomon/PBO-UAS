import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pekerja implements Manajemen {
    Scanner input = new Scanner(System.in);

    private ArrayList<Pekerja> dataPekerja = new ArrayList<Pekerja>();
    private String idPekerja;
    private String namaPekerja;
    private String tugasHarian;
    private String kontak;

    public Pekerja(String idPekerja, String namaPekerja, String tugasHarian, String kontak) {
        this.idPekerja = idPekerja;
        this.namaPekerja = namaPekerja;
        this.tugasHarian = tugasHarian;
        this.kontak = kontak;
    }

    @Override
    public void perbaruiData() {
        JFrame perbaruiDataFrame = new JFrame("Perbarui Data Pekerja");
        perbaruiDataFrame.setSize(300, 300);
        perbaruiDataFrame.setLayout(new GridLayout(5, 2));
        perbaruiDataFrame.setLocationRelativeTo(null); // Center the frame

        JLabel lblId = new JLabel("ID Pekerja:");
        JTextField txtId = new JTextField();
        JLabel lblNama = new JLabel("Nama Pekerja:");
        JTextField txtNama = new JTextField();
        JLabel lblTugas = new JLabel("Tugas Harian:");
        JTextField txtTugas = new JTextField();
        JLabel lblKontak = new JLabel("Kontak:");
        JTextField txtKontak = new JTextField();
        JButton btnSubmit = new JButton("Submit");

        perbaruiDataFrame.add(lblId);
        perbaruiDataFrame.add(txtId);
        perbaruiDataFrame.add(lblNama);
        perbaruiDataFrame.add(txtNama);
        perbaruiDataFrame.add(lblTugas);
        perbaruiDataFrame.add(txtTugas);
        perbaruiDataFrame.add(lblKontak);
        perbaruiDataFrame.add(txtKontak);
        perbaruiDataFrame.add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = txtId.getText();
                String nama = txtNama.getText();
                String tugas = txtTugas.getText();
                String kontak = txtKontak.getText();

                boolean isFound = false;
                for (Pekerja pekerja : dataPekerja) {
                    if (pekerja.getIdPekerja().equalsIgnoreCase(id)) {
                        isFound = true;
                        pekerja.setNamaPekerja(nama);
                        pekerja.setTugasHarian(tugas);
                        pekerja.setKontak(kontak);
                        JOptionPane.showMessageDialog(null, "Data pekerja berhasil diperbarui.");
                        perbaruiDataFrame.dispose();
                        return;
                    }
                }

                if (!isFound) {
                    JOptionPane.showMessageDialog(null, "Pekerja tidak ditemukan.");
                }
            }
        });

        perbaruiDataFrame.setVisible(true);
    }

    @Override
    public void tambahData() {
        JFrame tambahDataFrame = new JFrame("Tambah Data Pekerja");
        tambahDataFrame.setSize(300, 300);
        tambahDataFrame.setLayout(new GridLayout(5, 2));
        tambahDataFrame.setLocationRelativeTo(null); // Center the frame

        JLabel lblId = new JLabel("ID Pekerja:");
        JTextField txtId = new JTextField();
        JLabel lblNama = new JLabel("Nama Pekerja:");
        JTextField txtNama = new JTextField();
        JLabel lblTugas = new JLabel("Tugas Harian:");
        JTextField txtTugas = new JTextField();
        JLabel lblKontak = new JLabel("Kontak:");
        JTextField txtKontak = new JTextField();
        JButton btnSubmit = new JButton("Submit");

        tambahDataFrame.add(lblId);
        tambahDataFrame.add(txtId);
        tambahDataFrame.add(lblNama);
        tambahDataFrame.add(txtNama);
        tambahDataFrame.add(lblTugas);
        tambahDataFrame.add(txtTugas);
        tambahDataFrame.add(lblKontak);
        tambahDataFrame.add(txtKontak);
        tambahDataFrame.add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = txtId.getText();
                String nama = txtNama.getText();
                String tugas = txtTugas.getText();
                String kontak = txtKontak.getText();

                dataPekerja.add(new Pekerja(id, nama, tugas, kontak));
                tambahDataFrame.dispose();
            }
        });

        tambahDataFrame.setVisible(true);
    }

    public void laporanTugasHarian() {
        JFrame laporanFrame = new JFrame("Laporan Tugas Harian Pekerja");
        laporanFrame.setSize(300, 300);
        laporanFrame.setLayout(new GridLayout(dataPekerja.size(), 1));
        laporanFrame.setLocationRelativeTo(null); // Center the frame

        if (dataPekerja.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data pekerja kosong");
        } else {
            for (Pekerja pekerja : dataPekerja) {
                JLabel lblPekerja = new JLabel("<html>ID Pekerja: " + pekerja.getIdPekerja() +
                        "<br>Nama Pekerja: " + pekerja.getNamaPekerja() +
                        "<br>Tugas Harian: " + pekerja.getTugasHarian() +
                        "<br>Kontak: " + pekerja.getKontak() + "<br><br></html>");
                laporanFrame.add(lblPekerja);
            }
        }

        laporanFrame.setVisible(true);
    }

    public String getIdPekerja() {
        return idPekerja;
    }

    public String getNamaPekerja() {
        return namaPekerja;
    }

    public void setNamaPekerja(String namaPekerja) {
        this.namaPekerja = namaPekerja;
    }

    public String getTugasHarian() {
        return tugasHarian;
    }

    public void setTugasHarian(String tugasHarian) {
        this.tugasHarian = tugasHarian;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }
}
