package com.yang.javadesignpatterns.Bstrategy;

/**
 * @ClassName DogMyComparator
 * @Author yang
 * @Description //TODO
 * @Date 23/03/22 1:26
 * @Version v1.0
 **/


public class DogMyComparator implements  MyComparator<Dog>{
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getWeight() > o2.getWeight()) return 1;
        else if (o1.getWeight() < o2.getWeight()) return -1;
        else return 0;
    }
}
