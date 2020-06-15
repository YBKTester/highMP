package com.imooc.lambda;

/**
 * 实现接口
 *
 * @author yang bingkun
 * create on 2020/6/8
 */
public class IUSerCredentialImpl implements IUSerCredential {
    @Override
    public String verifyUser(String username) {
        if ("admin".equals(username)) {
            return "系统管理员";
        } else if ("manager".equals(username)) {
            return "用户管理员";
        }
        return "普通用户";
    }
}
