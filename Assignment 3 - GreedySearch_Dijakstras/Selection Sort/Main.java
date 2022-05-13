package com.muthadevs;

import java.util.Scanner;

public class Main {

    void selectionSort (int arr[]){
        int n = arr.length;

        for(int i = 0;i<n-1;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }


    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        for(int n=0;n<5;n++){
            arr[n] = sc.nextInt();
        }
        Main m = new Main();
        m.selectionSort(arr);

    }
}
