package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        double armutFiyat,elmaFiyat,domatesFiyat,muzFiyat,patlicanFiyat,toplamFiyat;

        System.out.println("armudun kilogramı:");
        armutKilo= input.nextDouble();
        armutFiyat= armutKilo*2.14;

        System.out.println("elmanın kilogramı:");
        elmaKilo= input.nextDouble();
        elmaFiyat= elmaKilo*3.67;


        System.out.println("domatesin kilogramı:");
        domatesKilo= input.nextDouble();
        domatesFiyat=domatesKilo*1.11;


        System.out.println("muzun kilogramı:");
        muzKilo=input.nextDouble();
        muzFiyat= muzKilo*0.95;


        System.out.println("patlıcanın kilogramı:");
        patlicanKilo= input.nextDouble();
        patlicanFiyat= patlicanKilo*5;

         toplamFiyat= armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat;

        System.out.println("Toplam ödeyeceğiniz tutar:"+toplamFiyat+"Tl");



    }
}
