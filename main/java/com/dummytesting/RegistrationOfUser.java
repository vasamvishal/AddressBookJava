package com.dummytesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationOfUser {
    private String passwordvalidator="((?=.*[0-9])(?=.*[a-z]*)(?=.*[A-Z])(?=.*[@#$%]).{8,})";
    private String emailvalidatorname = "^[a-zA-Z]{1,}[0-9]*([._+-]{1}[a-zA-Z0-9]+){0,1}[@][a-zA-Z0-9]+[.][a-z]{2,4}([.][a-z]{2}){0,1}$";
    public Boolean validate_Email_Id(String email) {
        Pattern emailvalidator = Pattern.compile(emailvalidatorname);
        Matcher match = emailvalidator.matcher(email);
        System.out.println(emailvalidatorname);
        Boolean check = match.matches();
        System.out.println(check);
        return check;

    }

    public Boolean validate_Password(String password) {
        Pattern passwordtestvalidator = Pattern.compile(emailvalidatorname);
        Matcher match = passwordtestvalidator.matcher(password);
        System.out.println(passwordvalidator);
        Boolean check = match.matches();
        System.out.println(check);
        return check;
    }
}
