package com.cell.user.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JsonUtils {

    /**
     * 对象转JSON串
     * 
     * @param obj
     * @return
     */
    public static String obj2json(Object obj) {
        return JSONObject.toJSONString(obj, SerializerFeature.DisableCircularReferenceDetect);
    }

    /**
     * 对象转JSON串
     * 
     * @param obj
     * @return
     */
    public static String obj2json(Object obj, SerializerFeature... features) {
        return JSONObject.toJSONString(obj, features);
    }

    /**
     * JSON串转对象
     * 
     * @param json
     * @param clazz
     * @return
     */
    public static <T>T json2obj(String json, Class<T> clazz) {
        return JSONObject.parseObject(json, clazz);
    }

    /**
     * JSON串转对象
     * 
     * @param json
     * @param clazz
     * @return
     */
    public static <T>T json2obj(String json, TypeReference<T> type) {
        return JSONObject.parseObject(json, type);
    }

}
