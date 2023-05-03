package com.yang.javadesignpatterns.CfactorySeries.simpleFactory;

/**
 * @ClassName Main
 * @Author yang
 * @Description //TODO
 * @Date 23/05/04 0:09
 * @Version v1.0
 **/


public class Main {
    public static void main(String[] args) {
        // 1 现在选择开车
        Car car = new Car();
        car.go();

        // 2 现在选择开飞机
        Plane plane = new Plane();
        plane.go();
        // 3 现在选择开火箭
       // 比较麻烦
    }
// 这里面使用接口，多态即可
    public static void main2(String[] args) {
        // 1 现在选择开车
        Moveable move = new Car();
        move.go();
    }
}
