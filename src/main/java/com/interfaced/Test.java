package com.interfaced;

/**
 * @author yang bingkun
 * create on 2020/6/15
 */
public class Test {
    public static void main(String[] args) {
        OneInterface oneInterface = new OneInterfaceImpl();
        System.out.println(oneInterface.hello("Bink"));
    }


}
