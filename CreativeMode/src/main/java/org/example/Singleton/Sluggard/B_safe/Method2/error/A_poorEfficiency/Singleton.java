package org.example.Singleton.Sluggard.B_safe.Method2.error.A_poorEfficiency;

import lombok.Data;


@Data
public class Singleton {
    private static volatile Singleton singletone;

    private Singleton(){
        System.out.println(Thread.currentThread().getName() + "执行Singleton()");
    }


    public static Singleton createInstance(){
        synchronized(Singleton.class){ // 第一次后，当已有实例对象，每次先加锁 再判断，加锁是非常影响效率的！
            if (singletone == null)
                singletone = new Singleton();
        }
        return singletone;
    }
}
