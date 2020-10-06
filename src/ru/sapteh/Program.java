package ru.sapteh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество элементов в массиве: ");
        int index = Integer.parseInt(buffer.readLine());
        int[] arr = new int[index];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 10) - 5);
            System.out.printf("%d ",arr[i]);
        }
    }

}
