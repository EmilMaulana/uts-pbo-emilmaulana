/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author ASUS
 */
public class Anjing extends Hewan {
    public Anjing() {
        super("Guk Guk");
    }

    // Override metode bersuara
    @Override
    public void bersuara() {
        System.out.println("Suara anjing: " + jenisSuara);
    }
}
