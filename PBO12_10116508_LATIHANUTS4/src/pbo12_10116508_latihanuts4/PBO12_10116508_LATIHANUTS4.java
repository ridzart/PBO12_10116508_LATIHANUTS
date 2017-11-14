/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12_10116508_latihanuts4;

/**
 *
 * @author Harrid Alfasya
 */
public class PBO12_10116508_LATIHANUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner md = new ModelDesigner();
        ModelSystemAnalyst msa = new ModelSystemAnalyst();
        ModelProgrammer mp = new ModelProgrammer();
        
        md.bonusDesigner();
        mp.bonusProgrammer();
        msa.bonusSystemAnalyst();
    }
    
}
