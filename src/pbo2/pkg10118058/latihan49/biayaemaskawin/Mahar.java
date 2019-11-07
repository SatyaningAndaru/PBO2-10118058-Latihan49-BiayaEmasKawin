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
class Mahar {
    private double emas;

    public Mahar(double emas) {
        this.emas = emas;
    }
    
    

    public double getEmas() {
        return emas;
    }

    public void setEmas(double emas) {
        this.emas = emas;
    }
    public int totalBayar(int total){
      return  total = (int) (emas*15.7);
    }
}
