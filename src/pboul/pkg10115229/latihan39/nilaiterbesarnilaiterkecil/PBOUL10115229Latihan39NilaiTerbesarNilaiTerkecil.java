/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan39.nilaiterbesarnilaiterkecil;
import java.util.*;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * Nama     : Muhammad Lukman Hakim
 * Kelas    : PBO ULANG
 */
public class PBOUL10115229Latihan39NilaiTerbesarNilaiTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan=new Scanner(System.in);
    System.out.print("Masukkan Banyaknya nilai mahasiswa: ");
        int panjangArray = scan.nextInt();
        int angka[]=new int[panjangArray];
        int min,max;
        for(int i=0;i<panjangArray;i++)
        {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" : ");
            angka[i]= scan.nextInt();
        }
        min=angka[0];
        max=angka[0];
       
        for(int i=0;i<panjangArray;i++)
        {
            if(angka[i]<min)
                min=angka[i];
            if(angka[i]>max)
                max=angka[i];
            System.out.println("Nilai Mahasiswa: "+angka[i]);
        }
   
    System.out.println("Nilai Terbesar:" +max);
    System.out.println("Nilai Terkecil:" +min);
    
    System.out.println("");
    System.out.println(" develop BY: Muhammad Lukman Hakim ");
    }
    
}
