package com.example.tripreminder.database;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DataBase {

    static FirebaseDatabase dp=FirebaseDatabase.getInstance();
    static String USER_REF="Users";
    static String USER_Info_REF="Info";
    static String USER_Trip_REF="Trips";
    public static DatabaseReference getUsers(){
        return dp.getReference().child(USER_REF);
    }


}