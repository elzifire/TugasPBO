/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_PBO;

import java.util.Scanner;

/**
 *
 * @author HP
 */
//.setNama" di Java merupakan sebuah method yang digunakan untuk mengubah atau "
//+ "menetapkan nilai dari sebuah properti bernama "nama" pada sebuah objek."
//+ " Method ini biasanya disebut sebagai setter method, yang bertujuan untuk mengatur atau mengubah nilai properti tersebut.
//sedangkan .this hal yang mengacu pada 
public class Main extends Karyawan{
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Karyawan kar = new Karyawan();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK \t: ");
        kar.setNik(scn1.next());
        System.out.print("Masukkan Nama \t: ");
        kar.setNama(scn2.nextLine());
        System.out.print("Masukkan Golongan (Karyawan Tetap Ketik 1/Magang Ketik 2) : ");
        kar.setGolongan(scn1.nextInt());
        System.out.print("Masukkan Jabatan (HRD Ketik 1/Anggota Ketik 2) : ");
        kar.setJabatan(scn1.next());
        System.out.print("Masukkan Jumlah Kehadiran \t: ");
        kar.setJmlKehadiran(scn1.nextInt());

        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK \t\t: "+kar.getNik());
        System.out.println("Nama \t\t: "+kar.getNama());
        System.out.println("Golongan \t: "+kar.getGolongan());
        System.out.println("Jabatan \t: "+kar.getJabatan());

        System.out.println("\nTUNJANGAN GOLONGAN \t\t: "+kar.tunjanganGolongan());
        System.out.println("TUNJANGAN JABATAN \t\t: "+kar.tunjanganJabatan());
        System.out.println("TUNJANGAN KEHADIRAN \t: "+kar.tunjanganKehadiran());

        System.out.println("\nGAJI TOTAL : "+kar.totalGaji());
    }
}
