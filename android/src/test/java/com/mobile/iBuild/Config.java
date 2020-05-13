package com.mobile.iBuild;

import java.util.Map;

public class Config {
    private static Map<String, String> env = System.getenv();

    private static String getKey(final String key) throws Exception {
        if( env.containsKey(key) ) {
            return env.get(key);
        } else {
            throw new Exception("Expected environment variable '" + key + "' to be set");
        }
    }

    public static String getEndpointPath() throws Exception {
        return ("https://app-uat.ibuild.global/");
    }
    public static String getReferralCode() throws Exception {
        return ("PRO190");
    }
    public static String getPIN () throws Exception {
        return ("1234");
    }

    //Existing account parameters
    public static String getPhoneNo() throws Exception {
        return ("700252512");
    }
    public static String getOldPIN() throws Exception {
        return ("1234");
    }
    public static String googleLocation()  throws Exception {
        return  ("Wajir");
    }


}
