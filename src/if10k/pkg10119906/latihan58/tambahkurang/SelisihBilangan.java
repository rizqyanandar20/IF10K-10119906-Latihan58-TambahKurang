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
public class SelisihBilangan extends Bilangan{

    public SelisihBilangan(int x, int y) {
        super(x, y);
    }

    public void tampilSelisih(){
        System.out.println("Hasil Selisih 3 - 4 = " + (getX() - getY()));
    }
}
