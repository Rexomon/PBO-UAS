import java.util.ArrayList;
import java.util.Scanner;

public class Pekerja implements Manajemen {
    Scanner input = new Scanner(System.in);

    private ArrayList<Pekerja> dataPekerja = new ArrayList<Pekerja>();
    private int idPekerja;
    private String namaPekerja;
    private String tugasHarian;
    private String kontak;

    public Pekerja(int idPekerja, String namaPekerja, String tugasHarian, String kontak) {
        this.idPekerja = idPekerja;
        this.namaPekerja = namaPekerja;
        this.tugasHarian = tugasHarian;
        this.kontak = kontak;
    }

    @Override
    public void hapusData() {

    }

    @Override
    public void perbaruiData() {
        System.out.println("data berhasil di perbarui");
    }

    @Override
    public void tambahData() {
        System.out.print("Masukkan id pekerja : ");
        idPekerja = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan nama pekerja : ");
        namaPekerja = input.nextLine();
        System.out.print("Masukkan tugas harian pekerja : ");
        tugasHarian = input.nextLine();
        System.out.print("Masukkan kontak pekerja : ");
        kontak = input.nextLine();
        System.out.print("\n");

        dataPekerja.add(new Pekerja(idPekerja, namaPekerja, tugasHarian, kontak));
    }

    public void laporanTugasHarian() {
        for (Pekerja pekerja : dataPekerja) {
            System.out.println("ID Pekerja : " + pekerja.getIdPekerja());
            System.out.println("Nama Pekerja : " + pekerja.getNamaPekerja());
            System.out.println("Tugas Harian : " + pekerja.getTugasHarian());
            System.out.println("Kontak : " + pekerja.getKontak() + "\n");
        }
    }

    public int getIdPekerja() {
        return idPekerja;
    }

    public String getNamaPekerja() {
        return namaPekerja;
    }

    public String getTugasHarian() {
        return tugasHarian;
    }

    public String getKontak() {
        return kontak;
    }

}