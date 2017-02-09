package com.ikkong.adgo.helper.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.ikkong.adgo.helper.TLog;

import java.lang.reflect.Type;

/**
 * Created by qiujuer
 * on 2016/11/22.
 */
public class StringJsonDeserializer implements JsonDeserializer<String> {
    @Override
    public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
            return json.getAsString();
        } catch (Exception e) {
            TLog.log("StringJsonDeserializer-deserialize-error:" + (json != null ? json.toString() : ""));
            return null;
        }
    }
}