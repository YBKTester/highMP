package com.lol;

import com.factory.ISkill;
import com.factory.hero.HeroFactory;

import java.util.Scanner;

/**
 * 英雄联盟
 * League Of Legends
 *
 * @author yang bingkun
 * create on 2020/6/10
 */
public class Legends {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        String name = getPlayerInput();
        ISkill iSkill = HeroFactory.getHero(name);
        iSkill.r();
    }

    /**
     * 获取玩家输入信息
     *
     * @return 英雄名称
     */
    private static String getPlayerInput() {
        System.out.println("Enter a Hero`s Name:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
