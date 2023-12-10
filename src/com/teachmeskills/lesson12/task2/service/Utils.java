package com.teachmeskills.lesson12.task2.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    private static final String emailREGEX = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
    private static final String telNumREGEX = "\\+\\(\\d{2}\\)\\d{7}";
    private static final String docNumREGEX = "\\b\\d{4}-\\d{4}-\\d{2}\\b";

    public static void showMatches(String str){

        Pattern emailPattern = Pattern.compile(emailREGEX);
        Matcher emailMatcher = emailPattern.matcher(str);
        while (emailMatcher.find()){
            System.out.print("email: "+ emailMatcher.group());
            System.out.println();
        }
        System.out.println();

        Pattern telPattern = Pattern.compile(telNumREGEX);
        Matcher telMatcher = telPattern.matcher(str);
        while (telMatcher.find()){
            System.out.print("telephone number: "+ telMatcher.group());
            System.out.println();
        }
        System.out.println();

        Pattern docPattern = Pattern.compile(docNumREGEX);
        Matcher docMatcher = docPattern.matcher(str);
        while (docMatcher.find()){
            System.out.print("document number: "+ docMatcher.group());
            System.out.println();
        }

    }

}
