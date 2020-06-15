package com.imooc.lambda;

import java.util.UUID;
import java.util.function.*;

/**
 * Match
 *
 * @author yang bingkun
 * create on 2020/6/8
 */
public class Demo {
    public static void main(String[] args) {
//        /*
//        1、传统模式，创建线程
//         */
//        new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                System.out.println("Threading..." + Thread.currentThread().getId());
//            }
//        }
//        ).start();
//
//         /*
//        2、JDK8新特性，Lambda表达式优化创建线程
//         */
//        new Thread(() -> System.out.println("Lambda Threading..." + Thread.currentThread().getId())).start();
//    }

        Predicate<String> predicate = "admin"::equals;
        System.out.println(predicate.test("admin"));
        System.out.println(predicate.test("Bink"));
        Consumer<String> consumer = (String message) -> {
            System.out.println("要发送的消息： " + message);
            System.out.println("消息发送完成！");
        };

        consumer.accept("hello Bink...");
        consumer.accept("imooc lambda...");

        Function<String, Integer> function = (String gender) -> "male".equals(gender) ? 1 : 0;
        System.out.println(function.apply("male"));
        System.out.println(function.apply("female"));

        Supplier<String> supplier = () -> UUID.randomUUID().toString();
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        UnaryOperator<String> unaryOperator = (String img) -> {
            img += "[100X200]";
            return img;
        };
        System.out.println(unaryOperator.apply("原图--"));

        BinaryOperator<Integer> binaryOperator = (Integer x, Integer y) -> x > y ? x : y;


    }
}
