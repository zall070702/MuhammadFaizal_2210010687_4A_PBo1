/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO;

/**
 *
 * @author USER
 */
public class Mahasiswa {
 //atribut dan encapsulation
 private String nama;
 private String npm;

    //construktor
    public Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
    }

    //mutataor (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    //accesor (getter)
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }
    
    public String displayInfo(){
        return "Nama: "+getNama()+"\nNPM: "+getNpm();
    }
    
    //polymorphism (overloading)
    public String displayInfo(String kelas) {
        return displayInfo() + "\nkelas: "+kelas;
    }
  
    
    
}
