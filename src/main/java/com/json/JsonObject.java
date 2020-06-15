package com.json;

import com.alibaba.fastjson.JSONObject;

/**
 * @author yang bingkun
 * create on 2020/6/15
 */
public class JsonObject {
    //    {
//        "name": "王小二",
//            "age": 25.2,
//            "birthday": "1990-01-01",
//            "school": "兰香技校",
//            "major": [
//        "理发",
//                "挖掘机"
//  ],
//        "has_girlfriend": false,
//            "car": null,
//            "house": null,
//            "comment": "这是一条注释"
//    }
    public static void main(String[] args) {
        JSONObject();
    }

    private static void JSONObject() {
        JSONObject waxier = new JSONObject();
        Object nullobj = null;
        waxier.put("name", "王小二");
        waxier.put("age", 25.2);
        waxier.put("birthday", "1990-01-01");
        waxier.put("school", "兰香技校");
        waxier.put("major", new String[]{"理发", "挖掘机"});
        waxier.put("has_girlfriend", false);
        waxier.put("car", "");
        waxier.put("house", "");
        waxier.put("comment", "这是一条注释");
        System.out.println(waxier.toString());
    }

}
