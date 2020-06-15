package com.factory.hero;

import com.factory.ISkill;

/**
 * 工厂类
 * 解决实例化
 *
 * @author yang bingkun
 * create on 2020/6/10
 */
public class HeroFactory {
    public static ISkill getHero(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ISkill iSkill;
        /*
        元类：描述一个类
         */
        String classStr = "com.factory.hero." + name;
        Class<?> cla = Class.forName(classStr);
        Object object = cla.newInstance();
        return (ISkill) object;
    }
}
