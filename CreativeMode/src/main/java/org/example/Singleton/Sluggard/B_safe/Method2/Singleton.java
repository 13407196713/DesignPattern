package org.example.Singleton.Sluggard.B_safe.Method2;

import lombok.Data;


/**
 * @要解决的问题：
 * @①这些线程可能会创建多个对象
 * @②某个线程可能会得到一个未完全初始化的对象
 */
@Data
public class Singleton {
    private static volatile Singleton singletone;
    // volatile 确保本条指令不会被编译器的优化而忽略,有了volatile
    // NSTANCE = new Lock2Singleton();这行代码在 JVM 层面有可能发生 1-3-2 的现象
    // volatile 禁止指令重排序，保证绝对的1-2-3顺序

    // https://blog.csdn.net/xueping_wu/article/details/124541419  volatile 特点介绍

    private Singleton(){
        System.out.println(Thread.currentThread().getName() + "执行Singleton()");
    }


    // https://blog.csdn.net/weixin_44471490/article/details/108929289 双校验/双重校验锁解释
    /**
     * @双校验/双重校验锁
     * @(DCL&emsp;double-checked&emsp;locking)&emsp;减小同步范围
     * @线程安全
     * @Singletone加锁了,防止被多次实例化
     * @防止AB两个线程同时对singletone判断为空，直接同时创建两次该实例对象
     */
    public static Singleton createInstance(){
        if (singletone == null) {
            synchronized(Singleton.class){
                if (singletone == null)
                    singletone = new Singleton();
            }
        }
        return singletone;
    }
}
