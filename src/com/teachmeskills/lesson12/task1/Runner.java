package com.teachmeskills.lesson12.task1;

import com.teachmeskills.lesson12.task1.service.Utils;

import java.util.Scanner;

/**
 * Задача 1:
 * Вывести в консоль из строки которую пользователь вводит с клавиатуры все
 * аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
 * только из прописных букв, без чисел.
 */

public class Runner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String[] str= scanner.nextLine().split("\\s*(\\s|,|!|\\.)\\s*");

        Utils.showMatches(str);

    }

}
