/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan58.tambahkurang;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class JumlahBilangan extends Bilangan{

    public JumlahBilangan(int x, int y) {
        super(x, y);
    }
   
    public void tampilHasilJumlah(){
        System.out.println("Hasil Perjumlahan = " + (getX()+getY()));
    }
}
