public class Pekerja implements Manajemen {
    private int idPekerja;
    private String namaPekerja;
    private String tugasHarian;
    private String kontak;

    

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

    public void tugasHarian(){
        System.out.println("tugas harian pekerja adalah : " + tugasHarian);
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