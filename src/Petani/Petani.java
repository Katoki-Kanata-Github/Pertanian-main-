/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Petani;

/**
 *
 * @author Muhammad Maulidi
 */
public class Petani {
    String id_petani, nama_petani, alamat_petani, no_hp;
    
    //constructor
    public Petani(String id, String nama, String alamat, String no){
        this.id_petani = id;
        this.nama_petani = nama;
        this.alamat_petani = alamat;
        this.no_hp = no;
    }
    
    // getter methods
    public void inputIdPetani(String id){
        this.id_petani = id;
    }
    public String ambilIdPetani(){
        return this.id_petani;
    }
    
    public void inputNamaPetani(String nama){
        this.nama_petani = nama;
    }
    public String ambilNamaPetani(){
        return this.nama_petani;
    }
    
    public void inputAlamatPetani(String alamat){
        this.alamat_petani = alamat;
    }
    public String ambilAlamatPetani(){
        return this.alamat_petani;
    }
    
    public void inputNoHp(String no){
        this.no_hp = no;
    }
    public String ambilNoHp(){
        return this.no_hp;
    }
    
    // Metode untuk menampilkan informasi petani
    @Override
    public String toString() {
        return "Petani{" +
                "idPetani=" + id_petani +
                ", namaPetani='" + nama_petani + '\'' +
                ", alamatPetani='" + alamat_petani + '\'' +
                ", nohp='" + no_hp + '\'' +
                '}';
    }
}