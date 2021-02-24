/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus2;

/**
 *
 * @author MOKLET-2
 */
public class Bus2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //Membuat objek busBesar dari class bus
        UjiBus2 busBesar = new UjiBus2 (40);
        busBesar.cetak ();
        
        // penambahan penumpang
        busBesar.addpenumpang (15); //tambah 15 penumpang
        busBesar.cetak () ;

        // penambahan penumpang
       busBesar.addpenumpang (5); //tambah 5 penumpang
       busBesar .cetak () ;

       // penambahan penumpang
       busBesar.addpenumpang (26); //tambah 26 penumpang
       busBesar .cetak () ;

      
    }

   

    

   

    

    
}
