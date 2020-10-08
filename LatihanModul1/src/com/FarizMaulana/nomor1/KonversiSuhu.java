package com.FarizMaulana.nomor1;

import java.util.Scanner;

public class KonversiSuhu {
    int pilihan;
    double suhuAwal;

    void tampil(){
        // fungsi untuk menampilkan pilihan
        System.out.println("Pilih suhu dari : ");
        System.out.println("1. Celcius");
        System.out.println("2. Fahreinhet");
        System.out.println("3. Kelvin");
        System.out.println("4. Reamur");
    }

    void inputanPilihan(){
        //fungsi untuk menampilkan inputan dan mendapatkan nilai dari pilihan dan suhu awal
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan pilihan : ");
        pilihan = scanner.nextInt();
        System.out.print("Masukan suhu : ");
        suhuAwal = scanner.nextDouble();
    }

    void prosesKonversi(){
        //fungsi untuk mengkoversi suhu dari yang di pilih ke suhu lain nya
        if (pilihan == 1){
            fromCelcius();
        }else if (pilihan == 2){
            fromFahreinhet();
        }else if (pilihan == 3) {
            fromKelvin();
        }else {
            fromReamur();
        }
    }


    // fungsi fungsi untuk mengkorversi ke suhu lain dari suhu yang di pilih
    //dari celcius
    void fromCelcius(){
        System.out.println("Celcius : "+suhuAwal);
        System.out.println("Fahreinhet "+(suhuAwal*1.8+32));
        System.out.println("Kelvin "+(suhuAwal+273.15));
        System.out.println("Reamur "+suhuAwal*0.8);
    }

    // dari fahreinhet
    void fromFahreinhet(){
        System.out.println("Celcius : "+(suhuAwal-32)/1.8);
        System.out.println("Fahreinthet : "+suhuAwal);
        System.out.println("Kelvin : "+(suhuAwal+459)/1.8);
        System.out.println("Reamur : "+(suhuAwal-32)/2.25);
    }

    //dari kelvin
    void fromKelvin(){
        System.out.println("Celcius : "+(suhuAwal-273.15));
        System.out.println("Fahreinhet : "+(suhuAwal*1.8-459.67));
        System.out.println("Kelvin : "+suhuAwal);
        System.out.println("Reamur : "+(suhuAwal-273.15)*0.8);
    }

    //dari reamur
    void fromReamur(){
        System.out.println("Celcius : "+(suhuAwal/0.8));
        System.out.println("Fahreinhet : "+(suhuAwal*2.25+32));
        System.out.println("Kelvin : "+(suhuAwal/0.8+237.15));
        System.out.println("Reamur "+suhuAwal);
    }

}
