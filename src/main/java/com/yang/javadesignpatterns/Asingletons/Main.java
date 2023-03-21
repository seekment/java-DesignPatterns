package com.yang.javadesignpatterns.Asingletons;

/**
 * @ClassName Main
 * @Author yang
 * @Description //TODO
 * @Date 23/03/20 0:58
 * @Version v1.0
 **/


public class Main {
    public static void main(String[] args) {
        // 不能直接new 只能get
        // Mgr01 mgr01 = new Mgr01();
        Mgr01 mgr01 =  Mgr01.getInstance();
    }
}
