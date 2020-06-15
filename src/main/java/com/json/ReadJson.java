package com.json;

import ch.qos.logback.core.util.FileUtil;

import java.io.File;

/**
 * 读取JSON
 *
 * @author yang bingkun
 * create on 2020/6/15
 */
public class ReadJson {
    public static void main(String[] args) {
        File file = new File(
                ReadJson.class.
                        getResource("/wangxiaoer.json").
                        getFile());
    }
}
