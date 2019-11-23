package com.dummytesting;

import jdk.internal.jline.internal.TestAccessible;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexchecking {

    String firstname = "^[A-Z]{1}[0-9a-zA-Z]{2,}$";
    String emailvalidatorname = "^[a-zA-Z]{1,}[0-9]*([._+-]{1}[a-zA-Z0-9]+){0,1}[@][a-zA-Z0-9]+[.][a-z]{2,4}([.][a-z]{2}){0,1}$";


    public Boolean checkfirstname(String fname) {
        Pattern firstnamepattern = Pattern.compile(firstname);
        System.out.println(fname);
        Matcher match = firstnamepattern.matcher(fname);
        Boolean b = match.matches();
        System.out.println(b);
        return b;
    }

    public Boolean checkfirstnamenumber(String fname) {
        Pattern firstnamepattern = Pattern.compile(firstname);
        System.out.println(fname);
        Matcher match = firstnamepattern.matcher(fname);
        Boolean b = match.matches();
        System.out.println(b);
        return b;
    }

    public Boolean checkwrongfirstname(String fname) {

        Pattern firstnamepattern = Pattern.compile(firstname);
        Matcher match = firstnamepattern.matcher(fname);
        System.out.println(fname);
        Boolean b = match.matches();
        System.out.println(b);
        return b;
    }

//    public Boolean checkforwrongemail(String emailname) {
//        Pattern rightemail=Pattern.compile(emailvalidation);
//        Matcher match=rightemail.matcher(emailname);
//        System.out.println(emailname);
//        Boolean check=match.matches();
//        System.out.println(check);
//        return check;
//    }

    public Boolean checkfirstnameandnumber(String fname) {
        Pattern firstnamepattern = Pattern.compile(firstname);
        Matcher match = firstnamepattern.matcher(fname);
        System.out.println(fname);
        Boolean b = match.matches();
        System.out.println(b);
        return b;
    }

    public Boolean checkfirstnameandnumberandcaps(String fname) {
        Pattern firstnamepattern = Pattern.compile(firstname);
        Matcher match = firstnamepattern.matcher(fname);
        System.out.println(fname);
        Boolean b = match.matches();
        System.out.println(b);
        return b;

    }

    public Boolean checkwrongfirstnameandletterlessthan2(String fname) {
        Pattern firstnamepattern = Pattern.compile(firstname);
        Matcher match = firstnamepattern.matcher(fname);
        System.out.println(fname);
        Boolean b = match.matches();
        System.out.println(b);
        return b;
    }

    public Boolean checkwrongfirstname_withsmallcharacter(String fname) {
        Pattern firstnamepattern = Pattern.compile(firstname);
        Matcher match = firstnamepattern.matcher(fname);
        System.out.println(fname);
        Boolean b = match.matches();
        System.out.println(b);
        return b;
    }

    public Boolean checkproperemail(String email) {
        Pattern emailvalidator = Pattern.compile(emailvalidatorname);
        Matcher match = emailvalidator.matcher(email);
        System.out.println(emailvalidatorname);
        Boolean check = match.matches();
        System.out.println(check);
        return check;

    }

    public Boolean checkproperemailandoptionallastname(String email) {
        Pattern emailvalidator = Pattern.compile(emailvalidatorname);
        Matcher match = emailvalidator.matcher(email);
        System.out.println(emailvalidatorname);
        Boolean check = match.matches();
        System.out.println(check);
        return check;
    }

    public Boolean checkproperemailandoptionalcountrycode(String email) {

        Pattern emailvalidator = Pattern.compile(emailvalidatorname);
        Matcher match = emailvalidator.matcher(email);
        System.out.println(emailvalidatorname);
        Boolean check = match.matches();
        System.out.println(check);
        return check;
    }
}