package com.factory.hero;

import com.factory.ISkill;

/**
 * @author yang bingkun
 * create on 2020/6/10
 */
public class Irelia implements ISkill {
    public void q() {
        System.out.println("Irelia Q");
    }

    public void w() {
        System.out.println("Irelia W");
    }

    public void e() {
        System.out.println("Irelia E");
    }

    public void r() {
        System.out.println("Irelia R");
    }
}
