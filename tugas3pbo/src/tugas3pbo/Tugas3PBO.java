/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3pbo;

/**
 *
 * @author all
 */
class NilaiMahasiswa {

    private String nama, keterangan1, keterangan2, keterangan3, keterangan4, keterangan5;
    private int nim;
    private double quiz, uts, uas, na;
    private char index1, index2, index3, index4, index5;

    public String getKeterangan1() {
        return keterangan1;
    }

    public void setKeterangan1(String keterangan1) {
        this.keterangan1 = keterangan1;
    }

    public String getKeterangan2() {
        return keterangan2;
    }

    public void setKeterangan2(String keterangan2) {
        this.keterangan2 = keterangan2;
    }

    public String getKeterangan3() {
        return keterangan3;
    }

    public void setKeterangan3(String keterangan3) {
        this.keterangan3 = keterangan3;
    }

    public String getKeterangan4() {
        return keterangan4;
    }

    public void setKeterangan4(String keterangan4) {
        this.keterangan4 = keterangan4;
    }

    public String getKeterangan5() {
        return keterangan5;
    }

    public void setKeterangan5(String keterangan5) {
        this.keterangan5 = keterangan5;
    }

    public char getIndex1() {
        return index1;
    }

    public void setIndex1(char index1) {
        this.index1 = index1;
    }

    public char getIndex2() {
        return index2;
    }

    public void setIndex2(char index2) {
        this.index2 = index2;
    }

    public char getIndex3() {
        return index3;
    }

    public void setIndex3(char index3) {
        this.index3 = index3;
    }

    public char getIndex4() {
        return index4;
    }

    public void setIndex4(char index4) {
        this.index4 = index4;
    }

    public char getIndex5() {
        return index5;
    }

    public void setIndex5(char index5) {
        this.index5 = index5;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double Na(double quiz, double uts, double uas) {
        return 0.2 * quiz + 0.3 * uts + 0.5 * uas;
    }
}

public class Tugas3PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j;
        NilaiMahasiswa oNMHS = new NilaiMahasiswa();
        //Menampilkan Nama Mahasiswa
        oNMHS.setNama("Mayendra Muhammad Shiddiq");
        i = 1;
        while (i <= 4) {
            System.out.println("Nama ke " + i + ": " + oNMHS.getNama());
            i++;
        }

        //Menampilkan NIM Mahasiswa
        oNMHS.setNim(10116513);
        j = 8;
        while (j >= 1) {
            System.out.println("NIM ke " + j + ": " + oNMHS.getNim());
            j--;
        }

        //Menampilkan Nilai
        oNMHS.setQuiz(76);
        oNMHS.setUts(47);
        oNMHS.setUas(34);
        System.out.println("\nQuiz = " + oNMHS.getQuiz());
        System.out.println("UTS = " + oNMHS.getUts());
        System.out.println("UAS = " + oNMHS.getUas());
        System.out.println("\nNilai AKhir = " + oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()));

        //Menampilkan Index
        if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) > 80 && oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 100) {
            oNMHS.setIndex1('A');
            oNMHS.setKeterangan1("Sangat Baik");
            System.out.println("\nIndex : " + oNMHS.getIndex1());
            System.out.println("Keterangan : " + oNMHS.getKeterangan1());
        } else if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) > 68 && oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 80) {
            oNMHS.setIndex2('B');
            oNMHS.setKeterangan2("Baik");
            System.out.println("\nIndex : " + oNMHS.getIndex2());
            System.out.println("Keterangan : " + oNMHS.getKeterangan2());
        } else if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) > 56 && oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 68) {
            oNMHS.setIndex3('C');
            oNMHS.setKeterangan3("Cukup");
            System.out.println("\nIndex : " + oNMHS.getIndex3());
            System.out.println("Keterangan : " + oNMHS.getKeterangan3());
        } else if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) > 45 && oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 56) {
            oNMHS.setIndex4('D');
            oNMHS.setKeterangan4("Kurang");
            System.out.println("\nIndex : " + oNMHS.getIndex4());
            System.out.println("Keterangan : " + oNMHS.getKeterangan4());
        } else if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 45) {
            oNMHS.setIndex5('E');
            oNMHS.setKeterangan5("Sangat Kurang");
            System.out.println("\nIndex : " + oNMHS.getIndex5());
            System.out.println("Keterangan : " + oNMHS.getKeterangan5());
        }
    }
}
