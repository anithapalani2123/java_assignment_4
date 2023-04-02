package Q8;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    //Write a Java program to get a collection view of the values contained in this map.
    public static void main(String[] args) {
        Map<Integer,Integer> mp=new HashMap<Integer, Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            mp.put(sc.nextInt(),sc.nextInt());
        }
        System.out.println("Collection view of values: "+mp.values());

    }
}