package com.yang.javadesignpatterns.Asingletons;

/**
 * @ClassName Mgr01
 * @Author yang
 * @Description 1 饿汉式
 *  类加载到内存后，就实例化为一个单例  JVM来保证线程安全
 *  简单实用，推荐实用
 *
 *  唯一缺点 不管使用与否，类加载时，就已经完成实例化
 *  （话说如果不用，就不需要装载它）
 * @Date 23/03/20 1:02
 * @Version v1.0
 **/


public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    // 构造方法私有化---其他类里面就不能使用 new 了
    private Mgr01(){}

    // 返回唯一实例
    public static Mgr01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        // 创建2个对象，来比较同一个类不同对象的 hash值
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();

        System.out.println(m1 == m2);
        System.out.println(m1.hashCode() );
        System.out.println(m1.hashCode() );
    }


}
