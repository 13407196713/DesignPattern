package org.example.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Debit zhangsan = new Zhangsan();
        zhangsan.borrow(new Lisi());
        zhangsan.borrow(new Wangwu());

        zhangsan.notifyCredits();
    }
}
