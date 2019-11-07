/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan52.siapakamu;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan Siapa kamu

 */
public class PBO210118084Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN: "+dosen.getNip());
        dosen.siapaKamu();
        dosen.MengajarApa();
        System.out.println("");
        mahasiswa.setNim("10110269");
        System.out.println("NIM MAHASISWA :"+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.KelasApa();
        
        
    }
    
}
