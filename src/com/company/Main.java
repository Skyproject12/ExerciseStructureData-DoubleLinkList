package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

        private static int getRandomNumberInRange(int min, int max ){
        if(min>=max){
            throw new IllegalArgumentException("max must be graten get nim");

        }
        Random r= new Random ();
        return r.nextInt ((max-min)+1)+min;
        }


    public static void main(String[] args) {
        String pilihan;
        int a;
        boolean jawaban=true;

        do {
            ArrayList<tebak_angka> tebak = new ArrayList<tebak_angka>();
            Scanner scan = new Scanner(System.in);
            System.out.println("Game Tebak Angka");
            System.out.println("Peraturan");
            System.out.println("1. Diberi 5 kesempatan untuk menebak angka random");
            System.out.println("2.hasil dari angka yang anda tebak akan masuk di log");
            System.out.println("3.hasil dari angka yang anda tebak akan masuk di log");
            System.out.println("4.permainan akan diselesaikan apabila angka berhasil di tebak ");
            System.out.println("5. Exit ");
            System.out.println("press enter 2 key to continnue...");
            pilihan = scan.nextLine();
            int angka = getRandomNumberInRange(0, 20);
            System.out.println("Mulai");

            link data = new link ();
                for (int i = 4; i >=0 ; i--) {
                    System.out.println("=============");
                    System.out.println("kesempatan  " + (i+1));

                    System.out.println("tebak angka   :");
                    a = scan.nextInt();

                    System.out.println("Log :");
                    if (a <= angka) {
                        Infotype number = new Infotype(a,"<=","insert belakang");
                        System.out.println(a + "lebih kecil -> insert belakang");
                        data.insertlast(number);

                    }
                    if (a >= angka) {
                        Infotype number = new Infotype(a,">=","insert belakang");
                        System.out.println(a + "lebih besar -> insert depan");
                        data.insertdfirs(a);
                    }
                    if(a==angka ){
                        System.out.println("anda berhasil ");
                    }
                    data.view ();

                }


        } while (jawaban==false);
    }
}
