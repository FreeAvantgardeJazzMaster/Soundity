package com.example.adam.soundity.AppMemory;

import com.example.adam.soundity.DataModel.User;

public class AppMemory {

    public static User cuurentUser;

    public static User getCuurentUser() {
        return cuurentUser;
    }

    public static void setCuurentUser(User cuurentUser) {
        AppMemory.cuurentUser = cuurentUser;
    }
}
