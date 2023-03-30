package org.example.FlyweightPattern;

public class Main {
    public static void main(String[] args) {
        BikeFlyWeight bikeFlyWeight1 = BikeFlyWeightFactory.getInstance().getBike();
        bikeFlyWeight1.ride("张三");
//        bikeFlyWeight1.back();

        BikeFlyWeight bikeFlyWeight2 = BikeFlyWeightFactory.getInstance().getBike();
        bikeFlyWeight2.ride("李四");

//        BikeFlyWeight bikeFlyWeight3 = BikeFlyWeightFactory.getInstance().getBike();
//        bikeFlyWeight3.ride("王五");
    }
}
