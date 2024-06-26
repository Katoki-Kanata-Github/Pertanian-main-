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
/**
 *
 * @author Muhammad Maulidi
 */
public class DatabaseLahan {
    private String databaseName = "2210010663_pertanian";
    private String username = "root";
    private String password = "";
    public static Connection connectionDB;
    
    // Constructor
    public DatabaseLahan(){
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
    public void simpanlahan(String id_lahan, String nama_lahan, int luas_lahan){
        try {
            String sql = "insert into lahan (id_lahan, nama_lahan, luas_lahan) value(?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id_lahan);
            perintah.setString(2, nama_lahan);
            perintah.setInt(3, luas_lahan);
            perintah.executeUpdate();
            System.out.println("Data berhasil di Simpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahlahan(String id_lahan, String nama_lahan, int luas_lahan){
        try {
            String sql = "update lahan set nama_lahan = ?, luas_lahan = ? where id_lahan = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_lahan);
            perintah.setInt(2, luas_lahan);
            perintah.setString(3, id_lahan);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil di Ubah ");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapuslahan(String id){
        try {
            String sql = "delete from lahan where id_lahan = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil di Hapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        
        }
    }
}
