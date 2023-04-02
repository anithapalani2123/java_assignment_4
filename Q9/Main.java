package Q9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Main {
    //Write a Java program to get a set view of the keys contained in this map.
    public static void main(String[] args) {
        Map<Integer,Integer> mp=new HashMap<Integer, Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            mp.put(sc.nextInt(),sc.nextInt());
        }
        Set<Integer> set=mp.keySet();
        System.out.println("Set view of keys: "+set);
    }
}