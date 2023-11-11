/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Admin extends Pengguna{
    public Admin(String nama, String username, String password) {
        super(nama, username, password);
    }

    public void tambahBuku(ArrayList<Buku> daftarBuku, String judul, String penulis, String genre) {
        Buku bukuBaru = new Buku(judul, penulis, genre);
        daftarBuku.add(bukuBaru);
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void hapusBuku(ArrayList<Buku> daftarBuku, String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                daftarBuku.remove(buku);
                System.out.println("Buku berhasil dihapus.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    @Override
    public void lihatBuku(ArrayList<Buku> daftarBuku) {
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println("Judul: " + buku.getJudul() + ", Penulis: " + buku.getPenulis() + ", Genre: " + buku.getGenre());
        }
    }
}
