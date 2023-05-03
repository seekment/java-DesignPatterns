package com.yang.javadesignpatterns.Bstrategy;

/**
 * @ClassName Dog
 * @Author yang
 * @Description //TODO
 * @Date 23/03/22 1:25
 * @Version v1.0
 **/


public class Dog {
    private int weight;
    private int height;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
