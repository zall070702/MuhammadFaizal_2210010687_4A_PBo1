/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO;

import java.util.Scanner;

public class mahasiswaTI {
    public static void main(String[] args) {
        //objek
        //Mahasiswa mhs = new Mahasiswa("Khatibul Luthfi","2210010657");
        
        //System.out.println(mhs.displayInfo());
        //System.out.println(mhs.displayInfo("4ANONREG"));
        
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
        MahasiswaLengkap[] mhs = new MahasiswaLengkap[2];
        
        //perulangan
        for(int i=0; i<mhs.length; i++){
        System.out.print("Masukkan Nama Mahasiswa "+(i+1)+": ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NPM Mahasiswa "+(i+1)+": ");
        String npm = scanner.nextLine();
        
        //objek
        mhs[i] = new MahasiswaLengkap(nama, npm);
        }
        
        //perulangan array
        for(MahasiswaLengkap data: mhs){ 
            System.out.println("****************");
            System.out.println("Data Mahasiswa");
            System.out.println(data.displayInfo());
        }
      }catch (NumberFormatException e){
          System.out.println("Kesalahan Format Nomor: "+e.getMessage());
      }catch (Exception e) {
          System.out.println("Kesalahan Umum: "+e.getMessage());  
        }
        
    }
}
