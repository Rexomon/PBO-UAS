import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pekerja pekerja = new Pekerja("P1", "nama", "tugas", "kontak");
        StokPakan stokPakan = new StokPakan("JenisPakan", 10, new java.util.Date());
        Sapi sapi = new Sapi("Syapi", "Sapi Perah", "Sehat", 2);
        Ayam ayam = new Ayam("Ayam", "Ayam Kampung", "Sehat", 1);
        Kambing kambing = new Kambing("Kambing", "Kambing Etawa", "Sehat", 3);
        LaporanProduksi laporanProduksi = new LaporanProduksi();

        JFrame frame = new JFrame("Aplikasi Manajemen Hewan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(10, 1));
        frame.setLocationRelativeTo(null);

        JButton btnTambahHewan = new JButton("Tambah Hewan");
        JButton btnDataHewan = new JButton("Data Hewan");
        JButton btnUbahDataHewan = new JButton("Ubah Data Hewan");
        JButton btnTambahPekerja = new JButton("Tambah Pekerja");
        JButton btnTambahStokPakan = new JButton("Tambah Stok Pakan");
        JButton btnDataPakan = new JButton("Data Pakan");
        JButton btnLaporanPekerja = new JButton("Laporan Harian Pekerja");
        JButton btnLaporanProduksi = new JButton("Laporan Produksi");
        JButton btnBeriMakanHewan = new JButton("Beri Makan Hewan");
        JButton btnKeluar = new JButton("Keluar");

        frame.add(btnTambahHewan);
        frame.add(btnDataHewan);
        frame.add(btnUbahDataHewan);
        frame.add(btnTambahPekerja);
        frame.add(btnTambahStokPakan);
        frame.add(btnDataPakan);
        frame.add(btnLaporanPekerja);
        frame.add(btnLaporanProduksi);
        frame.add(btnBeriMakanHewan);
        frame.add(btnKeluar);

        btnTambahHewan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame tambahHewanFrame = new JFrame("Tambah Hewan");
                tambahHewanFrame.setSize(300, 200);
                tambahHewanFrame.setLayout(new GridLayout(4, 1));
                tambahHewanFrame.setLocationRelativeTo(null);

                JButton btnSapi = new JButton("Sapi");
                JButton btnAyam = new JButton("Ayam");
                JButton btnKambing = new JButton("Kambing");

                tambahHewanFrame.add(btnSapi);
                tambahHewanFrame.add(btnAyam);
                tambahHewanFrame.add(btnKambing);

                btnSapi.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        sapi.tambahDataHewan();
                    }
                });

                btnAyam.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        ayam.tambahDataHewan();
                    }
                });

                btnKambing.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        kambing.tambahDataHewan();
                    }
                });

                tambahHewanFrame.setVisible(true);
            }
        });

        btnDataHewan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame dataHewanFrame = new JFrame("Data Hewan");
                dataHewanFrame.setSize(300, 200);
                dataHewanFrame.setLayout(new GridLayout(3, 1));
                dataHewanFrame.setLocationRelativeTo(null);

                String dataSapi = sapi.dataHewan();
                JLabel sapiLabel = new JLabel("<html>Sapi:<br>" + dataSapi.replace("\n", "<br>") + "</html>");

                String dataAyam = ayam.dataHewan();
                JLabel ayamLabel = new JLabel("<html>Ayam:<br>" + dataAyam.replace("\n", "<br>") + "</html>");

                String dataKambing = kambing.dataHewan();
                JLabel kambingLabel = new JLabel("<html>Kambing:<br>" + dataKambing.replace("\n", "<br>") + "</html>");

                dataHewanFrame.add(sapiLabel);
                dataHewanFrame.add(ayamLabel);
                dataHewanFrame.add(kambingLabel);

                dataHewanFrame.setVisible(true);
            }
        });

        btnUbahDataHewan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame ubahDataHewanFrame = new JFrame("Ubah Data Hewan");
                ubahDataHewanFrame.setSize(300, 200);
                ubahDataHewanFrame.setLayout(new GridLayout(4, 1));
                ubahDataHewanFrame.setLocationRelativeTo(null);

                JButton btnSapi = new JButton("Sapi");
                JButton btnAyam = new JButton("Ayam");
                JButton btnKambing = new JButton("Kambing");

                ubahDataHewanFrame.add(btnSapi);
                ubahDataHewanFrame.add(btnAyam);
                ubahDataHewanFrame.add(btnKambing);

                btnSapi.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        sapi.ubahDataHewan();
                    }
                });

                btnAyam.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        ayam.ubahDataHewan();
                    }
                });

                btnKambing.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        kambing.ubahDataHewan();
                    }
                });

                ubahDataHewanFrame.setVisible(true);
            }
        });

        btnTambahPekerja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                pekerja.tambahData();

            }
        });

        btnTambahStokPakan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stokPakan.tambahData();
            }
        });

        btnDataPakan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stokPakan.laporanStokPakan();
            }
        });

        btnLaporanPekerja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pekerja.laporanTugasHarian();
            }
        });

        btnLaporanProduksi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame laporanProduksiFrame = new JFrame("Laporan Produksi");
                laporanProduksiFrame.setSize(300, 200);
                laporanProduksiFrame.setLayout(new GridLayout(4, 1));
                laporanProduksiFrame.setLocationRelativeTo(null);

                JButton btnSapi = new JButton("Sapi");
                JButton btnAyam = new JButton("Ayam");
                JButton btnKambing = new JButton("Kambing");

                laporanProduksiFrame.add(btnSapi);
                laporanProduksiFrame.add(btnAyam);
                laporanProduksiFrame.add(btnKambing);

                btnSapi.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        sapi.produksiSapi(laporanProduksi);
                    }
                });

                btnAyam.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        ayam.produksiAyam(laporanProduksi);
                    }
                });

                btnKambing.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        kambing.produksiKambing(laporanProduksi);
                    }
                });

                laporanProduksiFrame.setVisible(true);
            }
        });

        btnBeriMakanHewan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame beriMakanHewanFrame = new JFrame("Beri Makan Hewan");
                beriMakanHewanFrame.setSize(300, 200);
                beriMakanHewanFrame.setLayout(new GridLayout(4, 1));
                beriMakanHewanFrame.setLocationRelativeTo(null); // Center the frame

                JButton btnSapi = new JButton("Sapi");
                JButton btnAyam = new JButton("Ayam");
                JButton btnKambing = new JButton("Kambing");

                beriMakanHewanFrame.add(btnSapi);
                beriMakanHewanFrame.add(btnAyam);
                beriMakanHewanFrame.add(btnKambing);

                btnSapi.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String jumlahPakanStr = JOptionPane.showInputDialog("Masukkan jumlah pakan yang diberikan:");
                        try {
                            int jumlahPakan = Integer.parseInt(jumlahPakanStr);

                            boolean pakanDitemukan = false;
                            for (StokPakan stok : stokPakan.stokPakan) {
                                if (stok.getJenisPakan().equalsIgnoreCase("Pakan Sapi")) {
                                    pakanDitemukan = true;
                                    if (stok.getJumlahPakan() < jumlahPakan) {
                                        JOptionPane.showMessageDialog(null, "Stok pakan tidak cukup");
                                    } else {
                                        stok.kurangiPakan(jumlahPakan);
                                        sapi.beriMakan(jumlahPakan);
                                    }
                                    break;
                                }
                            }
                            if (!pakanDitemukan) {
                                JOptionPane.showMessageDialog(null, "Stok pakan tidak tersedia");
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Masukkan jumlah pakan yang valid.");
                        }
                    }
                });

                btnAyam.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String jumlahPakanStr = JOptionPane.showInputDialog("Masukkan jumlah pakan yang diberikan:");
                        try {
                            int jumlahPakan = Integer.parseInt(jumlahPakanStr);

                            boolean pakanDitemukan = false;
                            for (StokPakan stok : stokPakan.stokPakan) {
                                if (stok.getJenisPakan().equalsIgnoreCase("Pakan Ayam")) {
                                    pakanDitemukan = true;
                                    if (stok.getJumlahPakan() < jumlahPakan) {
                                        JOptionPane.showMessageDialog(null, "Stok pakan tidak cukup");
                                    } else {
                                        stok.kurangiPakan(jumlahPakan);
                                        ayam.beriMakan(jumlahPakan);
                                    }
                                    break;
                                }
                            }
                            if (!pakanDitemukan) {
                                JOptionPane.showMessageDialog(null, "Stok pakan tidak tersedia");
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Masukkan jumlah pakan yang valid.");
                        }
                    }
                });

                btnKambing.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String jumlahPakanStr = JOptionPane.showInputDialog("Masukkan jumlah pakan yang diberikan:");
                        try {
                            int jumlahPakan = Integer.parseInt(jumlahPakanStr);

                            boolean pakanDitemukan = false;
                            for (StokPakan stok : stokPakan.stokPakan) {
                                if (stok.getJenisPakan().equalsIgnoreCase("Pakan Kambing")) {
                                    pakanDitemukan = true;
                                    if (stok.getJumlahPakan() < jumlahPakan) {
                                        JOptionPane.showMessageDialog(null, "Stok pakan tidak cukup");
                                    } else {
                                        stok.kurangiPakan(jumlahPakan);
                                        kambing.beriMakan(jumlahPakan);
                                    }
                                    break;
                                }
                            }
                            if (!pakanDitemukan) {
                                JOptionPane.showMessageDialog(null, "Stok pakan tidak tersedia");
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Masukkan jumlah pakan yang valid.");
                        }
                    }
                });

                beriMakanHewanFrame.setVisible(true);
            }
        });

        btnKeluar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
        input.close();
    }
}
