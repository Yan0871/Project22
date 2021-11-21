package com.smkalihsan.javaproject.atm;

public class Card {
//    Field
    private String nameBCA, nameBMega, nameBMandiri, nameBRI, nameBTN;
    private int noPinBCA, noPinBMega, noPinBMandiri, noPinBRI, noPinBTN;
    private double saldoBCA, saldoBMega, saldoBMandiri, saldoBRI, saldoBTN;

//    Constructor
    public Card(String nameBCA, String nameBMega, String nameBMandiri, String nameBRI, String nameBTN, int noPinBCA, int noPinBMega, int noPinBMandiri, int noPinBRI, int noPinBTN, double saldoBCA, double saldoBMega, double saldoBMandiri, double saldoBRI, double saldoBTN) {
        this.nameBCA = nameBCA;
        this.nameBMega = nameBMega;
        this.nameBMandiri = nameBMandiri;
        this.nameBRI = nameBRI;
        this.nameBTN = nameBTN;
        this.noPinBCA = noPinBCA;
        this.noPinBMega = noPinBMega;
        this.noPinBMandiri = noPinBMandiri;
        this.noPinBRI = noPinBRI;
        this.noPinBTN = noPinBTN;
        this.saldoBCA = saldoBCA;
        this.saldoBMega = saldoBMega;
        this.saldoBMandiri = saldoBMandiri;
        this.saldoBRI = saldoBRI;
        this.saldoBTN = saldoBTN;
    }

//    Method Declaration
//    BANK BCA
    public String getNameBCA() {
        return nameBCA;
    }
    public void setNameBCA(String nameBCA) {
        this.nameBCA = nameBCA;
    }
    public int getNoPinBCA() {
        return noPinBCA;
    }
    public void setNoPinBCA(int noPinBCA) {
        this.noPinBCA = noPinBCA;
    }
    public double getSaldoBCA() {
        return saldoBCA;
    }
    public void setSaldoBCA(double saldoBCA) {
        this.saldoBCA = saldoBCA;
    }

//    BANK MEGA
    public String getNameBMega() {
        return nameBMega;
    }
    public void setNameBMega(String nameBMega) {
        this.nameBMega = nameBMega;
    }
    public int getNoPinBMega() {
        return noPinBMega;
    }
    public void setNoPinBMega(int noPinBMega) {
        this.noPinBMega = noPinBMega;
    }
    public double getSaldoBMega() {
        return saldoBMega;
    }
    public void setSaldoBMega(double saldoBMega) {
        this.saldoBMega = saldoBMega;
    }

//    BANK MANDIRI
    public String getNameBMandiri() {
        return nameBMandiri;
    }
    public void setNameBMandiri(String nameBMandiri) {
        this.nameBMandiri = nameBMandiri;
    }
    public int getNoPinBMandiri() {
        return noPinBMandiri;
    }
    public void setNoPinBMandiri(int noPinBMandiri) {
        this.noPinBMandiri = noPinBMandiri;
    }
    public double getSaldoBMandiri() {
        return saldoBMandiri;
    }
    public void setSaldoBMandiri(double saldoBMandiri) {
        this.saldoBMandiri = saldoBMandiri;
    }

//    BANK BRI
    public String getNameBRI() {
        return nameBRI;
    }
    public void setNameBRI(String nameBRI) {
        this.nameBRI = nameBRI;
    }
    public int getNoPinBRI() {
        return noPinBRI;
    }
    public void setNoPinBRI(int noPinBRI) {
        this.noPinBRI = noPinBRI;
    }
    public double getSaldoBRI() {
        return saldoBRI;
    }
    public void setSaldoBRI(double saldoBRI) {
        this.saldoBRI = saldoBRI;
    }

//    BANK BTN
    public String getNameBTN() {
        return nameBTN;
    }
    public void setNameBTN(String nameBTN) {
        this.nameBTN = nameBTN;
    }
    public int getNoPinBTN() {
        return noPinBTN;
    }
    public void setNoPinBTN(int noPinBTN) {
        this.noPinBTN = noPinBTN;
    }
    public double getSaldoBTN() {
        return saldoBTN;
    }
    public void setSaldoBTN(double saldoBTN) {
        this.saldoBTN = saldoBTN;
    }


    public void BCA() {
        System.out.println(nameBCA);
        System.out.println(noPinBCA);
        System.out.println(saldoBCA);
    }

    public void BMega() {
        System.out.println(nameBMega);
        System.out.println(noPinBMega);
        System.out.println(saldoBMega);
    }

    public void BMandiri() {
        System.out.println(nameBMandiri);
        System.out.println(noPinBMandiri);
        System.out.println(saldoBMandiri);
    }

    public void BRI() {
        System.out.println(nameBRI);
        System.out.println(noPinBRI);
        System.out.println(saldoBRI);
    }

    public void BTN() {
        System.out.println(nameBTN);
        System.out.println(noPinBTN);
        System.out.println(saldoBTN);
    }
}
