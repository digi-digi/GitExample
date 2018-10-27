package com.company;

public class Ubranko {

    private int Cena;

    private String Kolor;

    private String Nazwa;

    public Ubranko(int cena, String kolor, String nazwa) {
        Cena = cena;
        Kolor = kolor;
        Nazwa = nazwa;
    }

    public Ubranko(int cena, String nazwa) {
        Cena = cena;
        Nazwa = nazwa;
        Kolor = nazwa.split(" ")[1];
    }

    public int getCena() {
        return Cena;
    }

    public void setCena(int cena) {
        if(cena > 0) {
            Cena = cena;
        }
    }

    public String getKolor() {
        return Kolor;
    }

    public void setKolor(String kolor) {
        Kolor = kolor;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }
}
