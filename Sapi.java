import java.util.Scanner;

public class Sapi extends Hewan {
    Scanner input = new Scanner(System.in);

    public Sapi(String namaHewan, String jenisHewan, String statusKesehatan, int umurHewan) {
        super(namaHewan, jenisHewan, statusKesehatan, umurHewan);
    }

    public void tambahDataHewan() {
        System.out.print("Masukkan nama hewan: ");
        String namaHewan = input.nextLine();
        System.out.print("Masukkan jenis hewan: ");
        String jenisHewan = input.nextLine();
        System.out.print("Masukkan status kesehatan hewan: ");
        String statusKesehatan = input.nextLine();
        System.out.print("Masukkan umur hewan: ");
        int umurHewan = input.nextInt();
        input.nextLine();
        System.out.print("\n");

        dataHewan.add(new Sapi(namaHewan, jenisHewan, statusKesehatan, umurHewan));
    }

    public void ubahDataHewan() {
        System.out.print("Masukkan nama hewan yang ingin diubah: ");
        String namaHewan = input.nextLine();
        System.out.print("Masukkan status kesehatan baru: ");
        String statusKesehatan = input.nextLine();
        System.out.print("Masukkan umur hewan baru: ");
        int umurHewan = input.nextInt();
        input.nextLine();
        System.out.print("\n");

        for (Hewan hewan : dataHewan) {
            if (hewan.getNamaHewan().equalsIgnoreCase(namaHewan)) {
                hewan.setUmurHewan(umurHewan);
                hewan.setStatusKesehatan(statusKesehatan);
                System.out.println("Status kesehatan hewan berhasil diubah.");
                return;
            }
        }

        System.out.println("Hewan tidak ditemukan.");
    }

    public void beriMakan(int jumlahMakanan) {
        System.out.println("Sapi diberi makan " + jumlahMakanan + " kg rumput\n");

    }

    public void dataHewan() {

        for (Hewan hewan : dataHewan) {
            System.out.println(
                    "Nama Hewan: " + hewan.getNamaHewan() + "\nJenis Hewan: " + hewan.getJenisHewan() + "\nUmur Hewan: "
                            + hewan.getUmurHewan() + " Tahun\n" + "Status Kesehatan: " + hewan.getStatusKesehatan()
                            + "\n");
        }
    }

    public void produksiSapi(LaporanProduksi laporanProduksi) {
        System.out.print("Masukkan nama sapi: ");
        String namaHewan = input.nextLine();

        boolean isFound = false;
        for (Hewan hewan : dataHewan) {
            if (hewan.getNamaHewan().equalsIgnoreCase(namaHewan)) {
                isFound = true;
                System.out.print("Masukkan Jenis Produksi (Susu/Daging): ");
                String jenisProduksi = input.nextLine();

                if (jenisProduksi.equalsIgnoreCase("susu")) {
                    System.out.print("Masukkan jumlah produksi susu: ");
                    int jumlahProduksi = input.nextInt();
                    input.nextLine();

                    Produksi produksi = new Produksi(jenisProduksi, jumlahProduksi);
                    laporanProduksi.tambahHasilProduksi(produksi);

                    System.out.print("Masukkan alamat pembeli: ");
                    String alamat = input.nextLine();
                    laporanProduksi.tambahAlamatPembeli(alamat);

                    System.out.print("\n");

                    laporanProduksi.tampilkanLaporan();

                } else if (jenisProduksi.equalsIgnoreCase("daging")) {
                    System.out.print("Masukkan jumlah produksi daging: ");
                    int jumlahProduksi = input.nextInt();
                    input.nextLine();

                    Produksi produksi = new Produksi(jenisProduksi, jumlahProduksi);
                    laporanProduksi.tambahHasilProduksi(produksi);

                    System.out.print("Masukkan alamat pembeli: ");
                    String alamat = input.nextLine();
                    laporanProduksi.tambahAlamatPembeli(alamat);

                    System.out.print("\n");

                laporanProduksi.tampilkanLaporan();
                } else {
                    System.out.println("Jenis produksi tidak ditemukan.");
                }
            }
        }

        if (!isFound) {
            System.out.println("Nama hewan tersebut tidak ditemukan. \n");
        }
    }

}
