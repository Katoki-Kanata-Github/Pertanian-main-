/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crud;
import Petani.Tanaman;
import java.sql.Connection; // menambahkan connection
import java.sql.DriverManager; //  menghubungkan database
import java.sql.PreparedStatement; // perintah sql
import java.sql.SQLException;
/**
 *
 * @author Muhammad Maulidi
 */
public class DatabaseTanaman {
    private String databaseName = "2210010663_pertanian";
    private String username = "root";
    private String password = "";
    public static Connection connectionDB;
    
    // Constructor
    public DatabaseTanaman(){
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
    public void simpantanaman(String id_tanaman, String nama_tanaman){
        try {
            String sql = "insert into tanaman (id_tanaman, nama_tanaman) value(?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id_tanaman);
            perintah.setString(2, nama_tanaman);
            perintah.executeUpdate();
            System.out.println("Data berhasil di Simpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahtanaman(String id_tanaman, String nama_tanaman){
        try {
            String sql = "update tanaman set nama_lahan = ? where id_tanaman = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_tanaman);
            perintah.setString(2, id_tanaman);
            perintah.executeUpdate();
            System.out.println("Data berhasil di Ubah ");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapustanaman(String id){
        try {
            String sql = "delete from tanaman where id_tanaman = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil di Hapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        
        }
    }
}
