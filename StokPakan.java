public class StokPakan implements Manajemen{
    private String JenisPakan;
    private int JumlahPakan;
    private Date TanggalKadaluarsa;

    public StokPakan(String JenisPakan, int JumlahPakan, Date TanggalKadaluarsa) {
        this.JenisPakan = JenisPakan;
        this.JumlahPakan = JumlahPakan;
        this.TanggalKadaluarsa = TanggalKadaluarsa;
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

    @Override
    public void hapusData() {
        
    }

    @Override
    public void perbaruiData() {
        System.out.println("data berhasil di perbarui");
    }

    @Override
    public void tambahData() {
        System.out.println("data berhasil di tambahkan");
        
    }
}