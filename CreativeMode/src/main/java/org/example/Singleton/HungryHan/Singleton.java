package org.example.Singleton.HungryHan;

import lombok.Data;

/**
 * 单例模式 - 饿汉式
 */
@Data
public class Singleton {
    /**
     * 类加载时，立即加载实例对象
     */
    public static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println(Thread.currentThread().getName() + "执行Singleton()");
    }

    public static Singleton createInstance(){
        return singleton;
    }

}
