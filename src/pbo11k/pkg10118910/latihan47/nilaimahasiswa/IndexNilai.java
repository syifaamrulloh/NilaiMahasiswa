    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan47.nilaimahasiswa;

/**
 *
 * @author
 * Nama     : MUHAMAD SYIFA AMRULOH
 * Kelas    : IF 11-K
 * Nim      : 10118910
 */
public class IndexNilai {
    private double quiz,uts,uas;

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
    
    public double nilaiakhir(double quiz,double uts,double uas){
        double totalnilai = (0.2 * quiz)+(0.3 * uts)+(0.5 * uas);
        return  totalnilai;
    }
    
    public void indexNilai(double NilaiAkhir){
        if(NilaiAkhir >= 80 && NilaiAkhir <= 100){
            System.out.println("Quiz\t\t= " + quiz);
            System.out.println("UTS\t\t= " + uts);
            System.out.println("UAS\t\t= " + uas);
            System.out.println("\nNilai Akhir\t= " + NilaiAkhir);
            System.out.println("\nIndex\t\t= A");
            System.out.println("Keterangan\t= Sangat Baik\n");
        }
        else if(NilaiAkhir >= 68 && NilaiAkhir <= 80){
            System.out.println("Quiz\t\t= " + quiz);
            System.out.println("UTS\t\t= " + uts);
            System.out.println("UAS\t\t= " + uas);
            System.out.println("\nNilai Akhir\t= " + NilaiAkhir);
            System.out.println("\nIndex\t\t= B");
            System.out.println("Keterangan\t= Baik\n");
        }
        else if(NilaiAkhir >= 56 && NilaiAkhir <= 68){
            System.out.println("Quiz\t\t= " + quiz);
            System.out.println("UTS\t\t= " + uts);
            System.out.println("UAS\t\t= " + uas);
            System.out.println("\nNilai Akhir\t= " + NilaiAkhir);
            System.out.println("\nIndex\t\t= C");
            System.out.println("Keterangan\t= Cukup\n");
        }
        else if(NilaiAkhir >= 45 && NilaiAkhir <= 56){
            System.out.println("Quiz\t\t= " + quiz);
            System.out.println("UTS\t\t= " + uts);
            System.out.println("UAS\t\t= " + uas);
            System.out.println("\nNilai Akhir\t= " + NilaiAkhir);
            System.out.println("\nIndex\t\t= D");
            System.out.println("Keterangan\t= Kurang\n");
        }
        else if(NilaiAkhir >= 0 && NilaiAkhir <= 45){
            System.out.println("Quiz\t\t= " + quiz);
            System.out.println("UTS\t\t= " + uts);
            System.out.println("UAS\t\t= " + uas);
            System.out.println("\nNilai Akhir\t= " + NilaiAkhir);
            System.out.println("\nIndex\t\t= E");
            System.out.println("Keterangan\t= Sangat Kurang\n");
        }
        else{
            System.out.println("\nIndex\t= T");
            System.out.println("Keterangan\t= Tidak Ada Nilai\n");
        }
    }
}
