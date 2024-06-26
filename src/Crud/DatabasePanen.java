/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crud;
import Petani.*;
import java.sql.Connection; // menambahkan connection
import java.sql.DriverManager; //  menghubungkan database
import java.sql.PreparedStatement; // perintah sql
import java.sql.SQLException;
import java.util.Date;
/**
 *
 * @author Muhammad Maulidi
 */
public class DatabasePanen {
    private String databaseName = "2210010663_pertanian";
    private String username = "root";
    private String password = "";
    public static Connection connectionDB;
    
    // Constructor
    public DatabasePanen(){
        try {
            String location = "jdbc:mysql://localhost/"+ databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            connectionDB = DriverManager.getConnection(location, username, password);
            System.out.println("database terkoneksi");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }
    public void simpanpanen(String id_panen, String id_tanaman, String nama_panen, String jumlah_panen, Date tanggal){
        try {
            String sql = "insert into panen (id_panen, id_tanaman, nama_panen, jumlah_panen, tanggal) value(?, ?, ?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id_panen);
            perintah.setString(2, id_tanaman);
            perintah.setString(3, nama_panen);
            perintah.setString(4, jumlah_panen);
            perintah.setDate(5, new java.sql.Date(tanggal.getTime()));
            perintah.executeUpdate();
            System.out.println("Data berhasil di Simpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahpanen(String id_panen, String id_tanaman, String nama_panen, String jumlah_panen, Date tanggal){
        try {
            String sql = "update panen set id_tanaman = ?, nama_panen = ?, jumlah_panen = ?, tanggal = ? where id_panen = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id_tanaman);
            perintah.setString(2, nama_panen);
            perintah.setString(3, jumlah_panen);
            perintah.setDate(4, new java.sql.Date(tanggal.getTime()));
            perintah.setString(5, id_panen);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil di Ubah ");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapuspanen(String id){
        try {
            String sql = "delete from panen where id_panen = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil di Hapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        
        }
    }
}
