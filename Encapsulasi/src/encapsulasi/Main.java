/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulasi;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Ilham Wibowo Mukti");
        mhs.setNpm("52419948");
        mhs.setKelas("4IA17");
        System.out.println(mhs.getNama());
        System.out.println(mhs.getNpm());
        System.out.println(mhs.getKelas());
    }
    
}
