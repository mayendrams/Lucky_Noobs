/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author MY PC
 */
public class Segitiga implements BangunDatar {

    private int luas, keliling;
    final int sisiAb, sisiBc, sisiCa, alas, tinggi;

    public Segitiga(int ab, int bc, int ca, int alas, int tinggi) {
        this.sisiAb = ab;
        this.sisiBc = bc;
        this.sisiCa = ca;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungLuas() {
        System.out.println("Luas Segitiga : " + (alas*tinggi)/2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hitungKeliling() {
        System.out.println("Keliling Segitiga : " +(sisiAb+sisiBc+sisiCa)); //To change body of generated methods, choose Tools | Templates.
    }

}
