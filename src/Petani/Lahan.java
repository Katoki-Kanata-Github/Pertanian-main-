/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Petani;

/**
 *
 * @author Muhammad Maulidi
 */
public class Lahan {

    String  id_lahan, nama_lahan;
    int luas_lahan;
    
    
    // constructor
    public Lahan(String id, String nm_lhn, int luas_lhn){
        this.id_lahan = id;
        this.nama_lahan = nm_lhn;
        this.luas_lahan = luas_lhn;
    }
    
    public void inputIdLahan(String id){
        this.id_lahan = id;
    }
    public String ambilIdLahan(){
        return this.id_lahan;
    }
    
    public void inputNamaLahan(String nm_lhn){
        this.nama_lahan = nm_lhn;
    }
    public String ambilNamaLahan(){
        return this.nama_lahan;
    }
    
   // Getter dan Setter untuk idLahan
    public int getLuasLahan() {
        return this.luas_lahan;
    }
    public void setLuaslahan(int luaslahan){
        this.luas_lahan= luaslahan;
    }
    
    @Override
    public String toString() {
        return "Lahan{" +
                "idLahan=" + id_lahan +
                ", namaLahan='" + nama_lahan + '\'' +
                ", luasLahan=" + luas_lahan +
                '}';
    }
}
