package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Pattern pattern;
    Matcher matcher;
    public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    public static final String EMAIL_PATTERN = "^([a-z]{3}[.][a-z]{3}@[a-z]{2}[.][a-z]{2}[.][a-z]{2})$";

    public static final String MOBILE_PATTERN = "^[0-9]{2}\\s[0-9]{10}$";
    public static final String RULE1_PATTERN = "^\\w(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%&!]).{8,}$";

    public static final String RULE2_PATTERN = "^\\w(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%&!]).{8,}$";

    public static final String RULE3_PATTERN = "^\\w(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%&!]).{8,}$";

    public static final String RULE4_PATTERN = "^\\w(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%&!]).{8,}$";
    public static final String RULE5_PATTERN = "^\\w(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%&!]).{8,}$";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean validateEmail(String email) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validateMobileNumber(String phoneNumber) {
        pattern = Pattern.compile(MOBILE_PATTERN);
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }


    public boolean validateRule1(String rule1) {
        pattern = Pattern.compile(RULE1_PATTERN);
        matcher = pattern.matcher(rule1);
        return matcher.matches();
    }
    public boolean validateRule2(String rule2) {
        Pattern pattern = Pattern.compile(RULE2_PATTERN);
        Matcher matcher = pattern.matcher(rule2);
        return matcher.matches();
    }

    public boolean validateRule3(String rule3) {
        Pattern pattern = Pattern.compile(RULE3_PATTERN);
        Matcher matcher = pattern.matcher(rule3);
        return matcher.matches();
    }

    public boolean validateRule4(String rule4) {
        Pattern pattern = Pattern.compile(RULE4_PATTERN);
        Matcher matcher = pattern.matcher(rule4);
        return matcher.matches();
    }
}










