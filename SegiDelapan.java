package com.mycompany.praktikum8;

// Class 'SegiDelapan'
public class SegiDelapan extends BangunDatar implements Keliling, Simetri {
    // Attribute
    public int sisi;

    // Methods
    @Override
    public double hitungLuas() {
        // Formula for the area of an octagon
        return 2 * (1 + Math.sqrt(2)) * sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        // Formula for the perimeter of an octagon
        return 8 * sisi;
    }

    @Override
    public double hitungSimPutar() {
        return 45; // Angle of rotation for an octagon
    }

    @Override
    public double hitungSimLipat() {
        return 8; // Number of symmetry lines for an octagon
    }

    @Override
    public void tampilHasil() {
        System.out.println("Segi Delapan");
        System.out.println("--------------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
        System.out.println("Sim. Lipat: " + this.hitungSimLipat());
        System.out.println("Sim. Putar: " + this.hitungSimPutar());
    }
}
