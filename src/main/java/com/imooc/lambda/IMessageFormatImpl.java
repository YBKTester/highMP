package com.imooc.lambda;

/**
 * @author yang bingkun
 * create on 2020/6/8
 */
public class IMessageFormatImpl implements IMessageFormat {
    @Override
    public String format(String message, String format) {
        System.out.println("消息转换。。。");
        return message;
    }
}
