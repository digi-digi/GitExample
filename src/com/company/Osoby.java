package com.company;

public class Osoby {
    private String imie;
    private String nazwisko;
    private Gender gender;


    public Osoby(String imie, String nazwisko, Gender gender) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.gender = gender;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }

    @Override
    public String toString() {
        return "Osoby{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object other){
        Osoby otherPerson = (Osoby) other;
        return this.imie.equals(otherPerson.imie) &&
                this.nazwisko.equals(otherPerson.nazwisko) &&
                this.gender == otherPerson.gender;

    }
}
