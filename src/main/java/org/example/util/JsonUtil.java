/*
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package org.example.util;

import com.google.gson.Gson;
import org.json.JSONObject;

public class JsonUtil {
    private JsonUtil() {
    }

    public static String objectToString(Object obj){
        String jsonInString = new Gson().toJson(obj);
        JSONObject mJSonOject = new JSONObject(jsonInString);
        return mJSonOject.toString();
    }

    public static Object stringToObject(String strObject, Class<?> object){
      return  new Gson().fromJson(strObject, object);
    }

}
