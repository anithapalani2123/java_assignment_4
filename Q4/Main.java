package Q4;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4.Write a Java program to remove all the elements from a hash set.
        HashSet<Integer> hs=new HashSet();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Hashlist: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            hs.add(sc.nextInt());
        }
        System.out.println("Before removing all elements: "+hs);
        hs.clear();
        System.out.println("After removing all elements: "+hs);
    }
}