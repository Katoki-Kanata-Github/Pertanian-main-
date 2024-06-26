/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Petani;

/**
 *
 * @author Muhammad Maulidi
 */
public class Tanaman {
    String id_tanaman, nama_tanaman;
    
    
     // constructor
    public Tanaman(String id, String tanam){
        this.id_tanaman = id;
        this.nama_tanaman = tanam;
    }
    
    public void inputIdTanaman(String id){
        this.id_tanaman = id;
    }
    public String ambilIdTanaman(){
        return this.id_tanaman;
    }
    
    public void inputNamaTanaman(String tanam){
        this.nama_tanaman = tanam;
    }
    public String ambilNamaTanaman(){
        return this.nama_tanaman;
    }
   
}
