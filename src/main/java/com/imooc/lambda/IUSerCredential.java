package com.imooc.lambda;

/**
 * 用户身份认证标记接口
 * 函数式接口仅允许接口内存在一个未实现的方法
 * 不包含默认方法 default
 * 静态方法
 *
 * @author yang bingkun
 * create on 2020/6/8
 */
@FunctionalInterface
public interface IUSerCredential {
    /**
     * 通过用户账号，验证用户身份信息的接口
     *
     * @param username 要验证的用户账号
     * @return 返回身份信息【系统管理员、用户管理员、普通用户】
     */
    String verifyUser(String username);

    /**
     * 默认方法
     *
     * @param username 待验证的用户名
     * @return 返回用户信息+验证结果
     */
    default String getCredential(String username) {
        if ("admin".equals(username)) {
            return "admin + 系统管理员";
        } else if ("manager".equals(username)) {
            return "manager + 用户管理员";
        }
        return "commons + 普通用户";
    }
}
