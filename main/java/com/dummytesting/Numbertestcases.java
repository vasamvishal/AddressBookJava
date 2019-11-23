package com.dummytesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numbertestcases {

    private  String phoneNumberPattern="^[0-9]{2}[[\\s]][0-9]{10}$";

    public Boolean invalidphonenumberwithout10numbers(String phoneNumber) {
        Pattern phonepattern = Pattern.compile(phoneNumberPattern);
        Matcher match = phonepattern.matcher(phoneNumber);
        System.out.println(phoneNumber);
        Boolean b = match.matches();
        System.out.println(b);
        return b;
    }

    public Boolean invalidphonenumberwithoutspace(String phoneNumber) {
        Pattern phonepattern1 = Pattern.compile(phoneNumberPattern);
        Matcher match = phonepattern1.matcher(phoneNumber);
        System.out.println(phoneNumber);
        Boolean b = match.matches();
        System.out.println(b);
        return b;
    }

    public Boolean invalidphonenumberwithoutspaceandCharacter(String phoneNumber) {
        Pattern phonepattern1 = Pattern.compile(phoneNumberPattern);
        Matcher match = phonepattern1.matcher(phoneNumber);
        System.out.println(phoneNumber);
        Boolean b = match.matches();
        System.out.println(b);
        return b;
    }

    public Boolean invalidphonenumberwithoutspaceandspecialCharacter(String phoneNumber) {
        Pattern phonepattern1 = Pattern.compile(phoneNumberPattern);
        Matcher match = phonepattern1.matcher(phoneNumber);
        System.out.println(phoneNumber);
        Boolean b = match.matches();
        System.out.println(b);
        return b;
    }

    public Boolean properphonenumber(String phoneNumber) {
        Pattern phonepattern1 = Pattern.compile(phoneNumberPattern);
        Matcher match = phonepattern1.matcher(phoneNumber);
        System.out.println(phoneNumber);
        Boolean b = match.matches();
        System.out.println(b);
        return b;
    }

    public Boolean invalidphonenumberwithmorenoofCOdenumber(String phoneNumber) {
        Pattern phonepattern1 = Pattern.compile(phoneNumberPattern);
        Matcher match = phonepattern1.matcher(phoneNumber);
        System.out.println(phoneNumber);
        Boolean b = match.matches();
        System.out.println(b);
        return b;
    }
}
