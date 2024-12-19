import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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
    public void hapusData() {

    }

    @Override
    public void perbaruiData() {
        System.out.println("data berhasil di perbarui");
    }

    @Override
    public void tambahData() {
        System.out.print("Masukkan jenis pakan : ");
        JenisPakan = input.nextLine();
        System.out.print("Masukkan jumlah pakan : ");
        JumlahPakan = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan tanggal kadaluarsa (dd-MM-yyyy) : ");
        String tanggal = input.nextLine();
        try {
            TanggalKadaluarsa = new SimpleDateFormat("dd-MM-yyyy").parse(tanggal);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("\n");

        stokPakan.add(new StokPakan(JenisPakan, JumlahPakan, TanggalKadaluarsa));
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
        for (StokPakan stok : stokPakan) {
            System.out.println("Jenis Pakan : " + stok.getJenisPakan());
            System.out.println("Jumlah Pakan : " + stok.getJumlahPakan());
            System.out.println("Tanggal Kadaluarsa : " + stok.getTanggalKadaluasa() + "\n");
        }
    }

    public String getJenisPakan() {
        return JenisPakan;
    }

    public int getJumlahPakan() {
        return JumlahPakan;
    }

    public Date getTanggalKadaluasa() {
        return TanggalKadaluarsa;
    }

}
