/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Lenovo
 */
public class App {
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tabung tabung = new Tabung();
       System.out.println("Luas Lingkaran");
       tabung.input();
       tabung.LKLingkaran();
       System.out.println();
       System.out.println("Tabung");
       System.out.println("Volume Tabung Adalah " +tabung.volumetabung());
       System.out.println("Luas Tabung Adalah " +tabung.luastabung());
        // TODO code application logic here
    }
    
}
