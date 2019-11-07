/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan49.biayaemaskawin;

/**
 *
 * @author user
 */
public class PBO210118058Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     * Nama:Satyaning Andaru bawalaksana
     * Nim: 10118058
     * kelas : If-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahar m = new Mahar(570000);
        System.out.println("Harga Emas Seberat 1 Gram : "+m.getEmas());
        System.out.println("Harga Total Emas 15,7 Gram : "+m.totalBayar(0));
    }
    
}
