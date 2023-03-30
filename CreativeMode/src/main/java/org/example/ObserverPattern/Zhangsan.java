package org.example.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Zhangsan implements Debit{

    private List<Credit> allCredits = new ArrayList<>();
    private Integer state = 0; // 0 没钱; 1 有钱

    @Override
    public void borrow(Credit credit) {
        allCredits.add(credit);
    }

    @Override
    public void notifyCredits() {
        allCredits.forEach(credit -> credit.takeMoney());
    }
}
