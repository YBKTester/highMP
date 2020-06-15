package com.interfaced;

/**
 * @author yang bingkun
 * create on 2020/6/15
 */
public class OneInterfaceImpl implements OneInterface {
    @Override
    public String hello(String name) {
        return "Hello" + name;
    }
}
