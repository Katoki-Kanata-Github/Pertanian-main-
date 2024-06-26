/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Petani;
import java.sql.Date;
import java.sql.Time;
/**
 *
 * @author Muhammad Maulidi
 */
public class Panen {
    String id_panen, id_tanaman, nama_panen, jumlah_panen;
    Date tanggal;
    Time waktu;

    public Panen(String idp, String idt, String nm_pn, String jmlh, Date tgl, Time waktu){
        this.id_panen = idp;
        this.id_tanaman = idt;
        this.nama_panen= nm_pn;
        this.jumlah_panen = jmlh;
        this.tanggal = tgl;
        this.waktu = waktu;
    }
    
    public void inputIdPanen(String idp){
        this.id_panen = idp;
    }
    public String ambilIdPanen(){
        return this.id_panen;
    }
    
    public void inputIdTanaman(String idt){
        this.id_panen = idt;
    }
    public String ambilIdTanaman(){
        return this.id_panen;
    }
    
    public void inputNamaPanen(String nm_obt){
        this.nama_panen = nm_obt;
    }
    public String ambilNamaPanen(){
        return this.nama_panen;
    }
    
    public void inputJumlahPanen(String jenis){
        this.jumlah_panen = jenis;
    }
    public String ambilJumlahPanen(){
        return this.jumlah_panen;
    }
    
    public void inputTanggal(Date tgl){
        this.tanggal = tgl;
    }
    public Date ambilTanggal(){
        return this.tanggal;
    }
    
    public void inputWaktu(Time waktu){
        this.waktu = waktu;
    }
    public Time ambilWaktu(){
        return this.waktu;
    }
}
