/**
 * 
 */
package com.tbbpportal.beta;

import android.app.Application;
import android.util.Log;
 
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParsePush;
import com.parse.SaveCallback;
 
/**
 * Created by Abdullah on 01.03.2015.
 */
public class ParseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "xc1QEEotUNkDV1NoK69pPydW9BeFEtBnsSz2A2kr", "LJDrDT9v9WOWyHvySkvuMBAS9Fpt1oBAGNiMLr3z");
        ParsePush.subscribeInBackground("", new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Log.d("com.parse.push", "successfully subscribed to the broadcast channel.");
                } else {
                    Log.e("com.parse.push", "failed to subscribe for push", e);
                }
            }
        });
    }
}