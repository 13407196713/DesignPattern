package org.example.Singleton.Sluggard.B_safe.Method2.error.B_error;

import lombok.Data;


@Data
public class Singleton {
    private static volatile Singleton singletone;

    private Singleton(){
        System.out.println(Thread.currentThread().getName() + "执行Singleton()");
    }

    public static Singleton createInstance(){
        if (singletone == null) {
            synchronized(Singleton.class){
                // 先判断 后直接新建，这是错误的
                // 因为这里只对 singletone = new Singleton(); 加锁了
                // 两个线程可以都同时判断singletone为空，再先后依次 singletone = new Singleton()
                singletone = new Singleton();
            }
        }
        return singletone;
    }
}
