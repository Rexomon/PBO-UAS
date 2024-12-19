import java.util.Scanner;

public class Kambing extends Hewan {
    Scanner input = new Scanner(System.in);

    public Kambing(String namaHewan, String jenisHewan, String statusKesehatan, int umurHewan) {
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

        dataHewan.add(new Kambing(namaHewan, jenisHewan, statusKesehatan, umurHewan));
    }

    public void beriMakan(int jumlahMakanan) {
        System.out.println("Kambing diberi makan " + jumlahMakanan + " kg rumput\n");
    }

    public void dataHewan() {
        for (Hewan hewan : dataHewan) {
            System.out.println(
                    "Nama Hewan: " + hewan.getNamaHewan() + "\nJenis Hewan: " + hewan.getJenisHewan() + "\nUmur Hewan: "
                            + hewan.getUmurHewan() + " Tahun\n");
        }
    }
}
