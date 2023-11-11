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
public class Buku {
    private String judul;
    private String penulis;
    private String genre;

    public Buku(String judul, String penulis, String genre) {
        this.judul = judul;
        this.penulis = penulis;
        this.genre = genre;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getGenre() {
        return genre;
    }
}
