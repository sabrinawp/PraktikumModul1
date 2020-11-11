package sabrina07239_rentalcamera;

public class Sabrina07239_PetugasEntity {
    String Sabrina07239_id_anggota,Sabrina07239_nama,Sabrina07239_notelp;
    
    public Sabrina07239_PetugasEntity(String Sabrina07239_id_anggota,String Sabrina07239_nama,String Sabrina07239_notelp){
        this.Sabrina07239_id_anggota=Sabrina07239_id_anggota;
        this.Sabrina07239_nama=Sabrina07239_nama;
        this.Sabrina07239_notelp=Sabrina07239_notelp;
    }
    
    String getId_Anggota(){
        return this.Sabrina07239_id_anggota;
    }
    String getNama(){
        return this.Sabrina07239_nama;
    }
    String getNoTelp(){
        return this.Sabrina07239_notelp;
    }
}
