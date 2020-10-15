package com.gmail.hm6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Напишите метод который вернет максимальное число из массива целых
        чисел.*/
        int[] array = { 1, 2, 3, 4, 5, 6, 73, 8, 9 };
        int max = max(array);
        System.out.println(max);
    }
    static int max (int [] a) {
        int b = a [0];
        for (int i = 0; i < a.length; i++) {
            b = (a [i] > b) ? a [i] : b;
        }
        return b;

       /*Реализуйте метод параметрами которого являются - целое число,
вещественное число и строка. Возвращает он конкатенацию строки с
суммой вещественного и целого числа.*/

        int x = 25;
        double y = 29.79;
        String z = "Text";
        System.out.println(cont(x, y, z));
    }
    static String cont(int x, double y, String z) {
        String a = Double.toString(x + y) + z;
        return a;

        /*Реализуйте метод рисующий на экране прямоугольник из звездочек «*»
— его параметрами будут целые числа которые описывают длину и
ширину такого прямоугольника.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите высоту прямоугольника: ");
        int n = sc.nextInt();
        System.out.print("Введите шырину прямоугольника: ");
        int z = sc.nextInt();
        sum (n, z);
    }
    static void sum (int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*Напишите метод который реализует линейный поиск элемента в массиве
        целых чисел. Если такой элемент в массиве есть то верните его индекс,
        если нет то метод должен возвращать число - «-1»*/

        Scanner sc = new Scanner (System.in);
        System.out.print("Введите елемент для поиска: ");
        int a = sc.nextInt();
        int b [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println ("Индекс масива: "   + Search (b,a));
    }
    static int Search (int [] arr, int x) {
        int f = -1;
        for(int i=0;i<arr.length;i++) {
            if (arr[i]==x) {
                f = i;
            }
        }
        return f;

        /*Напишите метод который вернет количество слов в строке текста.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String a = sc.nextLine();
        System.out.println("Количество слов в тексте равно : " + number(a));
    }
    static int number(String st) {
        String[] wold = st.split(" ");
        int number = wold.length;
        return number;
    }
}
