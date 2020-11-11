package sabrina07239_rentalcamera;
import java.util.Date;

public class Sabrina07239_PelangganEntity {
    String Sabrina07239_id_pelanggan,Sabrina07239_nama,Sabrina07239_notelp;
    Date Sabrina07239_tglpinjam, Sabrina07239_tglkembali;
    int Sabrina07239_indexkamera;
    int Sabrina07239_indexpetugas;
    
    public Sabrina07239_PelangganEntity(String Sabrina07239_id_pelanggan,String Sabrina07239_nama,String Sabrina07239_notelp,Date Sabrina07239_tglpinjam, Date Sabrina07239_tglkembali,int Sabrina07239_indexkamera,int Sabrina07239_indexpetugas){
        this.Sabrina07239_id_pelanggan=Sabrina07239_id_pelanggan;
        this.Sabrina07239_nama=Sabrina07239_nama;
        this.Sabrina07239_notelp=Sabrina07239_notelp;
        this.Sabrina07239_tglpinjam=Sabrina07239_tglpinjam;
        this.Sabrina07239_tglkembali=Sabrina07239_tglkembali;
        this.Sabrina07239_indexkamera= Sabrina07239_indexkamera;
        this.Sabrina07239_indexpetugas= Sabrina07239_indexpetugas;
    }
    
    String getId_Pelanggan(){
        return this.Sabrina07239_id_pelanggan;
    }
    String getNama(){
        return this.Sabrina07239_nama;
    }
    String getNoTelp(){
        return this.Sabrina07239_notelp;
    }
    int getIndexKamera(){
        return Sabrina07239_indexkamera;
    }
    Date getTglPinjam(){
        return this.Sabrina07239_tglpinjam;
    }
    Date getTglKembali(){
        return this.Sabrina07239_tglkembali;
    }
    int getIndexPetugas(){
        return Sabrina07239_indexpetugas;
    }
}
