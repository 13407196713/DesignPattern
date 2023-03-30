package org.example.FlyweightPattern;

import java.util.HashSet;

public class BikeFlyWeightFactory {
    private static BikeFlyWeightFactory instance= new BikeFlyWeightFactory();

    public static BikeFlyWeightFactory getInstance(){
        return instance;
    }

    private HashSet<MoBikeFlyWeight> pool = new HashSet<>();

    private BikeFlyWeightFactory(){
        for (int i = 0; i < 2; i++) {
            pool.add(new MoBikeFlyWeight(String.valueOf(4)));
        }
        pool.add(new MoBikeFlyWeight(String.valueOf(5)));

        System.out.println(new MoBikeFlyWeight(String.valueOf(5)) == new MoBikeFlyWeight(String.valueOf(4)));
    }


    public BikeFlyWeight getBike(){
        for (BikeFlyWeight bike: pool) {
            if (bike.getState() == 0)
                return bike;
        }
        return null;
    }


}
