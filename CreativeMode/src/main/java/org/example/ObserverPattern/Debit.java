package org.example.ObserverPattern;

// 欠钱的人
public interface Debit {
    void borrow(Credit credit);
    void notifyCredits();
}
