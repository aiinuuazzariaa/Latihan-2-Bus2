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
public class UjiBus2 {
private int penumpang;
private int maxPenumpang;

    //Konstruksi kelas bus
    public UjiBus2(int maxpenumpang) {
    this.maxPenumpang = maxpenumpang;
                  penumpang = 0;
}
    
    //Method Mutator untuk nambah penumpang
    public void addpenumpang(int penumpang){
    int temp;
    temp = this.penumpang+penumpang;
    if (temp> maxPenumpang)  {
    System . out. println(" Penumpang Melebihi Kuota");
    }else
    this.penumpang=temp;
    }

    
    public void cetak ( ){
    System.out.println(" Penumpang bus sekarang "+ penumpang);
    System.out.println(" Maksimum penumpang bus yang seharusnya adalah "+ maxPenumpang);
    }
    
    
   
}
