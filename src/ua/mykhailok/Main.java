package ua.mykhailok;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by MihaelKO on 24.01.2017.
 */
public class Main {
    public static void main(String[] args) {

        int searchNumber = 30;

        List<Integer> array = new ArrayList<>();
        for (int i = 1; i <=50; i++){
            array.add(i);
        }
        int l=0, r = array.size()-1;
                while (r-l>1) {
                    int med = l + (r - l) / 2;
                    System.out.println(med);
                    if (array.get(med).compareTo(searchNumber) < 1) {
                        l = med;
                    } else {
                        r = med;
                    }
                }
        for (int i=r; i>=l; i--){
                    if (array.get(i).equals(searchNumber)){
                        System.out.println("Индекс элемента в массиве: " + i);
                    }
        }

    }
}
