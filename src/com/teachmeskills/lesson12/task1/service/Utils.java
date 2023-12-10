package com.teachmeskills.lesson12.task1.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    private static final String REGEX = "^[A-Z]{2,6}$";

    public static void showMatches(String[] str){

        int count=0;
        for (String str1: str) {
            Pattern pattern = Pattern.compile(REGEX);
            Matcher matcher = pattern.matcher(str1);
            if(matcher.find()){
                System.out.print(matcher.group()+" ");
                count++;
            }
        }
        if(count==0){
            System.out.println("There is no text matching the description");
        }

    }

}
