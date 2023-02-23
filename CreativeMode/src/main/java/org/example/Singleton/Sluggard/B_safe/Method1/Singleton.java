package org.example.Singleton.Sluggard.B_safe.Method1;

import lombok.Data;

@Data
public class Singleton {
    private static Singleton singletone;
    private Singleton(){
        System.out.println(Thread.currentThread().getName() + "执行Singleton()");
    }

    /**
     * @线程安全
     * @Singletone加锁了,防止被多次实例化
     * @防止AB两个线程同时对singletone判断为空，直接同时创建两次该实例对象 = 同步
     */
    public static synchronized Singleton createInstance(){
        if (singletone == null) singletone = new Singleton();
        return singletone;
    }
}
