package org.example.util;

import com.google.gson.Gson;
import org.json.JSONObject;

public class JsonUtil {
    private JsonUtil() {
    }

    public static String objectToString(Object obj) {
        String jsonInString = new Gson().toJson(obj);
        JSONObject mJSonOject = new JSONObject(jsonInString);
        return mJSonOject.toString();
    }

    public static Object stringToObject(String strObject, Class<?> object) {
        return new Gson().fromJson(strObject, object);
    }

}
