/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12_10116508_latihanuts5;

/**
 *
 * @author Harrid Alfasya
 */
public class PBO12_10116508_LATIHANUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jajargenjang jg = new Jajargenjang(50,60,70,80,100,120);
        Segitiga s3 = new Segitiga(50,60,70,100,120);
        
        jg.hitungKeliling();
        jg.hitungLuas();
        s3.hitungKeliling();
        s3.hitungLuas();
    }
    
}
