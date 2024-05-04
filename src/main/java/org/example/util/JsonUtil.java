package org.example.util;

import com.google.gson.Gson;

public class JsonUtil {
    private JsonUtil() {
    }

    public static Object stringToObject(String strObject, Class<?> object) {
        return new Gson().fromJson(strObject, object);
    }

}
