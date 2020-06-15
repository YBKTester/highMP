package com.imooc.lambda;

/**
 * 测试类
 * 1、需求改动
 * 所有用户验证，可以同时获取用户的验证信息【是否验证成功｜成功～返回用户｜null】
 *
 * @author yang bingkun
 * create on 2020/6/8
 */
public class Test {
    public static void main(String[] args) {
        IUSerCredential iuSerCredential = new IUSerCredentialImpl();
        System.out.println(iuSerCredential.verifyUser("admin"));
        System.out.println(iuSerCredential.getCredential("admin"));

        String msg = "hello world";
        IMessageFormat format = new IMessageFormatImpl();
        format.format(msg, "json");
//        匿名内部类，实现接口抽象方法
        IUSerCredential iuSerCredential2 = new IUSerCredentialImpl() {
            @Override
            public String verifyUser(String username) {
                return "admin".equals(username) ? "管理员" : "普通用户";
            }
        };
        System.out.println(iuSerCredential2.verifyUser("admin"));

        /*
        Lambda
         */
        IUSerCredential ic3 = (String username) -> "admin".equals(username) ? "管理员" : "会员";
        System.out.println(ic3.verifyUser("admin"));
        System.out.println(ic3.verifyUser("Bink"));


    }
}
