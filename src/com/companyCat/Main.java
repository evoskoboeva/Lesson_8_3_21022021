package com.companyCat;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //2.Напишите программу, которая будет выполнять конвертирование валют.
        //Пользователь вводит: сумму денег в определенной валюте, курс для
        //конвертации в другую валюту. Организуйте вывод результата операции
        //конвертирования валюты на экран.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Конвертируем валюту? 1 - да");
        byte task2 = scanner.nextByte();
        while (task2 == 1) {

            System.out.println("введите сумму для конвертации");
            double sum = scanner.nextDouble();
            System.out.println("введите курс");
            double course = scanner.nextDouble();
            System.out.println(convertation(sum, course));
            System.out.println("Конвертируем валюту? 1 - да, 0 - нет");
            task2 = scanner.nextByte();

        }
        //Напишите метод, который будет определять:
        //1) является ли введенное число положительным или отрицательным.
        //2) Является ли оно простым (используйте технику перебора значений).
        //(Простое число — это натуральное число, которое делится на 1 и само на
        //себя. Чтобы определить простое число или нет, следует найти все его
        //целые делители. Если делителей больше 2-х, значит оно не простое.)
        //3) Делится ли на 2, 5, 3, 6, 9 без остатка.
        System.out.println("Задание с числом запускаем? 1 - да");
        byte task3 = scanner.nextByte();
        while (task3 == 1) {
            System.out.println("введите число для задания 3");
            int number = scanner.nextInt();
            System.out.println(operations(number));
            System.out.println("новое число для задания 3? 1 - да, 0 - нет");
            task3 = scanner.nextByte();
        }

        //Напишите метод, который в качестве аргумента принимает одномерный
        //целочисленный массив, и сортирует его “Методом пузырька”. Также
        //напишите отдельный метод, для вывода массива на экран.
        System.out.println("Задание с массивом и сортировкой запускаем? 1 - да");
        byte task4 = scanner.nextByte();
        while (task4 == 1) {
            int N = 5;
            int[] matrix = new int[N];
            System.out.println("Введите аргументы целочисленного массива размерностью - " + N);

            for (int i = 0; i < matrix.length; i++) {
                matrix[i] = scanner.nextInt();
            }
            monitor(matrix);
            mySort(matrix);
            monitor(matrix);
            System.out.println("новый массив для задания 4? 1 - да, 0 - нет");
            task4 = scanner.nextByte();
        }
        //Напишите метод, который принимает 2 аргумента : целочисленный массив, и
        //целочисленное число. В методе организуйте проверку, содержит ли массив это
        //число. Метод должен возвращать логическое значение (true – содержит, false –
        //не содержит). Создайте перегрузку этого метода, который в качестве первого
        //аргумента принимает массив элементов типа double, а в качестве второго
        //аргумента принимает аргумент типа double .
        System.out.println("Задание с массивом и перегрузкой запускаем? 1 - да");
        byte task5 = scanner.nextByte();
        while (task5 == 1) {
            Random random = new Random();
            System.out.println("введите размерность массива");
            int size = scanner.nextInt();
            int[] matrix = new int[size];
            for (int i = 0; i < matrix.length; i++) {
                matrix[i] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(matrix));
            int number = random.nextInt(10);
            System.out.println(" Случайно сгенерированное число = "+number);
            System.out.println(SearchInMatrix(matrix,number));

            double[] matrixDouble = new double[size];
            for (int i = 0; i < matrixDouble.length; i++) {
                matrixDouble[i] = random.nextDouble();
            }
            System.out.println("перегрузка функции SearchInMatrix");
            System.out.println(Arrays.toString(matrixDouble));
            double numberDouble = random.nextDouble();
            System.out.println(" Случайно сгенерированное double число = "+numberDouble);
            System.out.println(SearchInMatrix(matrixDouble,numberDouble));


            System.out.println("новый массив для задания 5? 1 - да, 0 - нет");

            task5 = scanner.nextByte();

        }
    }
    private static boolean SearchInMatrix(double[]matrixDouble,double numberDouble){
        int count= 0;
        for (int i = 0; i < matrixDouble.length; i++) {
            if (matrixDouble[i] == numberDouble) {
                count++;
            }
        }
        return count > 0;


    }
    private static boolean SearchInMatrix(int[] matrix, int number) {
        int count= 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == number) {
                count++;
            }
        }
        return count > 0;


    }

    private static void mySort(int[] matrix) {
        int abc;
        do {
            abc = 0;
            for (int i = 0; i < matrix.length - 1; i++) {
                if (matrix[i] < matrix[i + 1]) {
                    abc = matrix[i];
                    matrix[i] = matrix[i + 1];
                    matrix[i+1]=abc;
                }
            }
        }
        while (abc>0);

    }

    private static void monitor(int[] matrix) {
        System.out.println(Arrays.toString(matrix));

    }

    private static String operations(int number) {
        //1) является ли введенное число положительным или отрицательным.
        String one,two,three = "3. число делится на  ";
        int count = 0;
        if (number < 0) {
             one = "1. число отрицательное";
        }
        else {
            one = "1. число положительное";
        }
        // Является ли оно простым (используйте технику перебора значений).
        //(Простое число — это натуральное число, которое делится на 1 и само на
        //себя. Чтобы определить простое число или нет, следует найти все его
        //целые делители. Если делителей больше 2-х, значит оно не простое.)
        String n1234567="";
        for (int i = 1; i <= number; i++) {
            if (number % i==0){
                count++;
                n1234567 = n1234567.concat(i+"  ");    //проверка на что конкретно делится
            }

        }
        if (count > 2){
            two = "2. число не явл простым, делится на - "+n1234567;
        }
        else {
            two = "2. число явл простым";
        }
        //3) Делится ли на 2, 5, 3, 6, 9 без остатка.
        int [] matrix = {2,5,3,6,9};
        for (int i = 0; i < matrix.length; i++) {
            if (number % matrix[i] == 0 )
                three = three.concat(matrix[i]+" ");

        }
        if (three.equals("3. число делится на  ")){
            three = three.concat("себя и что то еще ))но не на "+ Arrays.toString(matrix));
        }
        return one+System.lineSeparator()+two+System.lineSeparator()+three;
        }

    private static String convertation(double sum, double course) {
        return "сумма в новой валюте = "+ sum*course;
    }
}
