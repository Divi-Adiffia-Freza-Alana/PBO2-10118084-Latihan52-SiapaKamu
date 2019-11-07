/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan52.siapakamu;

/**
 *
 * @author Freza
 */
public class Mahasiswa extends Manusia {
private String nim;
private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void KelasApa() {
        System.out.println("Saya Nindi umur 17 tahun sedang belajar dikelas PBO2");
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa"); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
