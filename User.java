/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class User extends Pengguna {
    public User(String nama, String username, String password) {
        super(nama, username, password);
    }

    @Override
    public void lihatBuku(ArrayList<Buku> daftarBuku) {
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println("Judul: " + buku.getJudul() + ", Penulis: " + buku.getPenulis() + ", Genre: " + buku.getGenre());
        }
    }
}
