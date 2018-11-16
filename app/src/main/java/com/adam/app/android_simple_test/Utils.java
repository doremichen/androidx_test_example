package com.adam.app.android_simple_test;

import android.util.Log;

public abstract class Utils {

    private static final String TAG = "TestDemo";

    public static void inFo(Object obj, String str) {
        Log.i(TAG, obj.getClass().getSimpleName() + ": " + str);
    }

    public static void inFo(Class<?> clazz, String str) {
        Log.i(TAG, clazz.getSimpleName() + ": " + str);
    }

    public static boolean isStringEmpty(String str) {
        return "".equals(str);
    }

}
