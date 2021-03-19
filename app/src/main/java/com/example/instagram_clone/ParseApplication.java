package com.example.instagram_clone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LGUH5dwUsmV1HspQ6zxrPu5IF2yKl6ysKgFZOt9J")
                .clientKey("cvm8aPCDTV52AquWcSaD1KCpnaLDb8jBvCuCcn9F")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
