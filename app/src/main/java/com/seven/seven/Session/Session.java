package com.seven.seven.Session;

import android.content.Context;
import android.content.SharedPreferences;

public class Session {


    public final  String fileName = "userData";
    public static  final  String userId = "userId";

    Context context;
    public SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    public Session(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.apply();
    }




    public  void setUserId(String userId2 ){
        editor.putString( userId, userId2);
        editor.commit();
        editor.apply();
    }


    public  String getUserId(){
        return  sharedPreferences.getString(userId,"");
    }


}
