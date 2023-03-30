package org.example.FlyweightPattern;

import java.util.Objects;

public class MoBikeFlyWeight extends BikeFlyWeight{
    // 定义本辆车的状态
    private String bikeId;
    public MoBikeFlyWeight(String bikeId){
        this.bikeId = bikeId;
    }


    @Override
    void ride(String Username) {
        state = 1;
        System.out.println(Username + " 正在骑行 " + bikeId + " 号车");
    }

    @Override
    void back() {
        state = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MoBikeFlyWeight that = (MoBikeFlyWeight) o;
        return Objects.equals(bikeId, that.bikeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bikeId);
    }
}
