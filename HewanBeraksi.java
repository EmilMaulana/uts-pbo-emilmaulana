/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class HewanBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = scanner.nextLine();

        Hewan hewan;

        // Membuat objek sesuai dengan input pengguna
        if (jenisHewan.equalsIgnoreCase("Kucing")) {
            hewan = new Kucing();
        } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
            hewan = new Anjing();
        } else {
            System.out.println("Jenis hewan tidak valid.");
            return;
        }

        // Memanggil metode bersuara
        hewan.bersuara();

        // Mengecek apakah hewan adalah mamalia atau bukan
        if (hewan instanceof Kucing || hewan instanceof Anjing) {
            System.out.println("Hewan ini adalah mamalia.");
        } else {
            System.out.println("Hewan ini bukan mamalia.");
        }
    }
    
}
