 package com.backend25;

 import javax.swing.*;
 import java.awt.*;
 import java.util.Locale;

 public class Variable {
    public static void main(String[] args) {

        byte rating = 127;
        short stock = 1000;

        char a = 'A';

        String path = "C:\\Users\\p\\Videos\\Captures";
        System.out.println(path);

        //boolean isLogin = true;
        boolean isStockAvailable = false;

        // implementasi variable ke account/users
        String firstName = "Juara";
        String lastName = "Coding";
        String address = "Jakarta";
        char level = 'a';
        boolean isLogin = true;
        boolean isActive = true;

        // casting implicit
        int price = 1000000000;
        long total = 3000000000L + price;
        System.out.println(total);
        int intLevel = level;
        System.out.println(intLevel);

        // casting explicit
        long l = 9223372036854775000L;
        int i = (int)l;
        System.out.println(i);

        int umur = 81;
        int duplikatUmur = umur;
        duplikatUmur = 1308;

        System.out.println(umur);
        System.out.println(duplikatUmur);

        Rectangle kotak = new Rectangle(20,30);
        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(80,90);

        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());
    }

}
