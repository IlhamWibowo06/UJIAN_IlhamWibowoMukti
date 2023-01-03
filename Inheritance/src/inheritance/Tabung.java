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
public class Tabung extends Lingkaran {
    
    double t = 10;
    Lingkaran lingkaran = new Lingkaran();
    
    public void input(){
        System.out.println("Jari - jari Lingkaran : " +jari);
        System.out.println("Phi Lingkaran : " + v);
    }
    
    public void LKLingkaran(){
    System.out.println("Jari - jari Lingkaran : " + lingkaran.luaslingkaran());
    System.out.println("Keliling Lingkaran : " + lingkaran.kelilinglingkaran());
    
    }
    public double volumetabung(){
        return luaslingkaran() * t;   
    }

    public double luastabung(){
        return (2 * luaslingkaran()) + (kelilinglingkaran() * t);
    }
}
