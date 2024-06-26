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
public class Database {
    private String databaseName = "2210010663_pertanian";
    private String username = "root";
    private String password = "";
    public static Connection connectionDB;
    
    // Constructor
    public Database(){
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
    
    public void simpanpetani(String id_petani, String nama_petani, String alamat_petani, String no_hp){
        try {
            String sql = "insert into petani(id_petani, nama_petani, alamat_petani, no_hp) value(?, ?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id_petani);
            perintah.setString(2, nama_petani);
            perintah.setString(3, alamat_petani);
            perintah.setString(4, no_hp);
            perintah.executeUpdate();
            System.out.println("Data berhasil di Simpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahpetani(String id_petani, String nama_petani, String alamat_petani, String no_hp){
        try {
            String sql = "update petani set nama_petani = ?, alamat_petani = ?, no_hp = ? where id_petani = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_petani);
            perintah.setString(2, alamat_petani);
            perintah.setString(3, no_hp);
            perintah.setString(4, id_petani);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil di Ubah ");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapuspetani(String id){
        try {
            String sql = "delete from petani where id_petani = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil di Hapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        
        }
    }
    
    
 }  


