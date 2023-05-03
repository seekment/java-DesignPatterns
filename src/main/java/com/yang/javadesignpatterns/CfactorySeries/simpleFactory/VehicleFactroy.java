package com.yang.javadesignpatterns.CfactorySeries.simpleFactory;

/**
 * @ClassName VehicleFactroy
 * @Author yang
 * @Description //TODO
 * @Date 23/05/04 0:16
 * @Version v1.0
 **/
//简单工厂

public class VehicleFactroy {

    public  Car createCar(){
        // before processing
        return new Car();
    }

    public  Plane createPlane(){
        // before processing
        return new Plane();
    }
}
