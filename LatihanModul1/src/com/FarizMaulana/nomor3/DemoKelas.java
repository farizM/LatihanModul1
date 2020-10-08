package com.FarizMaulana.nomor3;

public class DemoKelas {
    //manajer
    private static String namaManajer = "Fariz Maulana";
    private static String jabatanM = "Manajer";
    private static int setUmurM(){
        int umurM = 21;
        return umurM;
    }

    //Sekertaris
    private static String namaSekertaris = "Rajib";
    private static String jabatanS = "Sekertaris";
    private static int setUmurS(){
        int umurS = 21;
        return umurS;
    }

    //bendahara
    private static String namaBendahara = "Jibtet";
    private static String jabatanB = "Bendahara";
    private static int setUmurB(){
        int umurB = 21;
        return umurB;
    }

    public static void main(String[] args) {
        System.out.println("Detail Karyawan Perusahaan X");
        System.out.println("======================");
        System.out.println("Manajer");
        System.out.println("Nama\t : " + namaManajer);
        System.out.println("Jabatan\t : "+jabatanM);
        System.out.println("Umur\t : "+setUmurM());

        System.out.println("Sekertaris");
        System.out.println("Nama\t : " + namaSekertaris);
        System.out.println("Jabatan\t : "+jabatanS);
        System.out.println("Umur\t : "+setUmurS());

        System.out.println("Bendahara");
        System.out.println("Nama\t : " + namaBendahara);
        System.out.println("Jabatan\t : "+jabatanB);
        System.out.println("Umur\t : "+setUmurS());

    }
}
