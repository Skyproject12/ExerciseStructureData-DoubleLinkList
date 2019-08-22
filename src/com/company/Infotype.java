package com.company;

public class Infotype {
    private int number;
    private String ketjumlah;
    private String ketorder;

    public Infotype(int number, String ketjumlah, String ketorder) {
        this.number = number;
        this.ketjumlah = ketjumlah;
        this.ketorder = ketorder;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getKetjumlah() {
        return ketjumlah;
    }

    public void setKetjumlah(String ketjumlah) {
        this.ketjumlah = ketjumlah;
    }

    public String getKetorder() {
        return ketorder;
    }

    public void setKetorder(String ketorder) {
        this.ketorder = ketorder;
    }


}
