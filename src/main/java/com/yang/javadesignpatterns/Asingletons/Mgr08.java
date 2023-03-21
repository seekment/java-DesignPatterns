package com.yang.javadesignpatterns.Asingletons;

/**
 * @ClassName Mgr07
 * @Author yang
 * @Description 9 枚举实现-完美中的完美
 *
 *JVM 保证单例
* （枚举单例实现，还能防止序列化与反序列化）
 * why：因为枚举类没有构造方法，所以不能进行，反射与不行。反编译后它是 Abstract class
 * @Date 23/03/20 1:02
 * @Version v1.0
 **/


public enum Mgr08 {
    // 返回唯一实例
    INSTANCE;
    public static void main(String[] args) {
            for (int i = 0; i < 100; i++) {
                new Thread(() ->{
                    // 每个线程都需要 把该实例的 hash value 打印出来，期望是都一样，实际是都一样
                    System.out.println(Mgr08.INSTANCE.hashCode());
                }).start();
            }
        }


}
