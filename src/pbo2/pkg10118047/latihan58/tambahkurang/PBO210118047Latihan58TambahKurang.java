/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118047.latihan58.tambahkurang;

/**
 *
 * @author 
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class PBO210118047Latihan58TambahKurang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JumlahBilangan jml = new JumlahBilangan();
        int hasiljml = jml.getX()+jml.getY();
        System.out.println("Hasil Penjumlahan : "+hasiljml);
        
        SelisihBilangan sls = new SelisihBilangan();
        int hasilsls = sls.getX()-sls.getY();
        System.out.println("Hasil Selisih "+sls.getX()+"-"+sls.getY()+" : " + hasilsls);
    }
    
}
