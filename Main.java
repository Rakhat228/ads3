package test;


import java.security.Key;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        MyHashTable<Integer, String> myHashTable = new MyHashTable<Integer, String>();
        myHashTable.put(1, "Xtentacles");
        myHashTable.put(2, "Juiceuniverse");
        myHashTable.put(3, "ASSSAProck");
        System.out.println(myHashTable.get(1) + " " + myHashTable.get(2) + " " + myHashTable.get(3));
        System.out.println(myHashTable.remove(2));
        System.out.println(myHashTable.get(1) + " " + myHashTable.get(2) + " " + myHashTable.get(3));

        System.out.println("----------------------------------------------------------");

        Bst<Integer, Integer> bst = new Bst<Integer, Integer>();
        bst.put(1, 5);
        bst.put(2, 6);
        System.out.println(bst.get(1) + " " + bst.get(2));
        bst.delete(1);
        System.out.println(bst.get(1) + " " + bst.get(2));
    }

}