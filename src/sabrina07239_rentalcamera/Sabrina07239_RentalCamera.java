package sabrina07239_rentalcamera;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Sabrina07239_RentalCamera {
    static ArrayList<Sabrina07239_PetugasEntity>dataPetugas = new ArrayList();
    static ArrayList<Sabrina07239_PelangganEntity>dataPelanggan = new ArrayList();
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Data Rental");
        viewMenu();
    }
    
    static void viewMenu(){
        int pil;
        DataPetugas();
        do{
            System.out.println("Pilihan : ");
            System.out.println("1. Input Data : ");
            System.out.println("2. Lihat Data : ");
            System.out.println("3. Ubah Data : ");
            System.out.println("4. Hapus Data : ");
            System.out.println("5. Exit");
            System.out.print("Pilih : ");
            pil=input.nextInt();
            
            switch(pil){
                case 1:
                    addPelanggan();
                    System.out.print("");
                    break;
                case 2:
                    viewListPelanggan();
                    System.out.print("");
                    break;
                case 3:
                    if(dataPelanggan.size()>0){
                        for(int i=0; i<dataPelanggan.size(); i++){
                            System.out.println(i+". ID Pelanggan : "+dataPelanggan.get(i).getId_Pelanggan());
                        }
                        System.out.print("");
                        System.out.print("Pilih Index : ");
                        int selectIndex = input.nextInt();
                        
                        editPelanggan(selectIndex);
                    }else{
                        System.out.println("Data Kosong");
                    }
                    break;
                case 4:
                    if(dataPelanggan.size()>0){
                        for(int i=0; i<dataPelanggan.size(); i++){
                            System.out.println(i+". ID Pelanggan : "+dataPelanggan.get(i).getId_Pelanggan());
                        }
                        System.out.print("");
                        System.out.print("Pilih Index : ");
                        int selectIndex = input.nextInt();
                        
                        deletePelanggan(selectIndex);
                    }else{
                        System.out.println("Data Petugas Kosong");
                    }
                    break;
            }
        }while(pil!=5);
        
    }
    
    static void addPelanggan(){
        System.out.print("Input ID Pelanggan : ");
        String Sabrina07239_id_pelanggan = input.next();
        System.out.print("Input Nama Pelanggan : ");
        String Sabrina07239_nama = input.next();
        System.out.print("Input Notelp Pelanggan : ");
        String Sabrina07239_notelp = input.next();
        System.out.print("Input Tanggal Peminjaman Kamera (mm/dd/yyyy) = ");
        Date Sabrina07239_tglpinjam = new Date(input.next());
        System.out.print("Input Tanggal Pengembalian Kamera (mm/dd/yyyy) = ");
        Date Sabrina07239_tglkembali = new Date(input.next());
        
        for(int i=0; i<Sabrina07239_KameraEntity.Sabrina07239_CAMERA_CANON.length;i++){
        System.out.println(i+". "+Sabrina07239_KameraEntity.Sabrina07239_CAMERA_CANON[i]);
        }
        System.out.print("Pilih Kamera = ");
        int Sabrina07239_indexkamera = input.nextInt();
        
        for(int i=0; i<dataPetugas.size();i++){
        System.out.println(i+"."+dataPetugas.get(i).Sabrina07239_nama);
        }        
        System.out.print("Petugas Rental = ");
        int Sabrina07239_indexpetugas = input.nextInt();
        
        dataPelanggan.add(new Sabrina07239_PelangganEntity(Sabrina07239_id_pelanggan,Sabrina07239_nama,Sabrina07239_notelp,Sabrina07239_tglpinjam,Sabrina07239_tglkembali,Sabrina07239_indexkamera,Sabrina07239_indexpetugas));
        System.out.println("Data berhasil disimpan");
        System.out.println("");
    }
    
    static void viewListPelanggan(){
        if(dataPelanggan.size()>0){
            for(int i=0; i<dataPelanggan.size(); i++){
                System.out.println(i+". ID = "+dataPelanggan.get(i).getId_Pelanggan());
                System.out.println(i+". Nama = "+dataPelanggan.get(i).getNama());
                System.out.println(i+". Notelp = "+dataPelanggan.get(i).getNoTelp());
                System.out.println(i+". Kamera yang Dipinjam = "+Sabrina07239_KameraEntity.Sabrina07239_CAMERA_CANON[dataPelanggan.get(i).Sabrina07239_indexkamera]);
                System.out.println(i+". Tanggal Peminjaman Kamera (dd/mm/yyyy) = "+new SimpleDateFormat("dd-MM-yyyy").format(dataPelanggan.get(i).getTglPinjam()));
                System.out.println(i+". Tanggal Pengembalian Kamera (dd/mm/yyyy) = "+new SimpleDateFormat("dd-MM-yyyy").format(dataPelanggan.get(i).getTglKembali()));
                System.out.println(i+". Petugas Rental = "+dataPetugas.get(dataPelanggan.get(i).Sabrina07239_indexpetugas).getNama());
            }
        }else{
            System.out.println("Data kosong");
        }
    }
    
    static void editPelanggan(int index){
        System.out.print("Input ID Pelanggan : ");
        String Sabrina07239_id_pelanggan = input.next();
        System.out.print("Input Nama Pelanggan : ");
        String Sabrina07239_nama = input.next();
        System.out.print("Input Notelp Pelanggan : ");
        String Sabrina07239_notelp = input.next();
        System.out.print("Input Tanggal Peminjaman Kamera (mm/dd/yyyy) = ");
        Date Sabrina07239_tglpinjam = new Date(input.next());
        System.out.print("Input Tanggal Pengembalian Kamera (mm/dd/yyyy) = ");
        Date Sabrina07239_tglkembali = new Date(input.next());
        
        for(int i=0; i<Sabrina07239_KameraEntity.Sabrina07239_CAMERA_CANON.length;i++){
        System.out.println(i+". "+Sabrina07239_KameraEntity.Sabrina07239_CAMERA_CANON[i]);
        }
        System.out.print("Pilih Kamera = ");
        int Sabrina07239_indexkamera = input.nextInt();
        
        for(int i=0; i<dataPetugas.size();i++){
        System.out.println(i+"."+dataPetugas.get(i).Sabrina07239_nama);
        }        
        System.out.print("Petugas Rental = ");
        int Sabrina07239_indexpetugas = input.nextInt();
        
        dataPelanggan.set(index,new Sabrina07239_PelangganEntity(Sabrina07239_id_pelanggan,Sabrina07239_nama,Sabrina07239_notelp,Sabrina07239_tglpinjam,Sabrina07239_tglkembali,Sabrina07239_indexkamera,Sabrina07239_indexpetugas));
        System.out.println("Data berhasil diubah");
        System.out.println("");
    }
    
    static void deletePelanggan(int index){
        dataPelanggan.remove(index);
        System.out.println("Data berhasil dihapus");
    }
    
    static void DataPetugas(){
    String Sabrina07239_id_petugas [] = {"01","02","03"};
    String Sabrina07239_nama [] = {"ASTRID","SABRINA","ALEX"};
    String Sabrina07239_notelp [] = {"01","02","03"};
    for(int i=0;i<Sabrina07239_id_petugas.length;i++){
    dataPetugas.add(new Sabrina07239_PetugasEntity(Sabrina07239_id_petugas[i],Sabrina07239_nama[i],Sabrina07239_notelp[i]));
        }
    }
}
