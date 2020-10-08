package com.FarizMaulana.nomor2;

import java.util.Scanner;

public class DemoMahasiswaBaru {
    public static void main(String[] args) {

        MahasiswaBaru mahasiswa = new MahasiswaBaru();
        Scanner scanner = new Scanner(System.in);

        String nama;
        String asalSekolah;
        String jurusan;

        System.out.println("Pendaftaran Mahasiswa Baru");
        System.out.print("Masukan Nama : ");
        nama = scanner.nextLine();
        System.out.print("Masukan Asal Sekolah : ");
        asalSekolah = scanner.nextLine();
        System.out.print("Masukan Jurusan yang dipilih: ");
        jurusan = scanner.nextLine();

        mahasiswa.setNama(nama);
        mahasiswa.setAsalSekolah(asalSekolah);
        mahasiswa.setJurusan(jurusan);

        //get data
        System.out.println();
        System.out.println("Data Mahasiswa Baru");
        System.out.println("Nama : "+mahasiswa.getNama());
        System.out.println("Asal Sekolah : "+mahasiswa.getAsalSekolah());
        System.out.println("Jurusan yang di pilih : "+mahasiswa.getJurusan());

    }
}

