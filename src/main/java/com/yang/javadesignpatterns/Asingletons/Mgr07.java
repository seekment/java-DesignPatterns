package com.yang.javadesignpatterns.Asingletons;

/**
 * @ClassName Mgr07
 * @Author yang
 * @Description 8 静态内部类方式实现
 *
 *JVM 保证单例
 *
 *
 *  lazy load 懒加载方式。 调用时候才会被执行（内部类才会被加载，Mgr07装载时不会）
 * @Date 23/03/20 1:02
 * @Version v1.0
 **/


public class Mgr07 {
    // 需要加 volatile 防止指令重排
    private static  volatile Mgr07 INSTANCE;


    private Mgr07(){}

    static final class Mgr08Holder{
        private final static Mgr07 INSTANCE = new Mgr07();
    }
    // 返回唯一实例
    public static Mgr07 getInstance(){
        return Mgr08Holder.INSTANCE;
    }

        public static void main(String[] args) {
            for (int i = 0; i < 100; i++) {
                new Thread(() ->{
                    // 每个线程都需要 把该实例的 hash value 打印出来，期望是都一样，实际是都一样
                    System.out.println(Mgr07.getInstance().hashCode());
                }).start();
            }
        }


}
