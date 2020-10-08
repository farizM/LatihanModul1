package com.FarizMaulana.nomor1;

public class DemoKonversi {
    public static void main(String[] args) {
        // membuat method dari class konversi suhu
        KonversiSuhu konversiSuhu = new KonversiSuhu();
        // memanggil fungsi tampi dari method
        konversiSuhu.tampil();
        //memanggil fungsi inputan dari method
        konversiSuhu.inputanPilihan();
        // memanggil dan menampilkan hasil dari konversi suhu
        konversiSuhu.prosesKonversi();
    }
}
