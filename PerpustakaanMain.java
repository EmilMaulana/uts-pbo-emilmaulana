/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author ASUS
 */
public class PerpustakaanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        // Membuat admin dan user
        Admin admin = new Admin("Admin1", "admin", "adminpass");
        User user = new User("User1", "user", "userpass");

        Map<String, Pengguna> penggunaMap = new HashMap<>();
        penggunaMap.put(admin.username, admin);
        penggunaMap.put(user.username, user);

        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        Pengguna pengguna = penggunaMap.get(inputUsername);

        if (pengguna != null && pengguna.autentikasi(inputUsername, inputPassword)) {
            int pilihan;

            do {
                System.out.println("\nMenu:");
                System.out.println("1. Tambah Buku (Admin Only)");
                System.out.println("2. Lihat Buku");
                System.out.println("3. Hapus Buku (Admin Only)");
                System.out.println("0. Keluar");

                System.out.print("Masukkan pilihan: ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline dari buffer

                switch (pilihan) {
                    case 1:
                        if (pengguna instanceof Admin) {
                            System.out.print("Masukkan judul buku: ");
                            String judul = scanner.nextLine();
                            System.out.print("Masukkan penulis buku: ");
                            String penulis = scanner.nextLine();
                            System.out.print("Masukkan genre buku: ");
                            String genre = scanner.nextLine();
                            admin.tambahBuku(daftarBuku, judul, penulis, genre);
                        } else {
                            System.out.println("Anda bukan admin. Tidak dapat menambah buku.");
                        }
                        break;

                    case 2:
                        pengguna.lihatBuku(daftarBuku);
                        break;

                    case 3:
                        if (pengguna instanceof Admin) {
                            System.out.print("Masukkan judul buku yang ingin dihapus: ");
                            String judulHapus = scanner.nextLine();
                            admin.hapusBuku(daftarBuku, judulHapus);
                        } else {
                            System.out.println("Anda bukan admin. Tidak dapat menghapus buku.");
                        }
                        break;

                    case 0:
                        System.out.println("Keluar dari program.");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }

            } while (pilihan != 0);

        } else {
            System.out.println("Username atau password salah. Keluar dari program.");
        }

        scanner.close();
    }
    
}
