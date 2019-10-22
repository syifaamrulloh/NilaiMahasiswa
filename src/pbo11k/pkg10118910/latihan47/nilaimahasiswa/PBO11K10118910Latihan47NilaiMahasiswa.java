/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan47.nilaimahasiswa;

/**
 *
 * @author ACER
 * Nama     : MUHAMAD SYIFA AMRULOH
 * Kelas    : IF 11-K
 * Nim      : 10118910
 * Deskripsi Program : Program ini berisi program untuk menentukan index nilai mahasiswa 
 */
public class PBO11K10118910Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IndexNilai mhs;
        IndexNilai mhs2;
        IndexNilai mhs3;
        
        mhs = new IndexNilai();
        mhs.setQuiz(75);
        mhs.setUts(45);
        mhs.setUas(34);
        mhs.indexNilai(mhs.nilaiakhir(mhs.getQuiz(),mhs.getUts(), mhs.getUas()));
        
        mhs2 = new IndexNilai();
        mhs2.setQuiz(60);
        mhs2.setUts(80);
        mhs2.setUas(75);
        mhs2.indexNilai(mhs2.nilaiakhir(mhs2.getQuiz(),mhs2.getUts(), mhs2.getUas()));
        
        mhs3 = new IndexNilai();
        mhs3.setQuiz(30);
        mhs3.setUts(80);
        mhs3.setUas(40);
        mhs3.indexNilai(mhs3.nilaiakhir(mhs3.getQuiz(),mhs3.getUts(), mhs3.getUas()));
    }
    
}
