package org.example.Singleton.Sluggard.A_unsafe;

import lombok.Data;

@Data
public class Singleton {
    private static Singleton singletone;
    private Singleton(){
        System.out.println(Thread.currentThread().getName() + "执行Singleton()");
    }

    /**
     * 单线程安全，多线程不安全
     * @AB两个线程同时对singletone判断为空，直接同时创建两次该实例对象 = 同步
     */
    public static Singleton createInstance(){
        if (singletone == null) singletone = new Singleton();
        return singletone;
    }
}
