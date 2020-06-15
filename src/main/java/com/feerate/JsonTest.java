package com.feerate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


import java.io.*;
import java.util.Objects;

/**
 * 测试JSON
 *
 * @author yang bingkun
 * create on 2020/6/10
 */
public class JsonTest {
    public static void main(String[] args) {
        String path = Objects.requireNonNull(JsonTest.class.getClassLoader().getResource("Movie.json")).getPath();
        String s = readJsonFile(path);
        JSONObject jobj = JSON.parseObject(s);
        /*
        构建JSONArray数组
         */
        JSONArray movies = jobj.getJSONArray("RECORDS");
        movies.stream().map(movie -> {
            return (JSONObject) movie;
        }).forEach(key -> {
            int eFee = (int) key.get("eFee");
            System.out.println(eFee);
        });
        int a = 2462 + 2182 + 699 +
                +401
                + 3681
                + 1316
                + 2168
                + 422
                + 1359
                + 1267
                + 945
                + 1977;
        System.out.println(a);
    }


    /**
     * 读取json文件
     *
     * @param fileName 文件名
     * @return 返回字段
     */
    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile), "utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
