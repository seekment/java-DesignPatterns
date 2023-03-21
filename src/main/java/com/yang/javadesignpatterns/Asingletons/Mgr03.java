package com.yang.javadesignpatterns.Asingletons;

/**
 * @ClassName Mgr01
 * @Author yang
 * @Description 3 懒汉式
 *
 *
 *  lazy load 懒加载方式。
 *
 *  虽然达到了按需加载的方式，但是却带来了线程不安全的问题
 * @Date 23/03/20 1:02
 * @Version v1.0
 **/


public class Mgr03 {
    private static  Mgr03 INSTANCE;


    private Mgr03(){}

    // 返回唯一实例
    public static Mgr03 getInstance(){
        // 多线程可能不安全，2个线程会同时进入if
        if (INSTANCE == null){

            // 测试多线程场景
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
//        // 创建2个对象，来比较同一个类不同对象的 hash值
//        Mgr03 m1 = Mgr03.getInstance();
//        Mgr03 m2 = Mgr03.getInstance();
//
//        System.out.println(m1 == m2);
//        System.out.println(m1.hashCode() );
//        System.out.println(m1.hashCode() );
        for (int i = 0; i < 100; i++) {
            new Thread(() ->{
                // 每个线程都需要 把该实例的 hash value 打印出来，期望是都一样，实际是都一样
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }


}
