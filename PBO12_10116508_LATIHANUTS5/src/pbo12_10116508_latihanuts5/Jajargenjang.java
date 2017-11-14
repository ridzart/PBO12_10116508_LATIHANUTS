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
public class Jajargenjang implements BangunDatar{
    
    private int luas;
    private int keliling;
    private final int sisiAb;
    private final int sisiBc;
    private final int sisiCd;
    private final int sisiDa;
    private final int alas;
    private final int tinggi;
    
    public Jajargenjang(int ab, int bc, int cd, int da, int alas, int tinggi){
        this.sisiAb=ab;
        this.sisiBc=bc;
        this.sisiCd=cd;
        this.sisiDa=da;
        this.alas=alas;
        this.tinggi=tinggi;
    }

    

    
    
    @Override
    public void hitungLuas(){
        luas = alas * tinggi;
        System.out.println("Luas Jajargenjang : "+luas);
    }

    @Override
    public void hitungKeliling() {
        keliling = (sisiDa + sisiAb)*2;
        System.out.println("Keliling Jajargenjang : "+keliling);
    }
    
}
