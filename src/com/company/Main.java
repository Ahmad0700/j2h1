package com.company;

public class Main {

    public static void main(String[] args) {

        Galaxy objectA = new Galaxy(" Samsung ",Hotels.MAYAMI,
                " S21 Ultra ");
        System.out.println(objectA.smartInfo());
        System.out.println(objectA.smartphoneInfo(23232434));



        Proverka_Studi objectB = new Proverka_Studi(" Samsung ",Hotels.AMERIKA ,
                " S20 Ultra "," Samsung "," Galaxy " );
        System.out.println(objectB.smartInfo());
        System.out.println(objectB.smartphoneInfo("S21 Pro"));


        Proverka_Studi objectC = new Proverka_Studi(" Samsung ",Hotels.SINGAPUR,
                " S8 "," Samsung "," Galaxy " );
        System.out.println(objectC.smartInfo());


    }

}

