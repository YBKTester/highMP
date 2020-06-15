package com.imooc.lambda;

/**
 * 消息传格式转换接口
 *
 * @author yang bingkun
 * create on 2020/6/8
 */
@FunctionalInterface
public interface IMessageFormat {
    /**
     * 消息转换方法
     *
     * @param message 待处理的消息
     * @param format  转换格式【xml/json】
     */
    void format(String message, String format);

    /**
     * 消息合法性验证方法
     *
     * @param msg 待验证的消息
     * @return 返回验证结果
     */
    static boolean verifyMessage(String msg) {
        if (msg != null) {
            return true;
        }
        return false;
    }

    String toString();
}
