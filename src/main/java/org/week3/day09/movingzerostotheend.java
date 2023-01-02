package org.week3.day09;

public class movingzerostotheend {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0,0,0,1};
        int count = 0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }
            while (count < n)
                arr[count++] = 0;
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i< n; i++)
            System.out.print(arr[i]+" ");




    }
}
