package com.teachmeskills.lesson12.task2;


import com.teachmeskills.lesson12.task2.service.Utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задача *:
 * Программа на вход получает произвольный текст. В этом тексте может быть номер
 * документа(один или несколько), емейл и номер телефона. Номер документа в формате:
 * xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
 * может содержать не всю информацию, т.е. например, может не содержать номер
 * телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
 * формате:
 * email: teachmeskills@gmail.com
 * document number: 1423-1512-51
 * и т.д
 */

public class Runner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();

        Utils.showMatches(str);

    }

}
