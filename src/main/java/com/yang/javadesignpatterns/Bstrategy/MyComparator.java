package com.yang.javadesignpatterns.Bstrategy;

/**
 * @ClassName MyComparator
 * @Author yang
 * @Description //TODO
 * @Date 23/03/22 1:20
 * @Version v1.0
 **/

// 比较器 不是普通接口，用来做策略模式
// 多态是设计模式的核心，只有少数几种不是多态实现
public interface MyComparator<F> {
    int compare(F  o1, F o2);
}
