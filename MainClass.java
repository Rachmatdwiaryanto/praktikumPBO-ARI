package com.mycompany.praktikum8;

// Main Class
public class MainClass {
    public static void main(String[] args) {
        // Lingkaran A dengan jari-jari 19 satuan
        Lingkaran A = new Lingkaran();
        A.jejarin = 19;
        A.tampilHasil();

        // Persegi Panjang B dengan panjang 10 dan lebar 5 satuan
        PersegiPanjang B = new PersegiPanjang();
        B.panjang = 10;
        B.lebar = 5;
        B.tampilHasil();

        // Segitiga C dengan alas 12 dan tinggi 3 satuan
        Segitiga C = new Segitiga();
        C.alas = 12;
        C.tinggi = 3;
        C.tampilHasil();

        // Segi Delapan D dengan panjang sisi 7 satuan
        SegiDelapan D = new SegiDelapan();
        D.sisi = 7;
        D.tampilHasil();
    }
}
