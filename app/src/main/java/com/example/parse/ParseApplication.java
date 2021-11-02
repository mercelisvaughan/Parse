package com.example.parse;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseUser;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("gD5cV1OnYe1yberMDg8iqCIMt8fmbTUjuFlfuaVa")
                .clientKey("abRj4kOmTumQEz5bcvOkk3znkYu0gFnf8czxdIDP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}