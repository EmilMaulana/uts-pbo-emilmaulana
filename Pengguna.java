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
abstract class Pengguna {
    protected String nama;
    protected String username;
    protected String password;

    public Pengguna(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public abstract void lihatBuku(ArrayList<Buku> daftarBuku);

    public boolean autentikasi(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
}
