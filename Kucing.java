/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author ASUS
 */
public class Kucing extends Hewan {
    public Kucing() {
        super("Meong");
    }

    // Override metode bersuara
    @Override
    public void bersuara() {
        System.out.println("Suara kucing: " + jenisSuara);
    }
}
