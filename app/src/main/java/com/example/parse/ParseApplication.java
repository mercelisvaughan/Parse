package com.example.parse;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ZdPFbDFLLm2R2v4WZYDSDGp2T51e8HqGdnFMXLmD")
                .clientKey("qOxBksbCDFpy1RlNM8KYqnV4mj1HdoY3hJmO1gCE")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}