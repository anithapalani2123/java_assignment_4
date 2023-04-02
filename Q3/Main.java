package Q3;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3.Write a Java program to check if a particular element exists in a linked list.
        LinkedList l1=new LinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Linkedlist: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l1 .add(i,sc.nextInt());
        }
        System.out.println("Enter the element to check: ");
        int check=sc.nextInt();
        System.out.println(l1.contains(check));
    }
}