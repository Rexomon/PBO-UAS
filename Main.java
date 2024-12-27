import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pekerja pekerja = new Pekerja(1, "nama", "tugas", "kontak");
        StokPakan stokPakan = new StokPakan("JenisPakan", 10, new java.util.Date());
        Sapi sapi = new Sapi("Syapi", "Sapi Perah", "Sehat", 2);
        Ayam ayam = new Ayam("Ayam", "Ayam Kampung", "Sehat", 1);
        Kambing kambing = new Kambing("Kambing", "Kambing Etawa", "Sehat", 3);
        LaporanProduksi laporanProduksi = new LaporanProduksi();

        int pilihan;

        do {
            System.out.println("Selamat datang di Aplikasi Manajemen Hewan");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Data Hewan");
            System.out.println("3. Ubah Data Hewan");
            System.out.println("4. Tambah Pekerja");
            System.out.println("5. Tambah Stok Pakan");
            System.out.println("6. Data Pakan");
            System.out.println("7. Laporan Harian Pekerja");
            System.out.println("8. Laporan Produksi");
            System.out.println("9. Beri Makan Hewan");
            System.out.println("10.Keluar");
            System.out.print("Masukkan pilihan anda : ");

            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.println("\n====Tambah Hewan====");

                System.out.println("1. Sapi");
                System.out.println("2. Ayam");
                System.out.println("3. Kambing");
                System.out.print("Masukkan pilihan anda (Sapi/Ayam/Kambing): ");
                String pilihanHewan = input.nextLine();

                if (pilihanHewan.equalsIgnoreCase("Sapi")) {
                    sapi.tambahDataHewan();
                } else if (pilihanHewan.equalsIgnoreCase("Ayam")) {
                    ayam.tambahDataHewan();
                } else if (pilihanHewan.equalsIgnoreCase("Kambing")) {
                    kambing.tambahDataHewan();
                } else {
                    System.out.println("Pilihan tidak tersedia \n");
                }
            }
            if (pilihan == 2) {
                System.out.println("\n====Data Hewan====");
                sapi.dataHewan();
                ayam.dataHewan();
                kambing.dataHewan();
            }

            if (pilihan == 3) {
                System.out.println("\n==== Ubah Data Hewan ====");
                System.out.println("1. Sapi");
                System.out.println("2. Ayam");
                System.out.println("3. Kambing");
                System.out.print("Masukkan pilihan anda (Sapi/Ayam/Kambing): ");
                String pilihanHewan = input.nextLine();

                if (pilihanHewan.equalsIgnoreCase("Sapi")) {
                    sapi.ubahDataHewan();
                } else if (pilihanHewan.equalsIgnoreCase("Ayam")) {
                    ayam.ubahDataHewan();
                } else if (pilihanHewan.equalsIgnoreCase("Kambing")) {
                    kambing.ubahDataHewan();
                } else {
                    System.out.println("Pilihan tidak tersedia \n");
                }

            }

            if (pilihan == 4) {
                System.out.println("\n====Tambah Pekerja====");
                pekerja.tambahData();
            }

            if (pilihan == 5) {
                System.out.println("\n====Tambah Stok Pakan====");
                stokPakan.tambahData();
            }

            if (pilihan == 6) {
                System.out.println("\n====Data Pakan====");
                stokPakan.laporanStokPakan();
            }

            if (pilihan == 7) {
                System.out.println("\n====Laporan Pekerja====");
                pekerja.laporanTugasHarian();
            }

            if (pilihan == 8) {
                System.out.println("\n====Laporan Produksi====");

                System.out.println("1. Sapi");
                System.out.println("2. Ayam");
                System.out.println("3. Kambing");
                System.out.print("Masukkan pilihan anda (Sapi/Ayam/Kambing): ");
                String pilihanHewan = input.nextLine();

                if (pilihanHewan.equalsIgnoreCase("Sapi")) {
                    sapi.produksiSapi(laporanProduksi);
                } else if (pilihanHewan.equalsIgnoreCase("Ayam")) {
                    ayam.produksiAyam(laporanProduksi);
                } else if (pilihanHewan.equalsIgnoreCase("Kambing")) {
                    kambing.produksiKambing(laporanProduksi);
                } else {
                    System.out.println("Pilihan tidak tersedia \n");
                }

            }

            if (pilihan == 9) {
                int jumlahPakan;
                System.out.println("\n====Beri Makan Hewan====");

                System.out.println("1. Sapi");
                System.out.println("2. Ayam");
                System.out.println("3. Kambing");
                System.out.print("Masukkan pilihan anda (Sapi/Ayam/Kambing): ");
                String pilMakan = input.nextLine();

                if (pilMakan.equalsIgnoreCase("Sapi")) {
                    System.out.print("Masukkan jumlah pakan yang diberikan : ");
                    jumlahPakan = input.nextInt();
                    input.nextLine();

                    boolean pakanDitemukan = false;
                    for (StokPakan stok : stokPakan.stokPakan) {
                        if (stok.getJenisPakan().equalsIgnoreCase("Pakan Sapi")) {
                            pakanDitemukan = true;
                            if (stok.getJumlahPakan() < jumlahPakan) {
                                System.out.println("Stok pakan tidak cukup \n");
                            } else {
                                stok.kurangiPakan(jumlahPakan);
                                sapi.beriMakan(jumlahPakan);
                            }
                            break;
                        }
                    }
                    if (!pakanDitemukan) {
                        System.out.println("Stok pakan tidak tersedia\n");
                    }
                } else if (pilMakan.equalsIgnoreCase("Ayam")) {
                    System.out.print("Masukkan jumlah pakan yang diberikan : ");
                    jumlahPakan = input.nextInt();
                    input.nextLine();

                    boolean pakanDitemukan = false;
                    for (StokPakan stok : stokPakan.stokPakan) {
                        if (stok.getJenisPakan().equalsIgnoreCase("Pakan Ayam")) {
                            pakanDitemukan = true;
                            if (stok.getJumlahPakan() < jumlahPakan) {
                                System.out.println("Stok pakan tidak cukup \n");
                            } else {
                                stok.kurangiPakan(jumlahPakan);
                                ayam.beriMakan(jumlahPakan);
                            }
                            break;
                        }
                    }
                    if (!pakanDitemukan) {
                        System.out.println("Stok pakan tidak tersedia\n");
                    }
                } else if (pilMakan.equalsIgnoreCase("Kambing")) {
                    System.out.print("Masukkan jumlah pakan yang diberikan : ");
                    jumlahPakan = input.nextInt();
                    input.nextLine();

                    boolean pakanDitemukan = false;
                    for (StokPakan stok : stokPakan.stokPakan) {
                        if (stok.getJenisPakan().equalsIgnoreCase("Pakan Kambing")) {
                            pakanDitemukan = true;
                            if (stok.getJumlahPakan() < jumlahPakan) {
                                System.out.println("Stok pakan tidak cukup \n");
                            } else {
                                stok.kurangiPakan(jumlahPakan);
                                kambing.beriMakan(jumlahPakan);
                            }
                            break;
                        }
                    }
                    if (!pakanDitemukan) {
                        System.out.println("Stok pakan tidak tersedia\n");
                    }
                }
            }
        } while (pilihan != 10);

        input.close();
    }
}
