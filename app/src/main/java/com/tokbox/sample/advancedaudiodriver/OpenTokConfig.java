package com.tokbox.sample.advancedaudiodriver;

import android.text.TextUtils;
import androidx.annotation.NonNull;

public class OpenTokConfig {
    /*
    Fill the following variables using your own Project info from the OpenTok dashboard
    https://dashboard.tokbox.com/projects
    */

    public static final String API_KEY = "47306404";
    public static final String SESSION_ID= "2_MX40NzMwNjQwNH5-MTYzMjEzNzY3MDIzMn40blh4TmQxcDlLaW1uMHZKN3UzYmpVR01-fg";
    public static final String TOKEN = "T1==cGFydG5lcl9pZD00NzMwNjQwNCZzaWc9NWQ5YTc4ZGY2NjU4MGZmNzNhYmY2ZjJhYjJiYmI2ZDVkZDQyOWE1MzpzZXNzaW9uX2lkPTJfTVg0ME56TXdOalF3Tkg1LU1UWXpNakV6TnpZM01ESXpNbjQwYmxoNFRtUXhjRGxMYVcxdU1IWktOM1V6WW1wVlIwMS1mZyZjcmVhdGVfdGltZT0xNjQzMDM2MTIyJm5vbmNlPTAuMjk0NjYwOTYyMTE4NzA5NzMmcm9sZT1wdWJsaXNoZXImZXhwaXJlX3RpbWU9MTY0MzEyMjUyMiZpbml0aWFsX2xheW91dF9jbGFzc19saXN0PQ==";

    public static boolean isValid() {
        if (TextUtils.isEmpty(OpenTokConfig.API_KEY)
                || TextUtils.isEmpty(OpenTokConfig.SESSION_ID)
                || TextUtils.isEmpty(OpenTokConfig.TOKEN)) {
            return false;
        }

        return true;
    }

    @NonNull
    public static String getDescription() {
        return "OpenTokConfig:" + "\n"
                + "API_KEY: " + OpenTokConfig.API_KEY + "\n"
                + "SESSION_ID: " + OpenTokConfig.SESSION_ID + "\n"
                + "TOKEN: " + OpenTokConfig.TOKEN + "\n";
    }
}
