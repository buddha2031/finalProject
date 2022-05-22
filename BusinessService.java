package com.zorba.finalProject;

public class BusinessService {
    boolean flag = false;

    public boolean validationName(String custName) {

        if (custName != null) {
            flag = true;
        } else {
            flag = false;
        }
        return false;
    }

    public boolean validationMobilenumber(String custMobString) {
        if (custMobString.length() == 10) {
            flag = true;

        } else {
            flag = false;
            System.out.println("Invalid Mob Number");
        }
        return false;
    }
}


