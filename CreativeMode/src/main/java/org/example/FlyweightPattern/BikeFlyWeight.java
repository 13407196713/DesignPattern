package org.example.FlyweightPattern;

import lombok.Data;

@Data
abstract public class BikeFlyWeight {
    
    protected Integer state = 0; // 0 未使用; 1 骑行中

    public Integer getState(){
        return state;
    }
    
    abstract void ride(String Username);
    abstract void back();
    
}
