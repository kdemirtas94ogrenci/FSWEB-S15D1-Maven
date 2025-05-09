package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {


    public static List<String> groceryList = new ArrayList<>();

    static Scanner input1 = new Scanner(System.in);

    public void startGrocery() {

        while(true) {
            System.out.println("Lütfen yapmak istediğiniz işleme ait numarayı giriniz:");
            int girilen = input1.nextInt();
            if(girilen==0) {
                System.out.println("Çıkılıyor...");
                break;
            }
             if(girilen ==1)
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                String eleman = input1.nextLine();
                if (!groceryList.contains(eleman)) {
                    groceryList.add(eleman);
                    Collections.sort(groceryList);
                } else if (girilen == 2) {
                    System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
                    String eleman2 = input1.nextLine();
                    groceryList.remove(eleman2);
                    Collections.sort(groceryList);
                } else {
                    System.out.println("Geçersiz giriş");
                }
        }
    }


    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim();
            if (!groceryList.contains(item)) {
                groceryList.add(item);
            }
        }
        Collections.sort(groceryList);
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim();
            groceryList.remove(item);
        }
        Collections.sort(groceryList);
    }
    public static boolean checkItemIsInList(String product){
        return groceryList.contains(product);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        for (String item : groceryList) {
            System.out.println(item);
        }
    }
}
