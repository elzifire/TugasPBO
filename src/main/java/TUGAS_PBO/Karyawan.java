/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_PBO;

/**
 *
 * @author HP
 */

public class Karyawan {
    private String nik;
    private String nama;
    private int golongan;
    private String jabatan;
    private int jmlKehadiran;

    //getNik adalah Method di java sebuah blok kode yang digunakan untuk menjalankan suatu proses atau tugas tertentu. 
    public String getNik() {
        return nik;
        // sedangkan Return adalah Mengembalikan nilai ke getNik atau rem  
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getJmlKehadiran() {
        return jmlKehadiran;
    }
    
    public void setJmlKehadiran(int jmlKehadiran) {
        this.jmlKehadiran = jmlKehadiran;
    }

    public double tunjanganGolongan() {
        double besarTunjangan = 0;
        switch (golongan) {
            case 1: besarTunjangan=50000;  break;
            case 2: besarTunjangan=25000;  break;
        }
    return besarTunjangan;}

    public double tunjanganJabatan() {
        double besarTunjangan = 0;
        switch (jabatan) {
            case "HRD": besarTunjangan=100000; break;
            case "Karyawan": besarTunjangan=50000; break;
        }
    return besarTunjangan;}

    public double tunjanganKehadiran() {
        return jmlKehadiran*120000;
    }

    public double totalGaji() {
        return tunjanganJabatan()+tunjanganGolongan()+tunjanganKehadiran();
    }

}

