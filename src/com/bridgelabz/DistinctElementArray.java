package com.bridgelabz;

import java.util.Scanner;

public class DistinctElementArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        System.out.println("Enter Elements of an array ");
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
            System.out.println("Distinct Elements of array");
            boolean flag = false;
            int i, j;
            for(i=0; i<n; i++) {
                for (j = 0; j < i; j++)
                    if (arr[i] == arr[j])
                        break;
                if (i == j)
                    System.out.print(arr[i] + " ");

            }
    }


}
