import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pekerja pekerja = new Pekerja(1, "nama", "tugas", "kontak");
        StokPakan stokPakan = new StokPakan("JenisPakan", 10, new java.util.Date());

        int pilihan;

        do {
            System.out.println("Selamat datang di Aplikasi Manajemen Hewan");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Data Hewan");
            System.out.println("3, Ubah Data Hewan");
            System.out.println("4. Tambah Pekerja");
            System.out.println("5. Tambah Stok Pakan");
            System.out.println("6. Data Pakan");
            System.out.println("7. Laporan Harian Pekerja");
            System.out.println("8. Laporan Produksi");
            System.out.println("9. Keluar");
            System.out.print("Masukkan pilihan anda : ");

            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.println("====Tambah Hewan====");

            }
            if (pilihan == 2) {
                System.out.println("====Data Hewan====");

            }

            if (pilihan == 3) {
                System.out.println("====Ubah Data Hewan====");

            }

            if (pilihan == 4) {
                System.out.println("\n====Tambah Pekerja====");
                pekerja.tambahData();
            }

            if (pilihan == 5) {
                System.out.println("====Tambah Stok Pakan====");
                stokPakan.tambahData();
            }

            if (pilihan == 6) {
                System.out.println("====Data Pakan====");
                stokPakan.laporanStokPakan();
            }

            if (pilihan == 7) {
                System.out.println("\n====Laporan Pekerja====");
                pekerja.laporanTugasHarian();
            }
            if (pilihan == 8) {
                System.out.println("Pilihan 5 dipilih");

            }

        } while (pilihan != 8);

        input.close();
    }
}
