package com.yang.javadesignpatterns.Asingletons;

/**
 * @ClassName Mgr04
 * @Author yang
 * @Descriptionv 5 加了同步锁(模块维度)
 *
 *
 *  lazy load 懒加载方式。
 * @Date 23/03/20 1:02
 * @Version v1.0
 **/


public class Mgr05 {
    private static Mgr05 INSTANCE;


    private Mgr05(){}

    // 返回唯一实例
    public static synchronized Mgr05 getInstance(){
        // 多线程可能不安全，2个线程会同时进入if
        if (INSTANCE == null){

         // 方法维度加锁， 但还是会线程不安全
            synchronized (Mgr05.class){
                // 测试多线程场景
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }

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
                    System.out.println(Mgr05.getInstance().hashCode());
                }).start();
            }
        }


}
