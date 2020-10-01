package com.designpattern.singleton.test;

import com.designpattern.singleton.*;

public class SingletonMain {
    public static void main(String[] args) {
        //线程不安全的懒汉式
        LazySingleton.getInstance().setName("张三");
        System.out.println(LazySingleton.getInstance().getName());
        //线程安全的懒汉式
        LazySingletonSafe.getInstance().setName("李四");
        System.out.println(LazySingletonSafe.getInstance().getName());
        //饿汉式
        HungrySingleton.getInstance().setName("王五");
        System.out.println(HungrySingleton.getInstance().getName());
        //双重校验锁
        DoubleCheckLocking.getSingleton().setName("赵六");
        System.out.println(DoubleCheckLocking.getSingleton().getName());
        //静态类
        StaticSingleton.getInstance().setName("钱七");
        System.out.println(StaticSingleton.getInstance().getName());
        //枚举

    }
}
